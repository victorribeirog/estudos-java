package org.example;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> produtos;

    public EstoqueProduto() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(long cod,String nome, double preco, int quantidade) {
        produtos.put(cod,new Produto(nome,preco,quantidade));
    }

    public void exibirProdutos() {
        System.out.println(produtos);
    }

    public double calculaValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!produtos.isEmpty()){
            for(Produto produto : produtos.values()){
                valorTotalEstoque += produto.getPreco() * produto.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!produtos.isEmpty()) {
            for (Produto produto : produtos.values()) {
                if (produto.getPreco() > maiorPreco) {
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1L,"A",10.0,5);
        estoque.adicionarProduto(2L,"B",5.0,10);
        estoque.adicionarProduto(3L,"c",15.0,2);

        estoque.exibirProdutos();
        System.out.println("Valor total do estoque: R$" +estoque.calculaValorTotalEstoque());
        System.out.println("Produto mais caro: "+estoque.obterProdutoMaisCaro());
    }
}