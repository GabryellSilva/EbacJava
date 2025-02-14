package EBACJava.Modulo04.composicao.Domain;

import java.util.HashSet;
import java.util.Set;

public class Banco {

    private Long code;

    private String nome;

    private Set<ContaCorrente> contaCorrentes;
    private Set<ContaPoupanca> contaPoupancas;

    public Banco(){
        this.contaCorrentes = new HashSet<>();
        this.contaCorrentes = new HashSet<>();
    }

    public void add(ContaCorrente cc){
        this.contaCorrentes.add(cc);
    }

    public void add(ContaPoupanca cp){
        this.contaPoupancas.add(cp);
    }

    public Long getCodigo() {
        return code;
    }

    public void setCodigo(Long codigo) {
        this.code = code;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
