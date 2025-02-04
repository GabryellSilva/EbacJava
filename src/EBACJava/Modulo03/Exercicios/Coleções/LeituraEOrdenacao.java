package EBACJava.Modulo03.Exercicios.Coleções;

import java.util.*;

import static EBACJava.Modulo03.Domain.Publica.marcaDoConsole;

public class LeituraEOrdenacao {
    /*
        Fazer um programa que leia um nome e o sexo. Separar as pessoas por grupos.
        Masculino e Feminino

     */
    public static void main(String[] args) {
        leituraDosDados();
    }


    private static void leituraDosDados() {
        Scanner s = new Scanner(System.in);
        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        while (true) {
            System.out.println("Digite seu nome (ou 'sair' para terminar");
            String nome = s.nextLine();

            if (nome.equals("sair")) {
                break;
            }

            System.out.println("digite seu sexo -> Femino or Masculino");
            String sexo = s.nextLine();

            if (sexo.equalsIgnoreCase("Masculino")) {
                masculino.add(nome);
            }
            else if (sexo.equalsIgnoreCase("Feminino")){
                feminino.add(nome);
            }
            else {
                System.out.println("sexo invalido");
            }

        }
        System.out.println("Grupo Masculino");
        for (String nome: masculino){
            marcaDoConsole();
            System.out.println(nome);
        }

        System.out.println("Grupo Feminino");
        for (String nome: feminino){
            marcaDoConsole();
            System.out.println(feminino);
        }
    }


}
