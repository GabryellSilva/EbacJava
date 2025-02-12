package EBACJava.Modulo04.Interface.Domain;

import EBACJava.Modulo04.Interface.Interface.ICaneta;

public class CanetaEstereografica implements ICaneta {



    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo o valor" + texto+ "Na classe "+ getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        return "Black";
    }
}
