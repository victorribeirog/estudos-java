package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto("Produto 5", 1L,15d,5);
        cadastroProduto.adicionarProduto("Produto 0", 2L,20d,10);
        cadastroProduto.adicionarProduto("Produto 3", 1L,10d,2);
        cadastroProduto.adicionarProduto("Produto 9", 9L,2d,2);

        System.out.println(cadastroProduto.produtoSet);
        System.out.println(cadastroProduto.exibirProdutoPorNome());
        System.out.println(cadastroProduto.exibirProdutoPorPreco());
    }
}