import java.util.Random;

public class Biocombustivel {
    protected float quilogramas;

    public Biocombustivel() {
        this.quilogramas = 1000;
    }

    public Biocombustivel(float quilogramas) {
        this.quilogramas = quilogramas;
    }

    public float getQuilogramas() {
        return quilogramas;
    }

    public void setQuilogramas(float quilogramas) {
        this.quilogramas = quilogramas;
    }

    public float processar() {
        Random random = new Random();
        int n = random.nextInt(3) + 1; // valores 1, 2 ou 3
        return quilogramas * n;
    }
}
