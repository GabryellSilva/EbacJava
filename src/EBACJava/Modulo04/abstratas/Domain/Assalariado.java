package EBACJava.Modulo04.abstratas.Domain;

public class Assalariado extends Empregado{
    private Double salario;

    public void setSalario(Double salario) {
        this.salario = salario;
    }



    @Override
    public Double vencimento() {
        return salario;
    }
}
