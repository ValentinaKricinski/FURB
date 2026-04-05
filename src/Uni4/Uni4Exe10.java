package Uni4;

import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a idade de Marquinhos: ");
        int idadeM = sc.nextInt();
        System.out.println("insira a idade de Zezinho: ");
        int idadeZ = sc.nextInt();
        System.out.println("insira a idade de Luluzinha: ");
        int idadeL = sc.nextInt();

        if(idadeM<idadeZ && idadeM<idadeL){
            System.out.println("O Marquinhos é o caçula.");
        } else if(idadeZ<idadeM && idadeZ<idadeL){
            System.out.println("O Zezinho é o caçula.");
        } else {
            System.out.println("A Luluzinha é a caçula.");
        }

        sc.close();
    }
    
}
