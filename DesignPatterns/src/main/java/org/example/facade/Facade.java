package org.example.facade;

import org.example.subsistema1.crm.CrmService;
import org.example.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidadade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome,cep,cidadade,estado);
    }
}
