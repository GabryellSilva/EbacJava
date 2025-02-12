package EBACJava.Modulo04.Interface.Interface;

public interface ICaneta {

    public void escrever(String texto);

    public String getCor();

    default void escritaIgualATodas(){
        System.out.println("Escrita igual a todas");
    }
}
