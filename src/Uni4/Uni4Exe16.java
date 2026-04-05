package Uni4;

import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a idade do primeiro homem:");
        int idadeH1 = sc.nextInt();
        System.out.println("Insira a idade do segundo homem:");
        int idadeH2 = sc.nextInt();
        System.out.println("Insira a idade da primeira mulher:");
        int idadeM1 = sc.nextInt();
        System.out.println("Insira a idade da segunda mulher:");
        int idadeM2 = sc.nextInt();

        if(idadeH1>idadeH2 && idadeM1>idadeM2){
            int soma= idadeH1 + idadeM2;
            int produto= idadeH2*idadeM1;
            System.out.println("soma: " +soma);
            System.out.println("produto: " +produto);
        } else{
            int soma= idadeH2 + idadeM1;
            int produto= idadeH1*idadeM2;
            System.out.println("soma: " +soma);
            System.out.println("produto: " +produto);
        }

        sc.close();
    }
    
}
