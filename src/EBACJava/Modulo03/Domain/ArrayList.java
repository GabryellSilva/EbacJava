package EBACJava.Modulo03.Domain;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList<S> {
    public static void main(String[] args) {
    exemplosDeListasSimples();
    exemploDeListaOrdenadaAscendida();
    exemploDeListaNumerica();
    }
    public static void exemplosDeListasSimples(){
        System.out.println("========== Exemplo de listas simples =====================");
        List<String> lista = new java.util.ArrayList<>();
        lista.add("João");
        lista.add("Maria");
        lista.add("Roberto");
        System.out.println(lista);
        System.out.println("");
    }

    public static void exemploDeListaNumerica(){
        System.out.println("EXEMPLO NUMEROS");
        List<Integer> numeros = new java.util.ArrayList<>();
        numeros.add(55);
        System.out.println(numeros);
    }

    public static void exemploDeListaOrdenadaAscendida(){
        System.out.println("========== Exemplo de listas Ordenada Ascendida =====================");
        List<String> lista2 = new java.util.ArrayList<>();
        lista2.add("Gabryell");
        lista2.add("Layane");
        lista2.add("Ana");
        Collections.sort(lista2);
        System.out.println(lista2);
        System.out.println("");
    }
}
