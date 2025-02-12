package EBACJava.Modulo04.abstratas.Domain;

public class Comissionado extends Empregado {
    private Double totalDeVendas;
    private Double taxaDeComissao;

    public void setTaxaDeComissao(Double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }

    public void setTotalDeVendas(Double totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }

    @Override
    public Double vencimento() {
        return totalDeVendas*taxaDeComissao;
    }
}
