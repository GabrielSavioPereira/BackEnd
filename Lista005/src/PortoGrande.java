public class PortoGrande extends BasePorto {

    public PortoGrande(String nome, int capacidade) {
        super(nome, capacidade);
    }

    @Override
    public boolean atracarBarco(Barco barco) {
        if (barco.getTamanho() >= 10) {
            return super.atracarBarco(barco);
        }
        return false;
    }
}
