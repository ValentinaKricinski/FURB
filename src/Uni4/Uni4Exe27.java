package Uni4;

import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hChegada, mChegada, hSaida, mSaida;
        int inicio, fim, duracao;
        int horas, minResto;
        double preco = 0;

        // Entrada
        System.out.print("insira a hora da chegada: ");
        hChegada = sc.nextInt();

        System.out.print("insira o minuto da chegada: ");
        mChegada = sc.nextInt();

        System.out.print("insira a hora de saída: ");
        hSaida = sc.nextInt();

        System.out.print("insira o minuto de saída: ");
        mSaida = sc.nextInt();

        if (hChegada < 0 || hChegada > 23 ||
            hSaida < 0 || hSaida > 23 ||
            mChegada < 0 || mChegada > 59 ||
            mSaida < 0 || mSaida > 59) {

            System.out.println("horário inválido");
            return;
        }

        inicio = hChegada * 60 + mChegada;
        fim = hSaida * 60 + mSaida;

        if (fim <= inicio) {
            System.out.println("horário inválido");
            return;
        }

        duracao = fim - inicio;

        horas = duracao / 60;
        minResto = duracao % 60;

        if (duracao < 30) {
            horas = 1;
        } else {
            if (minResto >= 30) {
                horas++;
            }
        }

        if (horas <= 2) {
            preco = horas * 5;
        } else if (horas <= 4) {
            preco = (2 * 5) + (horas - 2) * 7.5;
        } else {
            preco = (2 * 5) + (2 * 7.5) + (horas - 4) * 10;
        }

        System.out.println("tempo de estacionamento: " + horas + " hora(s)");
        System.out.printf("preço cobrado = R$%.2f\n", preco);

        sc.close();
    }
}
