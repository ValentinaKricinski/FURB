package Uni4;

import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a quantidade de meses de trabalho: ");
        int qMeses = sc.nextInt();

        if(qMeses<=12){
            System.out.println("O funcionário irá receber 5% de reajuste.");
        }else if(qMeses>=13 && qMeses<=48){
            System.out.println("O funcionário irá receber 7% de reajuste.");
        } else{
            System.out.println("Reajuste não informado.");
        }

        sc.close();
    }
}
