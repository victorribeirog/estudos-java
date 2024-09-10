package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listaTarefa;

    public ListaTarefa() {
        this.listaTarefa = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : listaTarefa) {
            if (t.getDescricao().equals(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        listaTarefa.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTarefa() {
        return listaTarefa.size();
    }

    public void obterDescricaoTarefa() {
        System.out.println(listaTarefa);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("A");
        listaTarefa.adicionarTarefa("B");
        listaTarefa.adicionarTarefa("C");
        listaTarefa.adicionarTarefa("C");
        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTarefa());

        listaTarefa.removerTarefa("C");
        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTarefa());

        listaTarefa.obterDescricaoTarefa();
    }
}
