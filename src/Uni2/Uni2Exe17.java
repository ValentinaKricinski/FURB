import java.util.Scanner;

public class Uni2Exe17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("");
        String nome= sc.nextLine();
        System.out.println("insira o numero de horas trabalhadas mensais: ");
        double horasTrabalhadas = sc.nextDouble();
        System.out.println("insira o numero de dependentes: ");
        int dependentes = sc.nextInt();

        double salarioTrabalho = horasTrabalhadas * 10;
        int salarioFamilia = dependentes * 60;
        double salarioBruto = salarioTrabalho + salarioFamilia;
        /* no salario liquido e descontado 8,5% e 5% = 13,5 */
        double salarioLiquido = salarioBruto * 13.5/100;

        System.out.println("Funcionario(a) " + nome + "seu salario bruto e de: R$" + salarioBruto + ", e seu salario liquido e de: R$" + salarioLiquido);

        sc.close();

    }
    
}
