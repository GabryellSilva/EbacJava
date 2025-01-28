package EBACJava.ForWhileLoops.Domain;

import java.util.Scanner;

public class ExercicoDeFluxo {
    //Atributos

    Scanner s = new Scanner(System.in);

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

    public void ImprimeNotas(){
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
        this.terceiraNota = terceiraNota;
        this.quartaNota = quartaNota;
        this.mediaEntreNotas = (primeiraNota + segundaNota + terceiraNota + quartaNota)/4;

        System.out.println("Situação de notas");
        System.out.println("Gostaria de ver sua média de notas?");
        String resposta = s.nextLine();

        while (resposta.equals("sim")){
            System.out.println("Digite sua primeira nota: ");
            int primeiraNota = s.nextInt();
            System.out.println("Digite sua segunda nota: ");
            int segundaNota = s.nextInt();
            System.out.println("Digite sua terceira nota: ");
            int terceiraNota = s.nextInt();
            System.out.println("Digite sua quarta nota: ");
            int quartaNota = s.nextInt();

            int mediaEntreNotas = (primeiraNota + segundaNota + terceiraNota + quartaNota)/4;

              if (mediaEntreNotas >=7 && mediaEntreNotas <=10){
            System.out.println("Sua média é de: "+ mediaEntreNotas + " Você foi aprovado");
             } else if (mediaEntreNotas <=6 && mediaEntreNotas >=4) {
            System.out.println("Sua média é de: "+ mediaEntreNotas+ " Você está de recuperação");
             }else {
            System.out.println("Sua média é de: "+mediaEntreNotas+ " Você está reprovado");
            }
        }
    }

    public static void main(String[] args) {
        ExercicoDeFluxo notas = new ExercicoDeFluxo();
        notas.ImprimeNotas();
    }
}
