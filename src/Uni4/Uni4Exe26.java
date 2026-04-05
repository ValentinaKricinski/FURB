package Uni4;

import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção: \n" +
                "T: calcular a área de um triângulo de base b e altura h \n" +
                "Q: calcular a área de um quadrado de lado l \n" +
                "R: calcular a área de um retângulo de base b e altura h \n" +
                "C: Calcular a área de um círculo de raio r");

        System.out.println("Insira a opção: ");
        char opcao = Character.toUpperCase(sc.next().charAt(0));

        switch (opcao) {
            case 'T':
                System.out.println("insira a base: ");
                double b = sc.nextDouble();
                System.out.println("insira a altura: ");
                double h = sc.nextDouble();
                double areaT = b * h / 2;
                System.out.println("Área do triângulo é: " + areaT);

                break;

            case 'Q':
                System.out.println("insira o lado: ");
                double l = sc.nextDouble();
                double areaQ = l * l;
                System.out.println("Área do quadrado é: " + areaQ);

                break;

            case 'R':
                System.out.println("insira a base: ");
                double base = sc.nextDouble();
                System.out.println("insira a altura: ");
                double altura = sc.nextDouble();
                double areaR = base * altura;
                System.out.println("Área do retangulo é: " + areaR);

                break;

            case 'C':
                System.out.println("insira o raio: ");
                double r = sc.nextDouble();
                double areaC = Math.PI * Math.pow(r, 2);
                System.out.println("Área do circulo é: " + areaC);

                break;

            default:
                System.out.println("Opção inválida");
                break;
        }

        sc.close();
    }
}
