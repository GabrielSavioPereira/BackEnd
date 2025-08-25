package org.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    // Atributos

    private String nome;
    private String sobrenome;
    private String posicao;
    private String clube;
    private Short  idade;

    // Construtores
    Jogador() {}

    // nome dentro desta função é parametro e o nome de cima é atributo
    Jogador(String nome, String sobrenome, String posicao, String clube, Short idade) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.posicao = posicao;
        this.clube = clube;
        this.idade = idade;
    }

    // Metodos

    void exibeMensagem(){
        System.out.print(nome + " " + sobrenome +
                " é um futebolista brasileiro de " + idade + " anos que atua como " + posicao + " . Atualmente defende o " + clube);

    }


    // Getters e Setters

    String getNome() {
        return this.nome;
    }

    String getClube() {
        return this.clube;
    }

    String getSobrenome() {

      return this.sobrenome;
    }

    String getPosicao(){
        return this.posicao;
    }

    void setIdade(Short idade){
        if ( idade >= (short) 16 && idade <= (short) 60){
            this.idade = idade;
        }
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    void setClube(String clube) {
        this.clube = clube;
    }
}
