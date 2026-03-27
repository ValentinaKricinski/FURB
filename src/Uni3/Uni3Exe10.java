package Uni3;

import java.util.Scanner;

public class Uni3Exe10 {
    private double catetoOposto, catetoAdjacente;

    public Uni3Exe10(double catetoOposto, double catetoAdjacente){
        this.catetoOposto = catetoOposto;
        this.catetoAdjacente = catetoAdjacente;
    }

    public double calcularFormula(){
        return Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2);
    }

    public double calcularHipotenusa(){
        return Math.sqrt(calcularFormula());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o valor do cateto oposto: ");
        double oposto = sc.nextDouble();
        System.out.println("insira o valor do cateto adjacente: ");
        double adjacente = sc.nextDouble();

        Uni3Exe10 uni = new Uni3Exe10(oposto, adjacente);
        System.out.printf("a hipotenusa e: %.2f", uni.calcularHipotenusa());

        sc.close();
    }

}

/* atributos: catetoOposto, catetoAdjacente


metodos: calcularFormula, calcularHipotenusa

*/
