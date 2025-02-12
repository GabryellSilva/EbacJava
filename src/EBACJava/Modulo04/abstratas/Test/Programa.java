package EBACJava.Modulo04.abstratas.Test;

import EBACJava.Modulo04.abstratas.Domain.Assalariado;
import EBACJava.Modulo04.abstratas.Domain.Comissionado;
import EBACJava.Modulo04.abstratas.Domain.Empregado;
import EBACJava.Modulo04.abstratas.Domain.Horista;

import static EBACJava.Modulo03.Domain.Publica.marcaDoConsole;

public abstract class Programa {
    public static void main(String[] args) {
        empregadoAssalariado();
        marcaDoConsole();
        empregadoComissionado();
        marcaDoConsole();
        empregadoHorista();

    }

    private static void empregadoHorista() {
        Horista empregadoHorista = new Horista();
        empregadoHorista.setPrecoHora(100D);
        empregadoHorista.setTotalhorasTrabalhadas(75D);
        empregadoHorista.setCpf("1235");
        empregadoHorista.setNome("Jenifer");
        empregadoHorista.setSobrenome("Rodrigues");

        imprimir(empregadoHorista);
    }

    private static void empregadoComissionado() {
        Comissionado empregadoComissionado = new Comissionado();
        empregadoComissionado.setTaxaDeComissao(10D);
        empregadoComissionado.setTotalDeVendas(100D);
        empregadoComissionado.setCpf("1235");
        empregadoComissionado.setNome("Roberta");
        empregadoComissionado.setSobrenome("Silva");

        imprimir(empregadoComissionado);
    }

    private static void empregadoAssalariado() {
        Assalariado empregadoAssalariado = new Assalariado();
        empregadoAssalariado.setCpf("06266324474");
        empregadoAssalariado.setNome("Gabryell");
        empregadoAssalariado.setSobrenome("Silva");
        empregadoAssalariado.setSalario(1500D);
        imprimir(empregadoAssalariado);

    }

    public static void imprimir(Empregado empregado){

        if (empregado instanceof Horista){
            Horista hor = (Horista) empregado;
            System.out.println("Por ter trabalhado por: "+hor.getTotalhorasTrabalhadas()+" horas este mês.");
        }
        System.out.println(empregado.getNome()+" "+empregado.getSobrenome()+ " tem o salario no valor de: "+empregado.vencimento());
    }

}
