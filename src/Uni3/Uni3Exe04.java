package Uni3;

import java.util.Scanner;

public class Uni3Exe04 {
    private float nota1,nota2,nota3;

    public Uni3Exe04(float nota1, float nota2, float nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public float calcularMediaPonderada(){
        return ((this.nota1 * 5) + (this.nota2 * 3) + (this.nota3 * 2))/10; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a primeira nota: ");
        float n1 = sc.nextFloat();
        System.out.println("insira a segunda nota: ");
        float n2 = sc.nextFloat();
        System.out.println("insira a terceira nota: ");
        float n3 = sc.nextFloat();
        
        Uni3Exe04 uni = new Uni3Exe04(n1, n2, n3);
        System.out.printf("Sua media ponderada e: %.2f", uni.calcularMediaPonderada());

        sc.close();
    }
}


/* atributos: nota1,nota2,nota3


metodos: calcularMediaPonderada

*/