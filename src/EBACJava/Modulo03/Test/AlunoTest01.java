package EBACJava.Modulo03.Test;

import EBACJava.Modulo03.Domain.Aluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlunoTest01 {
    public static void main(String[] args) {
    exemploDeListaSimplesOrdenadaClasseExterna();

    }
    public static void exemploDeListaSimplesOrdenadaClasseExterna(){
        List<Aluno> lista = new ArrayList<Aluno>();


        Aluno aluno1 = new Aluno("Gabryell", "Linux Basico", 0.0);
        Aluno aluno2 = new Aluno("Layane", "Pacote Office", 0.0);
        Aluno aluno3 = new Aluno("Rafa", "Execel basico", 0.0);

        lista.add(aluno1);
        lista.add(aluno2);
        lista.add(aluno3);
        System.out.println(" Lista sem Ordenação "+lista);
        Collections.sort(lista);


    }
}
