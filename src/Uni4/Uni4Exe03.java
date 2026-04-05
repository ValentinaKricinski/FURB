package Uni4;

import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o primeiro valor: ");
        int v1 = sc.nextInt();
        System.out.println("insira o segundo valor: ");
        int v2 = sc.nextInt();

        if (v1>v2){
            System.out.printf("O valor %d é maior do que o valor %d.", v1,v2);
        } else{
            System.out.printf("O valor %d é maior do que o valor %d.", v2,v1);
        }

        sc.close();
    }
    
}
