import java.util.Scanner;

public class Uni2Exe03 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    double raio;
    System.out.println("digite o valor do raio: ");
    raio= sc.nextDouble();
    double area = Math.pow(raio, 2) * Math.PI;

    System.out.println("A area total e de: " + area);
    
    sc.close();
    
    }

    
}
