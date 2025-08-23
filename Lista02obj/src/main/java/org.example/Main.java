package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Jogador cristiano = new Jogador();
        Jogador messi = new Jogador(
                "Lionel",
                "Messi",
                "meio-campo",
                "Inter Miami",
                (short) 38
        );

        System.out.println(cristiano.getClube());
        cristiano.setIdade((short) -50);

        cristiano.exibeMensagem();
        messi.exibeMensagem();


        System.out.println("Jogadores criados!");
    }
}
