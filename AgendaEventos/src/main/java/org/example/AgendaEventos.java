package org.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> enventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(enventoTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> enventoTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, Evento> entry : enventoTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento " + entry.getValue() + "acontecerá na data " + entry.getKey());
                break;
            }
        }

    }
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.NOVEMBER, 20), "Evento 1","Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.NOVEMBER, 25), "Evento 2","Atracao 2");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }

}
