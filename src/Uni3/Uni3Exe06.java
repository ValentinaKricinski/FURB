package Uni3;

import java.util.Scanner;

public class Uni3Exe06 {
    private float pesoPrato, pesoComComida;

    public Uni3Exe06(float pesoPrato, float pesoComComida){
        this.pesoPrato = pesoPrato;
        this.pesoComComida = pesoComComida;
    }

    public float calcularValorTotal(){
        float pesoComida = this.pesoComComida - this.pesoPrato;
        return pesoComida * 25;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o peso do prato com comida em quilos: ");
        float comida = sc.nextFloat();
        float prato = 0.75f;

        Uni3Exe06 uni = new Uni3Exe06(prato, comida);
        System.out.printf("O valor do prato do cliente é: R$ %.2f", uni.calcularValorTotal());

        sc.close();
    }
}

/* atributos: pesoPrato, pesoComComida


metodos: calcularValorTotal

*/