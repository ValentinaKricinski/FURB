package Uni4;

import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a letra: ");
        char letra = sc.next().charAt(0);
        letra = Character.toUpperCase(letra);

        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("É vogal");
        } else {
            System.out.println("Não é vogal");
        }

        sc.close();
    }

}
