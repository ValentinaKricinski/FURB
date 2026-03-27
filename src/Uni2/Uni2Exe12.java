import java.util.Scanner;

public class Uni2Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o valor x1 do ponto1: ");
        double x1 = sc.nextDouble();
        System.out.println("insira o valor y1 do ponto1: ");
        double y1 = sc.nextDouble();
        System.out.println("insira o valor x2 do ponto2: ");
        double x2 = sc.nextDouble();
        System.out.println("insira o valor y2 do ponto2: ");
        double y2 = sc.nextDouble();
        
        double distancia = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );
        
        System.out.println("a distancia dos dois pontos é: " + distancia);

    sc.close();

    }
    
}
