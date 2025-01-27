package EBACJava.Modulo02.Test;

import EBACJava.Modulo02.Domain.CalculoMedia;

public class CalculoMediaTest01 {
    public static void main(String[] args) {
        CalculoMedia calculoMedia = new CalculoMedia();
        calculoMedia.setPrimeiraNota(6);
        calculoMedia.setSegundaNota(7);
        calculoMedia.setTerceiraNota(8);
        calculoMedia.setQuartaNota(8);
        calculoMedia.imprimeResultado();
    }
}
