package Uni4;

import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("insira a hora da chegada: ");
        int horaChegada = sc.nextInt();

        System.out.println("insira o minuto da chegada: ");
        int minutoChegada = sc.nextInt();

        System.out.println("insira a hora de saída: ");
        int horaSaida = sc.nextInt();

        System.out.println("insira o minuto de saída: ");
        int minutoSaida = sc.nextInt();

        if (horaChegada < 0 || horaChegada > 23 || horaSaida < 0 || horaSaida > 23 ||
            minutoChegada < 0 || minutoChegada > 59 || minutoSaida < 0 || minutoSaida > 59 ||
            (horaSaida < horaChegada || (horaSaida == horaChegada && minutoSaida < minutoChegada))) {

            System.out.println("Horario inválido");
        } else {

            int tempoHora = horaSaida - horaChegada;
            int tempoMinuto = minutoSaida - minutoChegada;

            if (tempoMinuto < 0) {
                tempoMinuto += 60;
                tempoHora--;
            }

            int horasPagar;

            if (tempoHora == 0 && tempoMinuto < 30) {
                horasPagar = 1;
            } else if (tempoMinuto >= 30) {
                horasPagar = tempoHora + 1;
            } else {
                horasPagar = tempoHora;
            }

            if (horasPagar == 0) {
                horasPagar = 1;
            }

            double preco = 0;

            if (horasPagar >= 1) preco += 5;
            if (horasPagar >= 2) preco += 5;
            if (horasPagar >= 3) preco += 7.5;
            if (horasPagar >= 4) preco += 7.5;

            if (horasPagar >= 5) {
                preco += (horasPagar - 4) * 10;
            }

            System.out.println("Tempo de estacionamento: " + tempoHora + "h " + tempoMinuto + "min");
            System.out.printf("Preço cobrado = R$%.2f\n", preco);
        }

        sc.close();
    }
}