package org.example;

import java.util.Random;

public class GeradorSenha {

    // construtor
    GeradorSenha(){}

    //Métodos

    String senhaAleat(){

        Random strAleat = new Random();

        String[] caracteres = {"a", "b", "c", "d","e","f","g","1","2","3","4","5","6","!","@","$","%","&","*"};
        String senha = "";

        for (Integer i = 0; i <= 10; i++){
            senha = senha + caracteres[strAleat.nextInt(caracteres.length)];
        }

        return senha;
    }


}
