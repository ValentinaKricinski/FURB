package Uni4;

import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com as horas trabalhadas no mês: ");
        float horasMes = sc.nextFloat();
        System.out.println("Entre com o valor pago por hora: ");
        float horasValor = sc.nextFloat();

        float salarioTotal = horasMes*horasValor;

        if(horasMes>160){
            float salarioExtra = (horasMes - 160)*(horasValor/2);
            float valorTotal = salarioTotal + salarioExtra;
            System.out.printf("O salário total é: %.2f" ,valorTotal);
    
        }

        sc.close();
    }

}
