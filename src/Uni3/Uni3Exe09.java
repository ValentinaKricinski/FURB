package Uni3;

import java.util.Scanner;

public class Uni3Exe09 {
    private double raio, altura;

    public Uni3Exe09(double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }

    public double calcularVolume(){
        return Math.PI * Math.pow(raio, 2)* altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o raio: ");
        double r = sc.nextDouble();
        System.out.println("insira a altura: ");
        double a = sc.nextDouble();

        Uni3Exe09 uni = new Uni3Exe09(r, a);
        System.out.printf("O volume da lata de oleo e: %.2f", uni.calcularVolume());
        
        sc.close();
    }


}

/* atributos: raio, altura


metodos: calcularVolume

*/