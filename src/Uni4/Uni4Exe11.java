package Uni4;

import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira a primeira idade: ");
        int idade1 = sc.nextInt();
        System.out.println("insira a segunda idade: ");
        int idade2 = sc.nextInt();
        System.out.println("insira a terceira idade: ");
        int idade3 = sc.nextInt();

        if(idade1 == idade2 && idade1 == idade3){
            System.out.println("Trigêmeos");
        } else if(idade1 == idade2 || idade2 == idade3 || idade2 == idade3){
            System.out.println("Gêmeos");
        } else {
            System.out.println("Irmãos");
        }

        sc.close();
    }
    
}
