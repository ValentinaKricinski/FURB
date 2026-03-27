package Uni3;

import java.util.Scanner;

public class Uni3Exe16 {
    private int valorCompra;
    private int valorPago;

    public Uni3Exe16(int valorCompra, int valorPago){
        this.valorCompra = valorCompra;
        this.valorPago = valorPago;
    }

    public int calcularTroco(){
        return valorPago - valorCompra;
    }

    public int calcularNotas100(){
        return calcularTroco()/100;
    }

    public int calcularNotas10(){
        return (calcularTroco()%100)/10;
    }

    public int calcularNotas1(){
        return calcularTroco()%10;
    }

    public int calcularTotalNotas(){
        return calcularNotas100() + calcularNotas10() + calcularNotas1();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("insira o valor total da compra: ");
        int compra = sc.nextInt();
        System.out.print("insira o valor total dado pelo cliente: ");
        int pago = sc.nextInt();

        Uni3Exe16 uni = new Uni3Exe16(compra, pago);
        System.out.println("O numero minimo de notas de troco e: " + uni.calcularTotalNotas());
        System.out.println("Quantidade de notas de 100 necessarias e: " + uni.calcularNotas100());
        System.out.println("Quantidade de notas de 10 necessarias e: " + uni.calcularNotas10());
        System.out.println("Quantidade de notas de 1 necessarias e: " + uni.calcularNotas1());


        sc.close();
    }
}

/* atributos: valorCompra, valorPago;

metodos: calcularTroco, calcularNotas100, calcularNotas10, calcularNotas1, calcularTotalNotas */