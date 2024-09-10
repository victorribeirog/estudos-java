package org.example;

import java.util.HashSet;
import java.util.Set;


public class AgendaContato {
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int telefone) {
        contatoSet.add(new Contato(nome, telefone));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarContato(String nome, int novoTelefone) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setTelefone(novoTelefone);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContatos();

        agendaContato.adicionarContato("Camila", 123456);
        agendaContato.adicionarContato("Camila", 0);
        agendaContato.adicionarContato("Camila Cavalcante", 11111111);
        agendaContato.adicionarContato("Camila DIO", 136574);
        agendaContato.adicionarContato("Maria Silva", 136574);

        agendaContato.exibirContatos();

        System.out.println(agendaContato.pesquisarPorNome("Camila"));

        System.out.println("Contato atualizado: " + agendaContato.atualizarContato("Maria Silva", 123));
        agendaContato.exibirContatos();
    }
}