package Uni4;

import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A cor é azul? : ");
        boolean cor = sc.nextBoolean();

        if(cor == true){
            System.out.println("Sim");
        } else{
            System.out.println("Não");
        }

        sc.close();
    }
    
}
