public class PortoPequeno  extends BasePorto {

    public PortoPequeno(String nome, int capacidade) {
        super(nome, capacidade);
    }

    @Override
    public boolean atracarBarco(Barco barco) {
        if (barco.getTamanho() <= 10) {
            return super.atracarBarco(barco);
        }
        return false;
    }
}

