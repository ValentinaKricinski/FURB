import java.util.Scanner;

public class Uni2Exe13 {
    public static void main(String[] args) {

        int distancia, tempo;

        Scanner sc = new Scanner(System.in);

        System.out.print("insira a distancia em km: ");
        distancia = sc.nextInt();

        tempo = distancia*2;

        System.out.println(tempo + " minutos");

        sc.close();
    }
    
}
