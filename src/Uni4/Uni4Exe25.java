package Uni4;

import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.println("insira o segundo numero: ");
        int n2 = sc.nextInt();

        System.out.println("Escolha uma das opções: \n" +
                "1 - Soma de dois números.\n" +
                "2 - Diferença entre dois números.\n" +
                "3 - Produto entre dois números.\n" +
                "4 - Divisão entre dois números (o denominador não pode ser zero).");

        System.out.println("insira o numero da opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                int soma = n1 + n2;
                System.out.println(soma);
                break;

            case 2:
                int diferenca = n1 - n2;
                System.out.println(diferenca);
                break;

            case 3:
                int produto = n1 * n2;
                System.out.println(produto);
                break;

            case 4:
                int divisao = n1 / n2;
                System.out.println(divisao);
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }

        sc.close();
    }

}
