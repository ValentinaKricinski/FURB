package Uni4;

import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um valor maior que 0(zero): ");
        int valor = sc.nextInt();

        if (valor%2 == 0){
            System.out.println("Número é par");
        } else{
            System.out.println("Número é impar");
        }

        sc.close();
    }
    
}
