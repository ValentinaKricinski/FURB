import java.util.Scanner;

public class Uni2Exe09 {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("insira o valor em dolares: ");
        double dolar = sc.nextDouble();
        final double cotacao = 5.26;
        double conversao= dolar * cotacao;
        System.out.println("voce recebera em reais: " + conversao);
   
    sc.close();
   
    }
    
}
