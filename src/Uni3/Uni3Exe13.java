package Uni3;

import java.util.Scanner;

public class Uni3Exe13 {
    private float azulejo, comprimento, altura;

    public Uni3Exe13(float azulejo, float comprimento, float altura){
        this.azulejo = azulejo;
        this.comprimento = comprimento;
        this.altura = altura;
    }

    public float calcularTamanho(){
        return comprimento*altura;

    }

    public float calcularValor(){
        return ((9*azulejo)* calcularTamanho());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a altura da parede: ");
        float altura = sc.nextFloat();
        System.out.println("insira o comprimento da parede: ");
        float comprimento = sc.nextFloat();
        float azulejo = 12.50f;

        Uni3Exe13 uni = new Uni3Exe13(azulejo, comprimento, altura);
        System.out.printf("O valor final é R$%.2f", uni.calcularValor());

        sc.close();
    }

}

/* atributos: azulejo, comprimento, altura

metodo: calcularTamanho, calcularValor ,  */