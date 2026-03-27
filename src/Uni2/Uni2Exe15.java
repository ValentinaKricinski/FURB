import java.util.Scanner;

public class Uni2Exe15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor:");
        double valor = sc.nextDouble();

        int nota100 = (int) (valor / 100);
        double resto100 = valor % 100;

        int nota50 = (int) (resto100 / 50);
        double resto50 = resto100 % 50;

        int nota20 = (int) (resto50 / 20);
        double resto20 = resto50 % 20;

        int nota10 = (int) (resto20 / 10);
        double resto10 = resto20 % 10;

        int nota5 = (int) (resto10 / 5);
        double resto5 = resto10 % 5;

        int nota2 = (int) (resto5 / 2);
        double resto2 = resto5 % 2;

        int moeda1 = (int) (resto2 / 1);
        double restoMoeda1 = resto2 % 1;

        int moeda50 = (int) (restoMoeda1 / 0.50);
        double restoMoeda50 = restoMoeda1 % 0.50;

        int moeda25 = (int) (restoMoeda50 / 0.25);
        double restoMoeda25 = restoMoeda50 % 0.25;

        int moeda10 = (int) (restoMoeda25 / 0.10);
        double restoMoeda10 = restoMoeda25 % 0.10;

        int moeda05 = (int) (restoMoeda10 / 0.05);
        double restoMoeda05 = restoMoeda10 % 0.05;

        int moeda01 = (int) (restoMoeda05 / 0.01);

    
        System.out.println(nota100 + " nota de 100");
        System.out.println(nota50 + " nota de 50");
        System.out.println(nota20 + " nota de 20");
        System.out.println(nota10 + " nota de 10");
        System.out.println(nota5 + " nota de 5");
        System.out.println(nota2 + " nota de 2");
        System.out.println(moeda1 + " moeda de 1");
        System.out.println(moeda50 + " moeda de 0.50");
        System.out.println(moeda25 + " moeda de 0.25");
        System.out.println(moeda10 + " moeda de 0.10");
        System.out.println(moeda05 + " moeda de 0.05");
        System.out.println(moeda01 + " moeda de 0.01");

        sc.close();
    }
}