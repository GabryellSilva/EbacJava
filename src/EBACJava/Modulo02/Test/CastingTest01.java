package EBACJava.Modulo02.Test;

public class CastingTest01 {
    //Atributos
    private int valorNumerico;


    //Gettrs and setters
    public int getValorNumerico() {
        return valorNumerico;
    }

    public void setValorNumerico(int valorNumerico) {
        this.valorNumerico = valorNumerico;
    }

    //Metodo

    public void imprimeValor(){
        this.valorNumerico = valorNumerico;

        System.out.println("Antes da conversão Casting " + valorNumerico);
        Integer valorNumerico2 = valorNumerico;
        System.out.println("Pós conversão do Warppers " + valorNumerico2);
    }


    public static void main(String[] args) {
        CastingTest01 casting = new CastingTest01();
        casting.setValorNumerico(50);
        casting.imprimeValor();
    }


}
