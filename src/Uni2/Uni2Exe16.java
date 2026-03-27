import java.util.Scanner;

public class Uni2Exe16 {
    public static void main(String[] args) {
        
        int lata, garrafaPequena, garrafaGrande, litragemFinal;

        Scanner sc = new Scanner(System.in);
        System.out.println("insira a quantidade de latas de 350ml: ");
        lata = sc.nextInt();
        System.out.println("insira a quantidade de garrafa de 600ml: ");
        garrafaPequena = sc.nextInt();
        System.out.println("insira a quantidade de garrafa de 2L: ");
        garrafaGrande = sc.nextInt();

        litragemFinal= ((lata*350)/1000) + ((garrafaPequena*600)/1000) + (garrafaGrande*2);

        System.out.println("a quantidade de litros de refrigerante comprado é: " + litragemFinal);

        sc.close();
    
    }

    
    
    
}
