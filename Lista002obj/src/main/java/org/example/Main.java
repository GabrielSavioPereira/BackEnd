package org.example;

import java.util.Random;

public class Main
{

//    static  void listaTodosJogadores(Jogador[] jogadores){
//
//        for (Jogador jogador : jogadores) {
//            jogador.exibeMensagem();
//        }
//    }

    public static void main(String[] args) {

//        geraSenha();
//        jogadorFutebol();
//        geraPokemon();

        Pokemon[] pokemons = new Pokemon[10];

        // Preenchendo com dados
        pokemons[0] = new Pokemon("Pikachu", "Elétrico", (short) 25);
        pokemons[1] = new Pokemon("Charmander", "Fogo", (short) 15);
        pokemons[2] = new Pokemon("Squirtle", "Água", (short) 18);
        pokemons[3] = new Pokemon("Bulbasaur", "Grama/Veneno", (short) 20);
        pokemons[4] = new Pokemon("Jigglypuff", "Normal/Fada", (short) 12);
        pokemons[5] = new Pokemon("Gengar", "Fantasma/Veneno", (short) 35);
        pokemons[6] = new Pokemon("Eevee", "Normal", (short) 16);
        pokemons[7] = new Pokemon("Snorlax", "Normal", (short) 30);
        pokemons[8] = new Pokemon("Dragonite", "Dragão/Voador", (short) 55);
        pokemons[9] = new Pokemon("Lucario", "Lutador/Metálico", (short) 40);

        // Exibindo os dados de cada Pokémon
        for (int i = 0; i < pokemons.length; i++) {
            pokemons[i].exibePokemon();
            System.out.println(); // nova linha para organização
        }

        System.out.println("");

        Jogador[] jogadores = new Jogador[10];

        // Preenchendo com dados
        jogadores[0] = new Jogador("Carlos", "Silva", "Atacante", "Flamengo", (short) 25);
        jogadores[1] = new Jogador("Lucas", "Pereira", "Meia", "Palmeiras", (short) 22);
        jogadores[2] = new Jogador("Matheus", "Oliveira", "Zagueiro", "Corinthians", (short) 27);
        jogadores[3] = new Jogador("Rafael", "Santos", "Goleiro", "São Paulo", (short) 30);
        jogadores[4] = new Jogador("João", "Almeida", "Lateral", "Grêmio", (short) 24);
        jogadores[5] = new Jogador("Felipe", "Rocha", "Volante", "Internacional", (short) 28);
        jogadores[6] = new Jogador("Bruno", "Costa", "Meia", "Cruzeiro", (short) 21);
        jogadores[7] = new Jogador("Diego", "Moraes", "Atacante", "Atlético-MG", (short) 26);
        jogadores[8] = new Jogador("Thiago", "Fernandes", "Lateral", "Bahia", (short) 23);
        jogadores[9] = new Jogador("Gustavo", "Lima", "Zagueiro", "Botafogo", (short) 29);

        // Exibindo os dados de cada jogador
        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].exibeMensagem();
            System.out.println(); // nova linha para separação
        }


        System.out.println("");

        GeradorSenha gerador = new GeradorSenha();

        for (int i = 0; i < 5; i++) {
            String senha = gerador.senhaAleat();
            System.out.println("Senha gerada: " + senha);
        }


        // estou com preguiça de chamar os getters e setters




    }

    static void geraSenha(){

        Random strAleat = new Random();

        String[] caracteres = {"a", "b", "c", "d","e","f","g","1","2","3","4","5","6","!","@","$","%","&","*"};
        String senha = "";

        for (Integer i = 0; i <= 10; i++){
            senha = senha + caracteres[strAleat.nextInt(caracteres.length)];
        }

        System.out.println("Senha Gerada: " + senha);
        System.out.print("");

    }


    static void jogadorFutebol(){

        Random gerador = new Random();

        String[] nome = {"Maria", "João", "Jacinto", "Lucas", "Kauan", "Miguel", "Matheus","Pedro","Arthur","Gabriel"};
        String[] sobrenome = {"Miranda","Fernandes","Cardoso","Gomes","Silva","Pinto","Rêgo","Nunes","Oliveira","Almeida"};
        String[] posicao = {"Atacante","Goleiro","Ponta Esquerda","Ponta Direita","Meio Campo","Lat. Esquerdo","Lat. Direito","Volante","Zagueiro"};
        String[] time = {"Internacional", "Criciúma","Flamengo","Real Madrid","Barcelona"};

        String jogador = "";

        Integer idade = gerador.nextInt(40);


        jogador = nome[gerador.nextInt(nome.length)] + " " + sobrenome[gerador.nextInt(sobrenome.length)] +
                " é um futebolista brasileiro de " + idade + " anos que atua como goleiro. Atualmente defende o " + time[gerador.nextInt(time.length)];



        System.out.println(jogador);
        System.out.print("");

    }


    static void geraPokemon(){

        Random gerador = new Random();

        String[] nome = {"Leno brega","Leon","Nilce","Piterodaquitio","Metamorfose Ambulante","TIOREX","Bistecoide"};
        String[] tipo = {"Água","Fogo","Planta","Amor","Velocidade","Vento"};
        String pokemon = "";

        int nivel = gerador.nextInt(100);

        pokemon = nome[gerador.nextInt(nome.length)] + " é um Pokémon do tipo " + tipo[gerador.nextInt(tipo.length)] + " de nível " + nivel + ".";

        System.out.print(pokemon);

    }

}
