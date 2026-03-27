import java.util.Scanner;

public class Uni2Exe01 {
    public static void main(String[] args) {
        int numero1,numero2, soma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        numero1= sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        numero2= sc.nextInt();
        soma= numero1 + numero2;
        System.out.println("A soma dos dois numeros é: " + soma);
    
        sc.close();

    }
    
}
