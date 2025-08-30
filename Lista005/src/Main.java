import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Personagem[] personagens = new Personagem[5];
        personagens[0] = new Personagem("Orc", 100, 10);
        personagens[1] = new Personagem("Goblin", 50, 5);
        personagens[2] = new Personagem("Lobo", 75, 15);
        personagens[3] = new Personagem("Cavaleiro", 200, 20);
        personagens[4] = new Personagem("Dragão", 500, 50);

        Personagem jogador = new Personagem("Savio", 10000000, 200);

        while (jogador.vida > 0 && existeInimigoVivo(personagens)) {

            Personagem alvo;
            do {
                alvo = personagens[random.nextInt(personagens.length)];
            } while (alvo.vida == 0);
            jogador.atacar(alvo);

            for (Personagem inimigo : personagens) {
                if (inimigo.vida > 0 && jogador.vida > 0) {
                    inimigo.atacar(jogador);
                }
            }
        }

        if (jogador.vida <= 0) {
            System.out.println("Steve foi derrotado!");
        } else {
            System.out.println("Todos os inimigos foram derrotados!");
        }


        System.out.println("");
        // BARCOS

        Barco[] barcos = new Barco[5];
        barcos[0] = new Barco("Barco 1", 2);
        barcos[1] = new Barco("Barco 2", 5);
        barcos[2] = new Barco("Barco 3", 7);
        barcos[3] = new Barco("Barco 4", 12);
        barcos[4] = new Barco("Barco 5", 20);

        BasePorto portoPequeno = new PortoPequeno("porto pequeno", 5);
        BasePorto portoGrande = new PortoGrande("porto grande", 5);

        for (int i = 0; i < barcos.length; i++) {
            Barco b = barcos[i];
            if (!portoPequeno.atracarBarco(b)) {
                portoGrande.atracarBarco(b);
            }
        }
        System.out.println("");
        //MUSICAS
        Scanner sc = new Scanner(System.in);
        MusicCloud cloud = new MusicCloud();

        System.out.print("Digite o nome da sua playlist: ");
        String nomePlaylist = sc.nextLine();

        Playlist playlist = new Playlist(nomePlaylist);

        boolean continuar = true;
        while (continuar) {
            System.out.print("\nDigite o nome da música (ou 'sair' para encerrar): ");
            String titulo = sc.nextLine();

            if (titulo.equalsIgnoreCase("sair")) {
                continuar = false;
                break;
            }

            try {
                Musica musica = cloud.buscarMusica(titulo);
                playlist.adicionarMusica(musica);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        playlist.imprimirPlaylist();

        System.out.println("");
        //EXECICIO04
        System.out.print("Digite o título: ");
        String titulo = sc.nextLine();

        System.out.print("Digite a descrição: ");
        String descricao = sc.nextLine();

        System.out.print("Digite o tipo (texto, imagem, video): ");
        String tipo = sc.nextLine();

        Postagem postagem = new Postagem(titulo, descricao, tipo);

        PlataformaSocial mybook = new MyBook();
        PlataformaSocial fotogram = new Fotogram();
        PlataformaSocial anytube = new AnyTube();

        try {
            mybook.compartilharPostagem(postagem);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            fotogram.compartilharImagem(postagem);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            anytube.compartilharImagem(postagem);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("");
        //EXERCIcio 05

        Cinema cinema = new Cinema();

        // Adiciona 5 filmes
        cinema.adicionarFilme(new Filme("Homem Aranha", 20.0, 17));
        cinema.adicionarFilme(new Filme("Batman", 22.0, 14));
        cinema.adicionarFilme(new Filme("Vingadores", 25.0, 12));
        cinema.adicionarFilme(new Filme("Coringa", 30.0, 18));
        cinema.adicionarFilme(new Filme("Frozen", 18.0, 0));

        while (true) {
            System.out.println("--- COMPRA DE INGRESSO ---");

            System.out.print("Que filme você deseja assistir? ");
            String nomeFilme = sc.nextLine();
            Filme filme = cinema.buscarFilme(nomeFilme);

            if (filme == null) {
                System.out.println("Filme não encontrado!");
                continue;
            }

            System.out.print("Qual assento você deseja (A1 a F5)? ");
            String assento = sc.nextLine();

            System.out.print("Qual o seu nome? ");
            String nomeCliente = sc.nextLine();

            System.out.print("Qual a sua idade? ");
            int idade = Integer.parseInt(sc.nextLine());

            Cliente cliente = new Cliente(nomeCliente, idade);

            try {
                cinema.venderIngresso(cliente, filme, assento);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Deseja comprar outro ingresso? (s/n): ");
            String resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }
        sc.close();

    }
    private static boolean existeInimigoVivo(Personagem[] inimigos) {
        for (Personagem p : inimigos) {
            if (p.vida > 0) {
                return true;
            }
        }
        return false;
    }


}

