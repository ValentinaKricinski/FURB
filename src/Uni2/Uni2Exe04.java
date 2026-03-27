import java.util.Scanner;

public class Uni2Exe04 {
    public static void main(String[] args) {
        float nota1, nota2, soma;

        Scanner sc= new Scanner(System.in);
        System.out.println("insira a primeira nota: ");
        nota1= sc.nextFloat();
        System.out.println("insira a segunda nota: ");
        nota2= sc.nextFloat();

        soma= (nota1*3.5f + nota2*7.5f)/11;
        System.out.println("Sua nota é: " + soma);

    sc.close();
    
    }
    
}
