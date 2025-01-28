package EBACJava.ForWhileLoops.Domain;

import java.util.Scanner;

public class TabuadaWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Tabuadas");
        System.out.println("Gostaria de criar uma tabuada?");
        String resposta = s.nextLine();


        while (resposta.equals("sim")){
            System.out.println("Digite um número para criação da Tabuada");
            int num = s.nextInt();
            for (int i = 0; i <=10; i++){
                System.out.println(num+ " X "+ i+ " = "+ num*i);
            }

            System.out.println("Deseja Criar uma nova Tabuada?");
            resposta = s.next();
        }
        System.out.println("Obrigado");

    }
}
