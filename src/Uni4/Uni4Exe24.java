import java.util.Scanner;

public class Prova24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira o valor 1:");
        int v1 = sc.nextInt();
        System.out.println("insira o valor 2:");
        int v2 = sc.nextInt();
        System.out.println("insira o valor 3:");
        int v3 = sc.nextInt();
        System.out.println("se opção = 1, escreva os 3 valores em ordem crescente\r\n" + //
                            "se opção = 2, escreva os 3 valores em ordem decrescente\r\n" + //
                            "se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio\r\n" + //
                            "Insira a opção:");
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
