package EBACJava.Modulo03.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExemploDeHashMap {
    public static void main(String[] args) {
        exemploListaSimples();
       exemploListaSimplesInterandoChaveValor();
    }

    private static void exemploListaSimples() {
        System.out.println("Exemplo Lista Simples");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1,"Gabryell - Lista Simples");
        lista.put(2,"Lay - Lista Simples");
        lista.put(3,"Well - Lista Simples");

        System.out.println(lista);
        System.out.println("=================================");
    }


    private static void exemploListaSimplesInterandoChaveValor() {
        System.out.println("Exemplo de lista simples Interando Chave Valor");
        System.out.println("");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "Gabryell");
        lista.put(2, "Lay");
        lista.put(3, "Well");

        System.out.println("Interação com For comum");
        System.out.println("");

        Set<Map.Entry<Integer, String>> entry = lista.entrySet();
        for (Map.Entry<Integer, String> e : entry){
            System.out.println(" Chave: "+e.getKey()+ " --> "+ "Valor: "+e.getValue());

        }
        System.out.println("=================================");

        System.out.println("ForEach Stream");

        lista.entrySet().forEach(e ->{
            System.out.println("Chave: "+ e.getKey()+ " --> "+ "Valor: "+e.getValue());
        });

        System.out.println("=================================");

        System.out.println("ForEach Stream 1");
        lista.keySet().stream().forEach(System.out::println);

        System.out.println("=================================");

        System.out.println("ForEach Stream 2");
        lista.values().stream().forEach(System.out::println);

        System.out.println("=================================");

        System.out.println("ForEach Stream 3");
        lista.forEach((key, value) -> System.out.println(key + " "+ value));

        System.out.println("=================================");


        System.out.println("Interator");
        Iterator<Map.Entry<Integer, String>> it = lista.entrySet().iterator();
            while (it.hasNext()){
                Map.Entry<Integer, String > entry1 = it.next();
                System.out.println("Chave: "+entry1.getKey());
                System.out.println("Valor: "+entry1.getValue());
            }

    }
}
