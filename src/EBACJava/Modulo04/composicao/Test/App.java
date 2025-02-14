package EBACJava.Modulo04.composicao.Test;

import EBACJava.Modulo04.composicao.Domain.Banco;
import EBACJava.Modulo04.composicao.Domain.ContaCorrente;
import EBACJava.Modulo04.composicao.Domain.ContaPoupanca;

public class App {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setNome("Banco Gabs");
        banco.setCodigo(777L);

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(99D);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(15000D);
    }
}
