package org.example;


public class Main {
    public static void main(String[] args) {

        Fatura fatura = new Fatura("001","Mouse sem fio", 2,59.90);

        System.out.println("Fatura numero: " + fatura.getNumero());
        System.out.println("Descrição da Fatura: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço: " + fatura.getPreco());
        System.out.println("Valor Total da Fatura: " + fatura.getTotalFatura());


        System.out.println("===============================");

        Empregado empregado = new Empregado("Elyeser Gabrian","Oliveira Nunes",10000.00);

        System.out.println("Empregado: " + empregado.getNomeCompleto());
        System.out.println("Salario Anual: "  + empregado.getSalarioAnual());

        empregado.setAumentaSalario(10.0);

        System.out.println("Salario Anual apos aumento: " + empregado.getSalarioAnual());

        System.out.println("--------- ---------------");

        Empregado empregado2 = new Empregado("João Vitor", "Da silva Coelho", 12000.00);

        System.out.println("Empregado: " + empregado2.getNomeCompleto());
        System.out.println("Salario Anual: " + empregado2.getSalarioAnual());

        empregado2.setAumentaSalario(5.0);

        System.out.println("Salario Anual Após o aumento: " + empregado2.getSalarioAnual());

        System.out.println("==========================");
        Data data = new Data(19,9,2023);

        data.displayData();

        Data data2 = new Data(32,2,2025);

        data2.displayData();

        Data data3 = new Data(29,2,2024);

        data3.displayData();

    }
}