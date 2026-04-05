package Uni4;

import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o primeiro valor: ");
        int n1 = sc.nextInt();
        System.out.println("insira o segundo valor: ");
        int n2 = sc.nextInt();

        if(n1%n2 == 0 || n2%n1 == 0){
            System.out.println("Os valores são múltiplos.");
        } else{
            System.out.println("Os valores não são múltiplos.");
        }

        sc.close();
    }
    
}
