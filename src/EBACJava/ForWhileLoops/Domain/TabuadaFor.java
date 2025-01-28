package EBACJava.ForWhileLoops.Domain;

import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Tabuada de for");
        System.out.println("Selecione um valor: ");
        int num = s.nextInt();

        for (int i = 0; i <=10; i++){
            System.out.println(num + "X"+ i+ " = "+ num*i);
        }
    }
}
