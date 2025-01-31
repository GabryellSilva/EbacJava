package EBACJava.Modulo03.Test;

import EBACJava.Modulo03.Domain.Aluno;
import EBACJava.Modulo03.Domain.ComparaNotaAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlunoTest01 {
    public static void main(String[] args) {
    exemploDeListaSimplesOrdenadaClasseExterna();
    exemploListaSimplesOrdenadaComparactor();

    }
    public static void exemploDeListaSimplesOrdenadaClasseExterna(){
        List<Aluno> lista = new ArrayList<Aluno>();


        Aluno aluno1 = new Aluno("Tereza", "Linux Basico", 0.0);
        Aluno aluno2 = new Aluno("Layane", "Pacote Office", 0.0);
        Aluno aluno3 = new Aluno("Julia", "Execel basico", 0.0);

        lista.add(aluno1);
        lista.add(aluno2);
        lista.add(aluno3);
        System.out.println(" Lista sem Ordenação "+lista);
//        Collections.sort(lista);
        System.out.println(" Lista com Ordenação "+ lista);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista, comparaNotaAluno);
        System.out.println("Lista de ordenação por nota " + lista);
        System.out.println(" ");
 
    }
    public static void exemploListaSimplesOrdenadaComparactor(){
        System.out.println("==================");
        System.out.println(" exemploListaSimplesOrdenadaComparacto ");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno aluno1 = new Aluno("Tereza", "Linux Basico", 6.0);
        Aluno aluno2 = new Aluno("Layane", "Pacote Office", 7.0);
        Aluno aluno3 = new Aluno("Julia", "Execel basico", 9.0);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();

        lista.add(aluno1);
        lista.add(aluno2);
        lista.add(aluno3);

        Collections.sort(lista, comparaNotaAluno);
        System.out.println("Lista Ordenada por nota "+ lista);
        System.out.println(" ");
    }
}
