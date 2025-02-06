package EBACJava.Modulo03.Exercicios.Coleções.Test;

import EBACJava.Modulo03.Exercicios.Coleções.Domain.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static EBACJava.Modulo03.Domain.Publica.marcaDoConsole;

public class LeituraAndOrdenacaoTest01 {
      /*
        Fazer um programa que leia um nome e o sexo. Separar as pessoas por grupos.
        Masculino e Feminino

     */
      public static void main(String[] args) {
          listaDeNomeSeparadasPorSexo();
      }

    public static void listaDeNomeSeparadasPorSexo() {

        Scanner s = new Scanner(System.in);

        // Criação de duas listas separadas
        List<String> listaMasculina = new ArrayList<>();
        List<String> listaFeminina = new ArrayList<>();

        while (true) {
            System.out.println("Lista de nomes");
            System.out.println("Digite seu nome: (ou digite 'sair' para terminar");
            String nome = s.nextLine();

            // finaliza o processo
            if (nome.equals("sair")) {
                break;
            }

            System.out.println("Digite o seu sexo -> 'Masculino' ou 'Feminino' ");
            s.nextLine();

            // controle de fluxo e separação das listas

            if (nome.equalsIgnoreCase("masculino")) {
                listaMasculina.add(nome);

            } else if (nome.equalsIgnoreCase("feminino")) {
                listaFeminina.add(nome);

            } else {
                System.out.println("Sexo invalido! tente novamente ");
            }

            // for para exibição das litas
        }

        System.out.println("Grupo Masculino");
            for (String nome: listaMasculina){
                marcaDoConsole();
                System.out.println(nome);
            }

        System.out.println("Grupo feminino");
            for (String nome: listaFeminina){
                marcaDoConsole();
                System.out.println(nome);
            }


    }
}
