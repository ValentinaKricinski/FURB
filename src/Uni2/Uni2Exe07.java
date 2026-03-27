import java.util.Scanner;

public class Uni2Exe07 {
    public static void main(String[] args) {
        int salarioFixo, totalDeVendas, salarioTotal;
        String nome;

        Scanner sc=new Scanner(System.in);
        System.out.println("insira seu nome: ");
        nome = sc.next();
        System.out.println("insira o valor de seu salario fixo: ");
        salarioFixo = sc.nextInt();
        System.out.println("insira o seu total de vendas: ");
        totalDeVendas = sc.nextInt();

        salarioTotal = ((totalDeVendas*15)/100)  + salarioFixo;

        System.out.println("nome do vendedor: " + nome + " ,seu salario com o valor de sua comissao e de: " + salarioTotal);
      
        
    sc.close();
    
    }
    
}
