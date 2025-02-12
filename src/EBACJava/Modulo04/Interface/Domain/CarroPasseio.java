package EBACJava.Modulo04.Interface.Domain;

import EBACJava.Modulo04.Interface.Interface.ICarro;

public class CarroPasseio implements ICarro {

    public static void main(String[] args) {
        ICarro carroDePasseio = new CarroPasseio();
        carroDePasseio.andar();
    }
}
