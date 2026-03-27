import java.util.Scanner;

public class Uni2Exe20 {
    public static void main(String[] args) {

        int n, lado, quadrados;
        Scanner sc = new Scanner(System.in);

        System.out.print("insira o número de dobras: ");
        n = sc.nextInt();

        lado = (int)Math.pow(2, n) + 1;
        quadrados = lado * lado;

        System.out.println("Quantidade de quadrados: " + quadrados);

        sc.close();
    }
}
