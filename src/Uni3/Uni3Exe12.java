package Uni3;

import java.util.Scanner;

public class Uni3Exe12 {
    private String nome;
    private float nHoras;
    private int nDependentes;

    public Uni3Exe12(String nome, float nHoras, int nDependentes){
        this.nome = nome;
        this.nHoras = nHoras;
        this.nDependentes = nDependentes;
    }

    public float calcularSalarioTrabalho(){
        return nHoras * 10;

    }

    public int calcularSalarioFamilia(){
        return nDependentes* 60;                             

    }

    public float calcularSalarioBruto(){
        return calcularSalarioTrabalho() + calcularSalarioFamilia();
    }

    public float calcularSalarioLiquido(){
        return (calcularSalarioBruto() - (13.5f/100));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira seu nome: ");
        String nome = sc.next();
        System.out.println("insira o numero de horas trabalhadas mensais: ");
        float nHoras = sc.nextFloat();
        System.out.println("insira o numero de dependentes: ");
        int nDependentes = sc.nextInt();

        Uni3Exe12 uni = new Uni3Exe12(nome, nHoras, nDependentes);
        System.out.printf("O funcionario %s passui um salario bruto de R$%.2f e um salario liquido de R$%.2f.", nome, uni.calcularSalarioBruto(), uni.calcularSalarioLiquido());

        sc.close();
    }

}

/* atributos: nome, nHoras, nDependentes

metodo: calcularSalarioTrabalho, calcularSalarioFamilia ,  */