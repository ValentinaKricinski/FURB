import java.util.Scanner;

public class Uni2Exe06 {
    public static void main(String[] args) {
        float horas, valorPorHora, salario;
        Scanner sc = new Scanner(System.in);

        System.out.println("insira seu numero: ");
        int numero = sc.nextInt();
        System.out.println("insira quantas horas voce trabalha: ");
        horas = sc.nextFloat();
        System.out.println("insira o valor que voce ganha por hora: ");
        valorPorHora = sc.nextFloat();

        salario = horas * valorPorHora;

        System.out.printf("funcionario %d seu salario é de: %.2f", numero, salario);

        sc.close();
    }
}