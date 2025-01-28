package EBACJava.Modulo02.Domain;

public class CalculoMedia {
    //Atributos

    private int primeiraNota;
    private int segundaNota;
    private int terceiraNota;
    private int quartaNota;
    private int mediaEntreNotas;

    // getts and setters
    public int getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(int primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public int getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(int segundaNota) {
        this.segundaNota = segundaNota;
    }

    public int getTerceiraNota() {
        return terceiraNota;
    }

    public void setTerceiraNota(int terceiraNota) {
        this.terceiraNota = terceiraNota;
    }

    public int getQuartaNota() {
        return quartaNota;
    }

    public void setQuartaNota(int quartaNota) {
        this.quartaNota = quartaNota;
    }

    public int getMediaEntreNotas() {
        return mediaEntreNotas;
    }

    public void setMediaEntreNotas(int mediaEntreNotas) {
        this.mediaEntreNotas = mediaEntreNotas;
    }

    //Métodos

    public void imprimeResultado(){
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
        this.terceiraNota = terceiraNota;
        this.quartaNota = quartaNota;
        this.mediaEntreNotas = (primeiraNota + segundaNota + terceiraNota + quartaNota)/4;

        System.out.println("Avaliação da suas notas");
        System.out.println("Nota 1: "+primeiraNota);
        System.out.println("Nota 2: "+segundaNota);
        System.out.println("Nota 3: "+terceiraNota);
        System.out.println("Nota 4: "+quartaNota);
        System.out.println("=====================");
        System.out.println("Sua média é de: "+mediaEntreNotas);
    }
}
