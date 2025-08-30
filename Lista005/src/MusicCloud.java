import java.util.ArrayList;

public class MusicCloud {
    private ArrayList<Musica> musicasDisponiveis;

    public MusicCloud() {
        musicasDisponiveis = new ArrayList<>();
        // adicionando músicas disponíveis
        musicasDisponiveis.add(new Musica("Hino do Real Paulista", "Desconhecido"));
        musicasDisponiveis.add(new Musica("Macarena", "Los del Río"));
        musicasDisponiveis.add(new Musica("Evidências", "Chitãozinho & Xororó"));
        musicasDisponiveis.add(new Musica("Shape of You", "Ed Sheeran"));
        musicasDisponiveis.add(new Musica("Bohemian Rhapsody", "Queen"));
    }

    public Musica buscarMusica(String titulo) throws Exception {
        for (Musica m : musicasDisponiveis) {
            if (m.getTitulo().equalsIgnoreCase(titulo)) {
                return m;
            }
        }
        throw new Exception("A música " + titulo + " não foi encontrada no sistema.");
    }
}
