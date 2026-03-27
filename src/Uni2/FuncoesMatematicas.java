import java.util.Random;

public class FuncoesMatematicas {
    public static void main(String[] args) {

        /* conteudo aula */
        /*raiz */
        double numero = 25;
        double valor= Math.sqrt(numero);
        System.out.println(valor);

        /*potencia*/
        numero = 4;
        double potencia = 16;
        valor= Math.pow(numero, potencia);
        System.out.println(valor);

        /* pi */
        final double pi= 3.14;

        /* maximo e minimo */
        int num1= 40;
        int num2= 35;
        int maiorNumero= Math.max(num1,num2);
        int menorNumero= Math.min(num1,num2); 
        System.out.println(maiorNumero);
        System.out.println(menorNumero);

        /* sorteio de numero */
        double aleatorio= Math.random();
        Random random= new Random();
        int numeroAleatorio = random.nextInt(100);
        System.out.println(numeroAleatorio);


    }
}
