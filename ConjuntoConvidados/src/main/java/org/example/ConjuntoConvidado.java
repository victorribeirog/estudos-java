package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){
        convidadoSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidado(int codigo){
        Convidado convidadoParaRemover = null;
        for(Convidado convidado : convidadoSet){
            if(convidado.getCodigo() == codigo){
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjunto = new ConjuntoConvidado();
        System.out.println("Existem " + conjunto.contarConvidados() + " convidados dentro do Set de Convidados");

        conjunto.adicionarConvidado("Convidado 1",123);
        conjunto.adicionarConvidado("Convidado 2",1234);
        conjunto.adicionarConvidado("Convidado 3",1234);
        conjunto.adicionarConvidado("Convidado 4",12345);
        System.out.println("Existem " + conjunto.contarConvidados() + " convidados dentro do Set de Convidados");

        conjunto.removerConvidado(1234);
        System.out.println("Existem " + conjunto.contarConvidados() + " convidados dentro do Set de Convidados");

        conjunto.exibirConvidados();

    }
}