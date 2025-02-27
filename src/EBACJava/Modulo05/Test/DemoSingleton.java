package EBACJava.Modulo05.Test;

import EBACJava.Modulo05.Singleton;

public class DemoSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstace();
        Singleton singleton1 = Singleton.getInstace();
        System.out.println(singleton);
        System.out.println(singleton1);
    }
}
