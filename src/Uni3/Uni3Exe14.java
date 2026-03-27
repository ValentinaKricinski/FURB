package Uni3;

import java.util.Scanner;

public class Uni3Exe14 {
    private float distancia, tempo;

    public Uni3Exe14(float distancia, float tempo){
        this.distancia = distancia;
        this.tempo = tempo;
    }

    public float calcularVelocidadeMedia(){
        return distancia/tempo;
    }

    public float calcularCombustivel(){
        return distancia/12;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a distancia: ");
        float distancia = sc.nextFloat();
        System.out.println("insira o tempo: ");
        float tempo = sc.nextFloat();

        Uni3Exe14 uni = new Uni3Exe14(distancia, tempo);
        System.out.printf("A velocidade media foi de %.2f km/h e a quantidade de combustivel usado foi %.2f litros.", uni.calcularVelocidadeMedia(), uni.calcularCombustivel());

        sc.close();
    }

}


/* atributos: distancia, tempo, combustivel

metodo: calcularVelocidadeMedia, calcularCombustivel ,  */
