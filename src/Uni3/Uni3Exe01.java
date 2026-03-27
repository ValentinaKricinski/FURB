package Uni3;

import java.util.Scanner;

public class Uni3Exe01 {

    private int comprimento;
    private int largura;

    public Uni3Exe01(int comprimento, int largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int calcularArea(){
        return this.comprimento * this.largura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o comprimento: ");
        int comp = sc.nextInt();
        System.out.println("insira a largura: ");
        int larg = sc.nextInt();
        Uni3Exe01 classeExec = new Uni3Exe01(comp, larg);
        System.out.println("area total: " + classeExec.calcularArea());

        sc.close();
    }


}
