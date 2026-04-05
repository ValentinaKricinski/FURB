package Uni4;

import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um caracter(F para feminino, M para masculino, I para não informado):");
        char caracter = sc.next().charAt(0);
        caracter = Character.toUpperCase(caracter);

        if (caracter == 'F') {
            System.out.println("Feminino");
        } else if (caracter == 'M') {
            System.out.println("Masculino");
        } else if (caracter == 'I') {
            System.out.println("Não informado");
        } else {
            System.out.println("Entrada incorreta");
        }

        sc.close();
    }

}
