package org.example;

import java.time.Year;

public class Data {
    // Atributos
    private int dia;
    private int mes;
    private int ano;

    // Construtor
    public Data(int dia, int mes, int ano){
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    // Getters
    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public int getAno(){
        return this.ano;
    }

    // Setters
    public void setAno(int ano){
        this.ano = ano;
    }

    public void setMes(int mes){
        if(mes < 1 || mes > 12){
            System.out.println("Mês inválido! Deve estar entre 1 e 12.");
        } else {
            this.mes = mes;
        }
    }

    public void setDia(int dia){
        int diasNoMes = getDiasDoMes(this.mes, this.ano);
        if(dia < 1 || dia > diasNoMes){
            System.out.println("Dia inválido! Esse mês tem no máximo " + diasNoMes + " dias.");
        } else {
            this.dia = dia;
        }
    }

    // Método para retornar a quantidade de dias de cada mês
    int getDiasDoMes(int mes, int ano){
        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return Year.isLeap(ano) ? 29 : 28;
            default:
                return 0; // nunca deve acontecer, pois setMes já valida
        }
    }

    // Método para exibir a data
    public void displayData(){
        System.out.println(getDia() + "/" + getMes() + "/" + getAno());
    }
}
