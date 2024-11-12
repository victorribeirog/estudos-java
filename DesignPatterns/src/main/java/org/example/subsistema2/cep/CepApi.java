package org.example.subsistema2.cep;

import org.example.singleton.SingletonEager;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static synchronized CepApi getInstance() {
        return instance;
    }
    public String recuperarCidade(String cep) {
        return "Passos";
    }
    public String recuperarEstado(String cep) {
        return "MG";
    }
}
