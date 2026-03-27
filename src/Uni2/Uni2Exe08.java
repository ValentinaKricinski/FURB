import java.util.Scanner;

public class Uni2Exe08 {
    public static void main(String[] args) {
        int codigo1, codigo2, numeroDePecas1, numeroDePecas2, valorunitario1, valorunitario2, valorTotal;

        Scanner sc = new Scanner(System.in);
        System.out.println("insira o codigo da primeira peça: ");
        codigo1 = sc.nextInt();
        System.out.println("insira o numero de pecas da primeira: ");
        numeroDePecas1 = sc.nextInt();
        System.out.println("insira o valor unitario da primeira peca: ");
        valorunitario1 = sc.nextInt();
        System.out.println("insira o codigo da segunda peça: ");
        codigo2 = sc.nextInt();
        System.out.println("insira o numero de pecas da segunda: ");
        numeroDePecas2 = sc.nextInt();
        System.out.println("insira o valor unitario da segunda peca: ");
        valorunitario2 = sc.nextInt();

        valorTotal = (valorunitario1 * numeroDePecas1) + (valorunitario2 * numeroDePecas2);

        System.out.println("o valor total das pecas " + codigo1 + " e " + codigo2 + "  é: " + valorTotal );
        

    sc.close();


    }
    
}
