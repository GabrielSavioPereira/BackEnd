public class BasePorto {
        String nome;
        Barco[] barcosAtracados;
        int qtdBarcos; // controle do índice

        public BasePorto(String nome, int capacidade) {
            this.nome = nome;
            this.barcosAtracados = new Barco[capacidade];
            this.qtdBarcos = 0;
        }

        public boolean atracarBarco(Barco barco) {
            if (qtdBarcos < barcosAtracados.length) {
                barcosAtracados[qtdBarcos] = barco;
                qtdBarcos++;
                System.out.println(barco.getNome() + " atracado no " + nome);
                return true;
            }
            return false;
        }

        public void desatracarBarco(Barco barco) {
            for (int i = 0; i < qtdBarcos; i++) {
                if (barcosAtracados[i] == barco) {
                    // "remove" deslocando os outros
                    for (int j = i; j < qtdBarcos - 1; j++) {
                        barcosAtracados[j] = barcosAtracados[j + 1];
                    }
                    barcosAtracados[qtdBarcos - 1] = null;
                    qtdBarcos--;
                    System.out.println(barco.getNome() + " desatracado do " + nome);
                    break;
                }
            }
        }
    }


