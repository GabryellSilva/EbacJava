package EBACJava.Modulo04.abstratas.Domain;

public class Horista extends Empregado{
    private Double precoHora;
    private Double TotalhorasTrabalhadas;

    public Double getPrecoHora() {
        return precoHora;
    }

    public Double getTotalhorasTrabalhadas() {
        return TotalhorasTrabalhadas;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public void setTotalhorasTrabalhadas(Double totalhorasTrabalhadas) {
        TotalhorasTrabalhadas = totalhorasTrabalhadas;
    }

    @Override
    public Double vencimento() {
        return precoHora * TotalhorasTrabalhadas;
    }
}
