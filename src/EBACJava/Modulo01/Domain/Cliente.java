package EBACsrc.Modulo01.Domain;

public class Cliente {

    private int codigo;
    private String nome;
    private String endereco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //Métodos

    public void cadastrarEndereco(String endereco){
        setEndereco(endereco);
    }

    public void imprimirEndereco(){
        System.out.println(this.endereco);
    }
    public String recuperarEndereco(){
        return "Seu enderço";
    }

    /**
     * @author Gabryell.Silva
     *
     * @return - retorna o valor Total
     * @deprecated
     * @see public int ValorTotal(int count)
     */
    public int valorTotal(){
        return  20;
    }
    public int ValorTotal(int count){
        return 100;
    }
}
