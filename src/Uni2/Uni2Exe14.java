import java.util.Scanner;

public class Uni2Exe14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor inteiro: ");
        int valor = sc.nextInt();

        int nota100 = valor / 100;
        int resto100 = valor % 100;

        int nota50 = resto100 / 50;
        int resto50 = resto100 % 50;

        int nota20 = resto50 / 20;
        int resto20 = resto50 % 20;

        int nota10 = resto20 / 10;
        int resto10 = resto20 % 10;

        int nota5 = resto10 / 5;
        int resto5 = resto10 % 5;

        int nota2 = resto5 / 2;
        int resto2 = resto5 % 2;

        int nota1 = resto2 / 1;

        System.out.println("Você receberá: " + nota100 + " notas de 100, " 
        + nota50 + " notas de 50, " + nota20 + " notas de 20, " + nota10 + 
        " notas de 10, " + nota5 + " notas de 5, " + nota2 + " notas de 2, " 
        + nota1 + " notas de 1.");

        sc.close();
    }
}