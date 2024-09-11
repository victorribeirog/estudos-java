package org.example;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }

    public void adicionaContato(String nome, Integer telefone) {
        agendaContatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatos.isEmpty()){
            agendaContatos.remove(nome);
        }
    }

    public void exibeContatos() {
        System.out.println(agendaContatos);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatos.isEmpty()){
            numeroPorNome = agendaContatos.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionaContato("Camila", 123456);
        agendaContatos.adicionaContato("Camila", 0);
        agendaContatos.adicionaContato("Camila Cavalcante", 11111111);
        agendaContatos.adicionaContato("Camila DIO", 136574);
        agendaContatos.adicionaContato("Maria Silva", 136574);

        agendaContatos.exibeContatos();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibeContatos();

        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Camila DIO"));
    }
}