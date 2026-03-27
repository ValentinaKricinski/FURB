import java.util.Scanner;

public class Uni2Exe05 {
    public static void main(String[] args) {
        int a, b, c, d, dife;
        Scanner sc= new Scanner(System.in);
        System.out.println("insira o valor de a: ");
        a= sc.nextInt();
        System.out.println("insira o valor de b: ");
        b= sc.nextInt();
        System.out.println("insira o valor de c: ");
        c= sc.nextInt();
        System.out.println("insira o valor de d: ");
        d= sc.nextInt();

        dife= (a*b - c*d);
        System.out.println("a diferença do produto de A e B pelo produto de C e D  é:   " + dife );
    
    sc.close();
    
    }
    
}
