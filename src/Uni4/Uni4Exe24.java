package Uni4;

import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("insira o valor 1: ");
        int v1 = sc.nextInt();

        System.out.print("insira o valor 2: ");
        int v2 = sc.nextInt();

        System.out.print("insira o valor 3: ");
        int v3 = sc.nextInt();

        System.out.print("insira a opção: ");
        int opcao = sc.nextInt();

        int menor, meio, maior;

        if (v1 <= v2 && v1 <= v3) {
            menor = v1;
            if (v2 <= v3) {
                meio = v2;
                maior = v3;
            } else {
                meio = v3;
                maior = v2;
            }
        } else if (v2 <= v1 && v2 <= v3) {
            menor = v2;
            if (v1 <= v3) {
                meio = v1;
                maior = v3;
            } else {
                meio = v3;
                maior = v1;
            }
        } else {
            menor = v3;
            if (v1 <= v2) {
                meio = v1;
                maior = v2;
            } else {
                meio = v2;
                maior = v1;
            }
        }

        switch (opcao) {
            case 1:

                System.out.println(menor + " " + meio + " " + maior);
                break;

            case 2:

                System.out.println(maior + " " + meio + " " + menor);
                break;

            case 3:

                System.out.println(menor + " " + maior + " " + meio);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}