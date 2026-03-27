package Uni3;

import java.util.Scanner;

public class Uni3Exe02 {

    private float valor, desconto;

    public Uni3Exe02(float valor, float desconto){
        this.valor = valor;
        this.desconto = desconto;

    }

    public float calcularDesconto(){
        return this.valor * (this.desconto/100);

    }

    public float calcularTotal(){
        return this.valor - calcularDesconto();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o valor do sapato: ");
        float valorSapato = sc.nextFloat();
        float desconto = 12.0f;
        Uni3Exe02 uni = new Uni3Exe02(valorSapato, desconto);
        System.out.println("O valor do desconto e: " + uni.calcularDesconto());
        System.out.println("o valor com o desconto e: " + uni.calcularTotal());
        

        sc.close();
    }


}
