package Uni4;

import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o dia do vencimento: ");
        int diaVencimento = sc.nextInt();
        System.out.println("insira o dia do pagamento: ");
        int diaPagamento = sc.nextInt();
        System.out.println("insira o valor da prestação: ");
        float valorPrestacao = sc.nextFloat();

if (diaPagamento <= diaVencimento) {
            float valorFinal = valorPrestacao - (valorPrestacao*0.10f);
            System.out.printf("O pagamento está em dia. O valor da prestação = R$%.2f", valorFinal);

        // Até 5 dias
        } else if (diaPagamento <= diaVencimento + 5) {
            float valorFinal = valorPrestacao;
            System.out.printf("O pagamento foi realizado até 5 dias após o vencimento. Valor da prestação = R$%.2f", valorFinal);

        // Mais de 5 dias
        } else {
            int diasAtraso = diaPagamento - diaVencimento;
            float valorFinal = valorPrestacao + ((valorPrestacao *0.02f) * (diasAtraso));
            System.out.printf("O pagamento está atrasado. Multa de 2 porcento por dia de atraso. Valor da prestação = R$%.2f", valorFinal);
        }

        sc.close();
    }
}
