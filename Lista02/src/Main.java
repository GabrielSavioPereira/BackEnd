import java.util.Random;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("");
        Exercicio01();
        System.out.println("");
        Exercicio02();
        System.out.println("");
        Exercicio03();
    }
    static void Exercicio01(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        int tamanho = 8; // tamanho da senha
        StringBuilder senha = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            int index = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(index));
        }

        System.out.println("Senha gerada: " + senha);
    }
    static void Exercicio02(){
        Random random = new Random();

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Gabriel");
        nomes.add("Lucas");
        nomes.add("Mateus");
        nomes.add("João");

        ArrayList<String> sobrenomes = new ArrayList<>();
        sobrenomes.add("Savio");
        sobrenomes.add("Souza");
        sobrenomes.add("Silva");
        sobrenomes.add("Gomes");

        ArrayList<String> posicoes = new ArrayList<>();
        posicoes.add("Atacante");
        posicoes.add("Goleiro");
        posicoes.add("Zagueiro");
        posicoes.add("Meio-Campo");

        ArrayList<String> times = new ArrayList<>();
        times.add("Palmeiras");
        times.add("Santos");
        times.add("Criciuma");
        times.add("Flamengo");

        String nomeCompleto = nomes.get(random.nextInt(nomes.size())) + " " + sobrenomes.get(random.nextInt(sobrenomes.size()));
        String posicao = posicoes.get(random.nextInt(posicoes.size()));
        String time = times.get(random.nextInt(times.size()));


        int idade = 18 + random.nextInt(23); // 18 até 40


        System.out.println(nomeCompleto + " é um futebolista brasileiro de "+ idade + " anos que atua como " + posicao + ". Atualmente defende o "+time);

    }
    static void Exercicio03(){
        Random random = new Random();
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Tob");
        nomes.add("Jurandir");
        nomes.add("Claudiosvaldo");
        nomes.add("Caixadesommon");
        nomes.add("Sturtlittle");
        nomes.add("Remi");
        nomes.add("Geraldo");
        nomes.add("Netflixo");
        nomes.add("Princeso");
        nomes.add("Beterabo");
        nomes.add("EtBilu");
        nomes.add("Salvalaggiomon");
        nomes.add("Calabrezo");
        nomes.add("CaldodeCano");
        nomes.add("IvetoSangalo");
        nomes.add("Madono");
        nomes.add("ValescoPopozudo");
        nomes.add("ChoraNaTora");
        nomes.add("LadyGago");
        nomes.add("kidBengalo");
        nomes.add("Tadalafilo");
        nomes.add("LuanSantano");
        nomes.add("Luandro");
        nomes.add("Testosterono");
        nomes.add("Inseticido");
        nomes.add("Lesbico");
        nomes.add("Monaliso");
        nomes.add("Iphono");
        nomes.add("Borboleto");
        nomes.add("BrunoSurfistinho");
        nomes.add("SentaFofo");
        nomes.add("DoutorDeolano");
        nomes.add("Vampeto");
        nomes.add("ChampionsLigo");

        ArrayList<String> tipos = new ArrayList<>();
        tipos.add("Agua");
        tipos.add("Fogo");
        tipos.add("Planta");
        tipos.add("Gelo");
        tipos.add("Psiquico");
        tipos.add("Eletrico");
        tipos.add("Dark");
        tipos.add("Metal");
        tipos.add("Fada");
        tipos.add("Lutador");
        tipos.add("Terrestre");
        tipos.add("Dragão");
        tipos.add("Fantasma");
        tipos.add("Normal");
        tipos.add("Pedra");
        tipos.add("Voador");
        tipos.add("Insetos");
        tipos.add("Venenoso");

        ArrayList<String> niveis = new ArrayList<>();
        niveis.add("1");
        niveis.add("2");
        niveis.add("3");
        niveis.add("4");
        niveis.add("5");
        niveis.add("6");
        niveis.add("7");
        niveis.add("8");
        niveis.add("9");
        niveis.add("10");
        niveis.add("11");
        niveis.add("12");
        niveis.add("13");
        niveis.add("14");
        niveis.add("15");
        niveis.add("16");
        niveis.add("17");
        niveis.add("18");
        niveis.add("19");
        niveis.add("20");
        niveis.add("21");
        niveis.add("22");
        niveis.add("23");
        niveis.add("24");
        niveis.add("25");
        niveis.add("26");
        niveis.add("27");
        niveis.add("28");
        niveis.add("29");
        niveis.add("30");
        niveis.add("31");
        niveis.add("32");
        niveis.add("33");
        niveis.add("34");
        niveis.add("35");
        niveis.add("36");
        niveis.add("37");
        niveis.add("38");
        niveis.add("39");
        niveis.add("40");
        niveis.add("41");
        niveis.add("42");
        niveis.add("43");
        niveis.add("44");
        niveis.add("45");
        niveis.add("46");
        niveis.add("47");
        niveis.add("48");
        niveis.add("49");
        niveis.add("50");
        niveis.add("51");
        niveis.add("52");
        niveis.add("53");
        niveis.add("54");
        niveis.add("55");
        niveis.add("56");
        niveis.add("57");
        niveis.add("58");
        niveis.add("59");
        niveis.add("60");
        niveis.add("61");
        niveis.add("62");
        niveis.add("63");
        niveis.add("64");
        niveis.add("65");
        niveis.add("66");
        niveis.add("67");
        niveis.add("68");
        niveis.add("69");
        niveis.add("70");
        niveis.add("71");
        niveis.add("72");
        niveis.add("73");
        niveis.add("74");
        niveis.add("75");
        niveis.add("76");
        niveis.add("77");
        niveis.add("78");
        niveis.add("79");
        niveis.add("80");
        niveis.add("81");
        niveis.add("82");
        niveis.add("83");
        niveis.add("84");
        niveis.add("85");
        niveis.add("86");
        niveis.add("87");
        niveis.add("88");
        niveis.add("89");
        niveis.add("90");
        niveis.add("91");
        niveis.add("92");
        niveis.add("93");
        niveis.add("94");
        niveis.add("95");
        niveis.add("96");
        niveis.add("97");
        niveis.add("98");
        niveis.add("99");
        niveis.add("100");

        String NomePokemon = nomes.get(random.nextInt(nomes.size()));
        String TipoPokemon = tipos.get(random.nextInt(tipos.size()));
        String NivelPokemon = niveis.get(random.nextInt(niveis.size()));

        System.out.println(NomePokemon+" é um Pokemon do tipo "+TipoPokemon+" de nivel " +NivelPokemon);
    }
}


