package org.example;

public class Pokemon {
    // atributos
    String nome ;
    String tipo ;
    Short nivel;

    // Construtor
    Pokemon(){

    }

    Pokemon(String nome, String tipo, Short nivel){
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    // métodos
    void exibePokemon(){
        System.out.print(nome + " é um Pokémon do tipo " + tipo + " de nível " + nivel + ".");
    }

    // Getters Setters

    String getNome(){
        return  this.nome;
    }

    String getTipo(){
        return this.tipo;
    }

    Short getNivel(){
        return this.nivel;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(Short nivel) {
        this.nivel = nivel;
    }
}
