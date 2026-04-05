package Uni4;

import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o valor do lado 1: ");
        double lado1 = sc.nextDouble();
        System.out.println("insira o valor do lado 2: ");
        double lado2 = sc.nextDouble();
        System.out.println("insira o valor do lado 3: ");
        double lado3 = sc.nextDouble();

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("triângulo isósceles.");
            } else {
                System.out.println("triângulo escaleno.");
            }

        } else {
            System.out.println("Não formam um triângulo");
        }

        sc.close();
    }

}
