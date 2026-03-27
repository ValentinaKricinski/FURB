import java.util.Scanner;

public class Uni2Exe11 {
    public static void main(String[] args) {

        double a,b,c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("insira o valor de a: ");
        a = sc.nextDouble(); 
        System.out.println("insira o valor de b: ");
        b = sc.nextDouble();
        System.out.println("insira o valor de c: ");
        c = sc.nextDouble();

        areaTriangulo= (a*c)/2;
        areaCirculo= Math.pow(c, 2) * Math.PI;
        areaTrapezio= ((a+b)*c)/2;
        areaQuadrado= Math.pow(b, 2);
        areaRetangulo= a*b;

        System.out.println("a area do triangulo é: " + areaTriangulo);
        System.out.println("a area do circulo e: " + areaCirculo);
        System.out.println("a area do trapezio e: " + areaTrapezio);
        System.out.println("a area do quadrado e: " + areaQuadrado);
        System.out.println("a area do retangulo e: " + areaRetangulo);

    sc.close();  

    }
    
}
