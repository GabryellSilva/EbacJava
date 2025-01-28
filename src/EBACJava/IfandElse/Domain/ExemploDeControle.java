package EBACJava.IfandElse.Domain;

import java.util.Scanner;

public class ExemploDeControle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int resultado = 0;

        System.out.println("digite sua idade");
        int valorDoResultado = scan.nextInt();
        System.out.println("Você tem "+ valorDoResultado);
    }
}
