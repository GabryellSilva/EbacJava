package EBACsrc.Modulo01.Domain;

public class Anime {
    /**
     * @author Gabryell.Silva
     * @version 1/0
     * @
     */

    //Atributos

    private String nome;
    private int episodeos;
    private String genero;


    // getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEpisodeos() {
        return episodeos;
    }

    public void setEpisodeos(int episodeos) {
        this.episodeos = episodeos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Métodos

    public int RetornarNumeroDeEpisodeos(){
        return episodeos;
    }
    public void imprimeAnime(){
        this.nome = nome;
        this.episodeos = episodeos;
        this.genero = genero;

        System.out.println("Anime: "+ nome);
        System.out.println("Episodeos: "+ episodeos);
        System.out.println("Genero: "+ genero);
    }

}
