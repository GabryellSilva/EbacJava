package EBACJava.Modulo03.Exercicios.Coleções.Domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static EBACJava.Modulo03.Domain.Publica.marcaDoConsole;

public class ExercicioSplit {
    public static void main(String[] args) {
        leituraDoConsole();
    }

    private static void leituraDoConsole() {
        // string com os nomes agrupados

        String dadosMasculinos = "Gabryell, Well, Adriel";
        String dadosFemininos =  "Layane,Ana, Sineide";

        //Criação das listas

        List<String> listaMasculina = new ArrayList<>();
        List<String> listaFeminina = new ArrayList<>();

    // adiciono a string a lista e faço a remoção da virgula

        String[] nomeMasculinos = dadosMasculinos.split(",");
        String[] nomeFemininos = dadosFemininos.split(",");

    // Adiciona cada nome individualmente as listas, removendo espaços em branco

        for (String nome: nomeMasculinos){
            listaMasculina.add(nome.trim());
        }

        for (String nome: nomeFemininos){
            listaFeminina.add(nome.trim());
        }

        // ordena as duas listas

        Collections.sort(listaMasculina);
        Collections.sort(listaFeminina);

        // exibição da lista no console

        System.out.println("Grupo masculino");
        for (String nome: listaMasculina){
            System.out.println(nome + " - M");
        }

        marcaDoConsole();
        System.out.println("Grupo feminino");
        for (String nome: listaFeminina){
            System.out.println(nome + " - F");
        }

    }

}

