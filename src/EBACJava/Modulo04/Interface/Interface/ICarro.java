package EBACJava.Modulo04.Interface.Interface;

public interface ICarro {

    default void andar(){
        System.out.println("O veiculo está em movimento");
    }

    default void parar(){
        System.out.println("O veiculo está parando");

    }
}
