package Uni3;

import java.util.Scanner;

public class Uni3Exe15 {
    private int numero;

    public Uni3Exe15(int numero){
        this.numero = numero;
    }

    public int calcularCentena(){
        return numero/100;
    }

    public int calcularDezena(){
        return (numero%100)/10;
    }

    public int calcularUnidade(){
        return (numero%10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o numero:");
        int numero = sc.nextInt();

        Uni3Exe15 uni = new Uni3Exe15(numero);
        System.out.println(uni.calcularCentena()+ " centena(s)  " +uni.calcularDezena()+ " dezena(s)  " +uni.calcularUnidade() + " unidede(s).");

        sc.close();
    }
}

/* atributos: numero;

metodo: calcularCentena, calcularDezena , calcularUnidade  */
