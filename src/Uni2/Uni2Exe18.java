import java.util.Scanner;

public class Uni2Exe18 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o comprimento da parede em metros: ");
        double comprimento = sc.nextDouble();
        System.out.println("insira a altura da parede em metros: ");
        double altura = sc.nextDouble();

        double tamanho = comprimento * altura;
        double quantidadeAzulejo = tamanho * 9;
        double valor = quantidadeAzulejo * 12.50;

        System.out.println("O valor de azulejos para o tamanho da parede é de: " + valor);


        sc.close();
    }
    
}
