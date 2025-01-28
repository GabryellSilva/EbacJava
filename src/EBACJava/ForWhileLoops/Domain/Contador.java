package EBACJava.ForWhileLoops.Domain;

public class Contador {
    public static void main(String[] args) {
        for (int contador =5; contador <= 100; contador++){
            if (contador%5!=0){
                continue;
            }
            System.out.println("Nr do contador: "+contador);
        }
    }
}
