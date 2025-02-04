package EBACJava.Modulo03.Set;

import EBACJava.Modulo03.Domain.Aluno;

import java.util.HashSet;
import java.util.Set;

import static EBACJava.Modulo03.Domain.Publica.marcaDoConsole;

public class ExemploHashSetAluno {
    public static void main(String[] args) {
        exemploHashSetComObjetos();
        exemploConsultado();
    }

    private static void exemploConsultado() {
        marcaDoConsole();
        Aluno a1 = new Aluno("Gabryell", "Linux", 6.0);
        Aluno a2 = new Aluno("Lay", "Excel", 9.0);
        Aluno a3 = new Aluno("Well", "Python", 10.0);
        Aluno a4 = new Aluno("Well", "Python", 10.0);

        Set<Aluno> listaAlunos = new HashSet<>();
        listaAlunos.add(a1);
        listaAlunos.add(a2);
        listaAlunos.add(a3);
        listaAlunos.add(a4);

        System.out.println(listaAlunos.contains(a1));

    }



    private static void exemploHashSetComObjetos() {
        marcaDoConsole();

        Aluno a1 = new Aluno("Gabryell", "Linux", 6.0);
        Aluno a2 = new Aluno("Lay", "Excel", 9.0);
        Aluno a3 = new Aluno("Well", "Python", 10.0);
        Aluno a4 = new Aluno("Well", "Python", 10.0);

        Set<Aluno> listaAlunos = new HashSet<>();
        listaAlunos.add(a1);
        listaAlunos.add(a2);
        listaAlunos.add(a3);
        listaAlunos.add(a4);


        for (Integer i = 0; i < listaAlunos.size(); i++ ){
            System.out.println(listaAlunos);
        }

    }
}
