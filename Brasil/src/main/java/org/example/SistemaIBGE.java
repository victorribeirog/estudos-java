package org.example;

public class SistemaIBGE {
    public static void main(String[] args) {
        for (EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
        EstadoBrasileiro eb = EstadoBrasileiro.MINAS_GERAIS;

        System.out.println(eb.getNome());
        System.out.println(eb.getNomeMaiusculo());

    }
}
