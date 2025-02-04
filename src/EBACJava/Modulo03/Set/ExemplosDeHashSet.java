package EBACJava.Modulo03.Set;

import java.util.HashSet;
import java.util.Set;

public class ExemplosDeHashSet {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesAscendente();
    }

    private static void exemploListaSimplesAscendente() {
        Set<String> lista = new HashSet<String>();
        lista.add("Bruno");
        lista.add("Kay");
        lista.add("Jota");
        lista.add("Kay");
        // Collections.sort(lista);

        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimples() {
        Set<String> lista = new HashSet<>();
        lista.add("Gabryell");
        lista.add("Layane");
        lista.add("Well");
        System.out.println(lista);
        System.out.println();
    }
}