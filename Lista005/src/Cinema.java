import java.util.ArrayList;

public class Cinema {
    private ArrayList<Filme> filmesDisponiveis = new ArrayList<>();
    private ArrayList<Ingresso> ingressosVendidos = new ArrayList<>();

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public Filme buscarFilme(String nomeFilme) {
        for (Filme f : filmesDisponiveis) {
            if (f.getNome().equalsIgnoreCase(nomeFilme)) {
                return f;
            }
        }
        return null;
    }

    public void venderIngresso(Cliente cliente, Filme filme, String assento) throws Exception {
        assento = assento.trim().toUpperCase();
        if (!assento.matches("^[A-F][1-5]$")) {
            throw new Exception("O assento informado é inválido! Use de A1 até F5.");
        }


        if (cliente.getIdade() < filme.getIdadeMinima()) {
            throw new Exception("O ingresso não pode ser vendido pois sua idade não permite!");
        }

        for (Ingresso i : ingressosVendidos) {
            if (i.getAssento().equalsIgnoreCase(assento)) {
                throw new Exception("O ingresso não pode ser vendido pois seu assento não está mais disponível!");
            }
        }

        Ingresso ingresso = new Ingresso(cliente, filme, assento);
        ingressosVendidos.add(ingresso);

        System.out.println("Ingresso vendido com sucesso! " + ingresso);
    }
}