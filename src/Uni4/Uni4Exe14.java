package Uni4;

import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o dia: ");
        int dia = sc.nextInt();
        System.out.println("insira o mês: ");
        int mes = sc.nextInt();
        System.out.println("insira o ano: ");
        int ano = sc.nextInt();

        if(dia>0 && dia<32 && mes< 13 && ano>0){
            if(mes == 1 || mes == 3){
                System.out.println("Valida");
            } else if(mes!= 2 && dia< 31){
                System.out.println("Valida");
            } else if(mes == 2 && dia<29){
                System.out.println("Valida");
            } else if(dia == 29 && ano%4 == 0 && !(ano%100 == 0 && ano%400 !=0)){
                System.out.println("Valida");
            } else{
                System.out.println("Não valida");
            }
        } else{
            System.out.println("Não valida");
        }

        sc.close();
    }   
    
}
