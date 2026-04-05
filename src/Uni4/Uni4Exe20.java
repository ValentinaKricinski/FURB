package Uni4;

import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a nota 1: ");
        float n1 = sc.nextFloat();
        System.out.println("insira a nota 2: ");
        float n2 = sc.nextFloat();
        System.out.println("insira a nota 3: ");
        float n3 = sc.nextFloat();
        System.out.println("insira a nota da média dos exercícios: ");
        float exer = sc.nextFloat();

        float media = (n1+(n2*2)+(n3*3)+exer)/7;

        if(media >= 9.0f){
            System.out.printf("A média de aproveitamento foi: %.2f. Conceito A. Aprovado.", media);
        }else if(media>=7.5f && media<9.0f){
            System.out.printf("A média de aproveitamento foi: %.2f. Conceito B. Aprovado.", media);
        }else if(media>=6.0f && media<7.5f){
            System.out.printf("A média de aproveitamento foi: %.2f. Conceito C. Aprovado.", media);
        }else if(media>=4.0f && media<6.0f){
            System.out.printf("A média de aproveitamento foi: %.2f. Conceito D. Reprovado.", media);
        }else if(media<4.0f){
            System.out.printf("A média de aproveitamento foi: %.2f. Conceito E. Reprovado.", media);
        }

        sc.close();
    }
    
}
