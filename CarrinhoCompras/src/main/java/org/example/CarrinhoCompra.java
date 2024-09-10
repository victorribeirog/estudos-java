package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra {
    private List<Item> itens;

    public CarrinhoCompra() {
        this.itens = new ArrayList<Item>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itens.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itens.isEmpty()){
            for (Item item : itens) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(item);
                }
            }
            itens.removeAll(itensParaRemover);
        }else {
            System.out.println("Lista vazia");
        }
    }

    public double calcularTotal() {
        double total = 0;
        if (!itens.isEmpty()) {
            for (Item item : itens) {
                double valorItem = item.getPreco() * item.getQuantidade();
                total += valorItem;
            }
            return total;
        }else {
            throw new RuntimeException("Lista vazia");
        }
    }

    public void exibirItens() {
        if (!itens.isEmpty()) {
            System.out.println(this.itens);
        }else{
            System.out.println("Lista vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoCompra{" +
                "itens=" + itens +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoCompra c = new CarrinhoCompra();

        c.adicionarItem("Lápis",2d,3);
        c.adicionarItem("Lápis", 2d, 3);
        c.adicionarItem("Caderno", 35d, 1);
        c.adicionarItem("Borracha", 2d, 2);

        c.exibirItens();

        c.removerItem("Lápis");
        c.exibirItens();

        System.out.println("O valor total é = " + c.calcularTotal());
    }
}