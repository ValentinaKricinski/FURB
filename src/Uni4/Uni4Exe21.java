package Uni4;

import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua massa corporal: ");
        float massa = sc.nextFloat();
        System.out.println("Insira sua altura: ");
        float altura = sc.nextFloat();

        float imc = massa/(altura*altura);

        if(imc<18.5){
            System.out.println("Magreza");
        }else if(imc>=18.5f && imc<=24.9f){
            System.out.println("Saudável");
        }else if(imc>=25.0f && imc<=29.9f){
            System.out.println("Sobrepeso");
        }else if(imc>=30.0f && imc<=34.9f){
            System.out.println("Obesidade Grau I");
        }else if(imc>=35.0f && imc<=39.9f){
            System.out.println("Obesidade Grau II");
        }else if(imc>=40.0f){
            System.out.println("Obesidade Grau III");
        }

        sc.close();
    }
    
}
