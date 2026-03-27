import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("insira o tempo de duracao em segundos: ");
        
        
        int totalSegundos = sc.nextInt();
        
        int horas = totalSegundos /3600;

        int resto = totalSegundos % 3600;

        int minutos = resto /60;

        int segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);


    sc.close();
    
    }
    
}

