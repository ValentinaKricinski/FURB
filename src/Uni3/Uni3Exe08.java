package Uni3;

import java.util.Scanner;

public class Uni3Exe08 {
    private float dolar, cotacao;

    public Uni3Exe08(float dolar, float cotacao){
        this.dolar = dolar;
        this.cotacao = cotacao;
    }

    public float calcularReais(){
        return this.dolar * this.cotacao;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o valor em dolares recebido pelo cliente: ");
        float dolar = sc.nextFloat();
        float cotacao = 5.65f;

        Uni3Exe08 uni = new Uni3Exe08(dolar, cotacao);
        System.out.printf("O atendente deve devolver R$%.2f para o cliente. %n", uni.calcularReais());
        sc.close();
    }

}


/* atributos: dolar, cotacao


metodos: calcularReais

*/