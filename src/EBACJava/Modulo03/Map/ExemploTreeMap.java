package EBACJava.Modulo03.Map;


import java.util.HashMap;
import java.util.Map;

public class ExemploTreeMap {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesInterandoChaveValor();
    }

    private static void exemploListaSimplesInterandoChaveValor() {
        
    }

    private static void exemploListaSimples() {
        System.out.println("Exemplo Lista Simples");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1,"Gabryell - Lista Simples");
        lista.put(2,"Lay - Lista Simples");
        lista.put(3,"Well - Lista Simples");

        System.out.println(lista);
    }
}
