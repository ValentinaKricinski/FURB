import java.util.Scanner;

public class Uni2Exe02 {
    public static void main(String[] args) {
        int numero1, numero2, multi;
        Scanner sc= new Scanner(System.in);
        System.out.println("insira o primeiro numero: ");
        numero1= sc.nextInt();
        System.out.println("insira o segundo numero: ");
        numero2= sc.nextInt();
        multi= numero1 * numero2;
        System.out.println("a multiplicacao do primeiro numero e do segundo e: " + multi);
    
    sc.close();
    
    }   
    
}
