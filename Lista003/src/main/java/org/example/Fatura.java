package org.example;

public class Fatura {
    // Atributos

    private String numero;
    private String descricao;
    private int quantidade;
    private Double preco;

    // contrutores

    Fatura (String numero, String descricao, int quantidade, Double preco){
        setNumero(numero);
        setDescricao(descricao);
        setQuantidade(quantidade);
        setPreco(preco);
    };

    // Getters e Setter

    String getNumero(){
        return this.numero;
    }

    String getDescricao(){
        return this.descricao;
    }

    int getQuantidade(){
        return this.quantidade;
    }

    Double getPreco(){
        return this.preco;
    }

    void setNumero(String numero){
        this.numero = numero;
    }

    void setDescricao(String descricao){
        this.descricao = descricao;
    }

    void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    void setPreco(Double preco){
        this.preco = preco;
    }

    // metodo

    Double getTotalFatura(){

        if (this.quantidade < 0 || this.preco < 0){
            this.setQuantidade(0);
            this.setPreco(0.0);
        }

        return this.quantidade * this.preco;
    }

}
