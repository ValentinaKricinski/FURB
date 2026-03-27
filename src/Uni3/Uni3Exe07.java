package Uni3;

import java.util.Scanner;

public class Uni3Exe07 {
    private int lata, garrafaPequena, garrafaGrande;

    public Uni3Exe07(int lata, int garrafaPequena, int garrafaGrande){
        this.lata = lata;
        this.garrafaPequena = garrafaPequena;
        this.garrafaGrande = garrafaGrande;
    }

    public float calcularLitros(){
        return ((this.lata * 0.35f) + (this.garrafaPequena * 0.60f) + (this.garrafaGrande * 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a quantidade de lata de 350ml: ");
        int lata = sc.nextInt();
        System.out.println("insira a quantidade de garrafa de 600ml: ");
        int pequena = sc.nextInt();
        System.out.println("insira a quantidade de garrafa de 2l: ");
        int grande = sc.nextInt();

        Uni3Exe07 uni = new Uni3Exe07(lata, pequena, grande);
        System.out.printf("O cliente comprou ao total %.2f litros. %n", uni.calcularLitros());
        sc.close();
    }


}

/* atributos: lata, garrafaPequena, garrafaGrande


metodos: calcularLitros

*/