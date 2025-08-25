package org.example;

public class Empregado {
    // Atributos
    private String nome;
    private String sobrenome;
    private Double salario;

    // Construtores
    Empregado(String nome, String sobrenome, Double salario) {
        setNome(nome);
        setSobrenome(sobrenome);
        setSalario(salario);
    }

    // Getters e Setters

    String getNome(){
        return  this.nome;
    }

    String getSobrenome(){
        return this.sobrenome;
    }

    String getNomeCompleto(){
        return this.nome + " " + this.sobrenome;
    }

    Double getSalario(){
        return this.salario;
    }


    void setNome(String nome){
        this.nome = nome;
    }

    void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    void setSalario(Double salario){
        this.salario = salario;
    }

    // Metodos

    Double getSalarioAnual(){
        return this.salario * 13;
    }

    void setAumentaSalario(Double percentual){
        this.salario = this.salario + (this.salario * (percentual/100));
    }

}
