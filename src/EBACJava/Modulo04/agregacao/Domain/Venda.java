package EBACJava.Modulo04.agregacao.Domain;

import java.util.ArrayList;
import java.util.List;

public class Venda {


    private Comprador comprador;

    private Vendedor vendedor;

    private List<Produto> produto;

    public Venda(){
        this.produto = new ArrayList<>();
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }


    public void add(Produto produto){
        this.produto.add(produto);
    }


    public void concretizarVenda(){
        System.out.println("Comprador: "+ comprador.getNome());
        System.out.println("Comprou os itens: ");
        for (Produto prod: produto){
            System.out.println("Nome do Produto: "+ prod.getNome()+ " - Valor do produto: "+ prod.getPreco());
        }
        System.out.println("Vendedor: "+this.vendedor.getNome());
    }
    public void cancelarVenda(){
        System.out.println("Venda cancelada");
    }
}
