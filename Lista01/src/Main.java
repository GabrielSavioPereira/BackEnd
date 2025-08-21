import javax.print.attribute.standard.Media;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio01();
        System.out.println("");
        exercicio02();
        System.out.println("");
        exercicio03();
        System.out.println("");
        exercicio04();
        System.out.println("");
        exercicio05();
        System.out.println("");
        exercicio06();
        System.out.println("");
        exercicio07();
        System.out.println("");
        exercicio08();

    }

    static void exercicio01() {
        System.out.println("Bem-vindo ao Sistema de Geração de Jogadores!");
    }

    static void exercicio02() {
        String nome = "Gabriel Savio";
        String cargo = "Dev Junior";
        Float salario = 5000.0f;

        System.out.println("Nome:" + nome);
        System.out.println("Cargo:" + cargo);
        System.out.println("Salario:" + salario);
    }

    static void exercicio03() {
        String produto;
        int codigo;
        double valor;
        boolean promocao = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        produto = input.nextLine();
        System.out.print("Digite o codigo do produto: ");
        codigo = input.nextInt();
        System.out.print("Digite o valor do produto: ");
        valor = input.nextDouble();

        System.out.println("Produto: " + produto);
        System.out.println("Codigo: " + codigo);
        System.out.println("Valor: " + valor);
        System.out.println("Promocao: " + promocao);
    }

    static void exercicio04() {
        Float ValorCompra, ValorDesconto;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do compra: ");
        ValorCompra = input.nextFloat();
        if (ValorCompra >= 100) {
            ValorDesconto = (float) ((ValorCompra) * 0.90);
            System.out.println("Valor final com desconto: R$" + ValorDesconto);
        } else {
            System.out.println("Valor final não é alterado, pois não passou de R$100");
        }
    }

    static void exercicio05() {
        Integer idade;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        idade = input.nextInt();
        if (idade < 12) {
            System.out.println("Categoria: Infantil");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Categoria: Adolescente");
        } else {
            System.out.println("Categoria: Adulto");
        }
    }

    static void exercicio06() {
        float[] notas = new float[5];
        float soma = 0;
        float media = 0;
        notas[0] = (7);
        notas[1] = (8);
        notas[2] = (6);
        notas[3] = (9);
        notas[4] = (10);
        System.out.println("Notas: " + Arrays.toString(notas));
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
            media = soma / 5;
        }
        System.out.println("Media: " + media);
    }
    static void exercicio07() {
        Float peso = 70.0F;
        Float altura = 1.75F;
        Float IMC = peso / (altura * altura);
        System.out.println("IMC: " + IMC);
    }
    static void exercicio08() {
        String nome = "Ana Maria Silva";
        String maiusculo = nome.toUpperCase();
        String nomeSemEspacos = nome.replaceAll("\\s+", "");
        int numeroCaracteres = nomeSemEspacos.length();
        boolean contemSilva = nome.toLowerCase().contains("silva");
            System.out.println("Número de caracteres: " + numeroCaracteres);
            System.out.println("Maiúsculo: " + maiusculo);
            System.out.println("Contém 'Silva'? " + contemSilva);
    }

    }

