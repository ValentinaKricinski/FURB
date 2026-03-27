package Uni3;

import java.util.Scanner;

public class Uni3Exe11 {
    private int temperatura;

    public Uni3Exe11(int temperatura){
        this.temperatura = temperatura;
    }

    public float calcularF(){
        return (9f/5f)* temperatura + 32f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a temperatura em °C: ");
        int temperatura = sc.nextInt();

        Uni3Exe11 uni = new Uni3Exe11(temperatura);
        System.out.printf("A temperatura em °F e: %.2f", uni.calcularF());

       sc.close();
    }


}


/* atributos: temperatura,

metodos: */