package EBACJava.Modulo04.Interface.Test;

import EBACJava.Modulo04.Interface.Domain.*;
import EBACJava.Modulo04.Interface.Interface.ICaneta;
import EBACJava.Modulo04.Interface.Interface.ICarro;

import static EBACJava.Modulo03.Domain.Publica.marcaDoConsole;

public class ClasseTest {
    public static void main(String[] args) {
        ICaneta caneta = new CanetaEstereografica();
        caneta.escrever("Olá meu nobre");
        caneta.getCor();
        System.out.println(caneta.getCor());

        ICaneta giz = new Giz();
        giz.escrever("Bom dia");
        giz.getCor();
        System.out.println(giz.getCor());

        ICaneta lapis = new Lapis();
        lapis.escrever("Escrevendo a lapis");
        lapis.getCor();
        System.out.println(lapis.getCor());


        caneta.escritaIgualATodas();
        giz.escritaIgualATodas();
        lapis.escritaIgualATodas();

        marcaDoConsole();

        ICarro carro = new CarroPasseio();
        carro.andar();
        carro.parar();

        marcaDoConsole();

        ICarro caminhonete = new Caminhao();
        caminhonete.andar();
        caminhonete.parar();
    }
}
