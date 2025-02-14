package EBACJava.Modulo04.agregacao.Test;

import EBACJava.Modulo04.agregacao.Domain.Comprador;
import EBACJava.Modulo04.agregacao.Domain.Produto;
import EBACJava.Modulo04.agregacao.Domain.Venda;
import EBACJava.Modulo04.agregacao.Domain.Vendedor;

public class Programa {
    public static void main(String[] args) {
        Produto produtoSapato = criarProduto(1500D, "Sapato", 5508L);
        Produto produtoTv = criarProduto(1900D, "Tv", 4895L);

        Vendedor vendedor = criarVendedor("Gabryell", 20d);

        Comprador comprador = criarComprador("Layane", 3000D);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoSapato);
        venda.add(produtoTv);

        venda.concretizarVenda();
    }

    private static Comprador criarComprador(String nome, double verba) {
        return new Comprador(nome,verba);
    }

    private static Vendedor criarVendedor(String nome, double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);
        return vendedor;
    }

    private static Produto criarProduto(Double preco, String nome, Long idDoProduto) {
        Produto produto = new Produto(1500D, "Sapato", 5508L);
        produto.setIdDoProduto(idDoProduto);
        produto.setNome(nome);
        produto.setPreco(preco);
        return produto;
    }
}
