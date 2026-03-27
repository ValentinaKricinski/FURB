package Uni3;

import java.util.Scanner;

public class Uni3Exe03 {
    private float precoLitro,valorPagamento;

    public Uni3Exe03(float precoLitro, float valorPagamento){
        this.precoLitro = precoLitro;
        this.valorPagamento = valorPagamento;
    }

    public float calcularTanque(){
        return this.valorPagamento / this.precoLitro;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o preço do litro de gasolina: ");
        float litro = sc.nextFloat();
        System.out.println("insira o valor do pagamento: ");
        float pagamento = sc.nextFloat();
        Uni3Exe03 uni = new Uni3Exe03(litro, pagamento);
        System.out.printf("O motorista conseguiu colocar: %.2f litros.%n", uni.calcularTanque());
        sc.close();
    }

}



/* atributos: precoLitro, valorPagamento


metodos: calcularTanque

*/