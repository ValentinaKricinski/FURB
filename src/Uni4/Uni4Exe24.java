/* Dados 3 valores, escreva um algoritmo que os informe em uma determinada 
ordem a partir de um menu de opções:

se opção = 1, escreva os 3 valores em ordem crescente
se opção = 2, escreva os 3 valores em ordem decrescente
se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio

Exemplos de entrada	Exemplos de saída
Valor 1: 5 Valor 2: 3 Valor 3: 2 Opção: 1	2 3 5
Valor 1: 5 Valor 2: 3 Valor 3: 2 Opção: 2	5 3 2
Valor 1: 5 Valor 2: 3 Valor 3: 2 Opção: 3	3 5 2 */

import java.util.Scanner;

public class Prova24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("v1:");
        int v1 = sc.nextInt();
        System.out.println("v2:");
        int v2 = sc.nextInt();
        System.out.println("v3:");
        int v3 = sc.nextInt();
        System.out.println("opcao:");
        int opcao = sc.nextInt();

        int maior,menor,meio;
        /*maior */
        if(v1>=v2 && v1>=v3){
            maior=v1;
        }else if(v2>=v1 && v2>=v3){
            maior=v2;
        }else{
            maior=v3;
        }

        /*menor */
        if(v1<=v2 && v1<=v3){
            menor=v1;
        }else if(v2<=v1 && v2<=v3){
            menor=v2;
        }else{
            menor=v3;
        }

        /*meio */
        meio= v1+v2+v3-menor-maior;

        switch (opcao) {
            case 1:
                System.out.println(menor + " " + meio + " " + maior);
                break;

            case 2:
                System.out.println(maior + " " + meio + " " + menor);
                break;

            case 3:
                System.out.println(meio + " " + maior + " " + menor);
                break;

            default:
                System.out.println("Opcao invalida");
        }

        sc.close();
    }
 
}
