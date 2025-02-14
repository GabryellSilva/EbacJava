package EBACJava.Modulo04.agregacao.Domain;

public class Produto {

    private Double preco;

    private String nome;

    private Long idDoProduto;

    public Produto(Double preco, String nome, Long idDoProduto) {
        this.preco = preco;
        this.nome = nome;
        this.idDoProduto = idDoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdDoProduto() {
        return idDoProduto;
    }

    public void setIdDoProduto(Long idDoProduto) {
        this.idDoProduto = idDoProduto;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void vendido(){
        System.out.println("Vendido");
    }

}
