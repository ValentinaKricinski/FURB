package Uni4;

import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o numero: ");
        float n = sc.nextFloat();

        if (n % 1 != 0) {
            System.out.printf("Casas decimais foram digitadas.\n");
        } else {
            System.out.printf("Casas decimais não foram digitadas.\n");
        }

        sc.close();
    }
    
}
