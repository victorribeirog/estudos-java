package org.example;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<Livro>();
    }

    public void adicionarLivro(String titulo, String autor, int ano) {
        livros.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAno(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getAno() >= anoInicial && livro.getAno() <= anoFinal) {
                    livrosPorAno.add(livro);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livros.isEmpty()) {
            for (Livro livro : livros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros c = new CatalogoLivros();
        c.adicionarLivro("Livro 1","Autor 1", 2020);
        c.adicionarLivro("Livro 1","Autor 2", 2021);
        c.adicionarLivro("Livro 2","Autor 2", 2022);
        c.adicionarLivro("Livro 3","Autor 3", 2023);
        c.adicionarLivro("Livro 4","Autor 4", 1994);

        System.out.println(c.pesquisaPorAutor("Autor 2"));
        System.out.println(c.pesquisaPorIntervaloAno(2020,2022));
        System.out.println(c.pesquisarPorTitulo("Livro 1"));

    }
}