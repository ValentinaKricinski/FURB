package Uni3;

import java.util.Scanner;

public class Uni3Exe05 {
    private int frango;
    private float anelChip, anelAlimento;

    public Uni3Exe05(int frango, float anelChip, float anelAlimento){
        this.frango = frango;
        this.anelChip = anelChip;
        this.anelAlimento = anelAlimento;
    }

    public float calcularGasto(){
        return ((this.frango) * (this.anelChip + this.anelAlimento));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a quantidade de frango da sua produçao: ");
        int frango = sc.nextInt();
        float anelChip = 4.00f;
        float anelAlimento = 2 * 3.50f;

        Uni3Exe05 uni = new Uni3Exe05(frango, anelChip, anelAlimento);
        System.out.printf("O gasto total para marcar %d frangos e: %.2f%n", frango, uni.calcularGasto());

        sc.close();
    }

}


/* atributos: anelChip, anelAlimento, frango


metodos: calcularGasto

*/