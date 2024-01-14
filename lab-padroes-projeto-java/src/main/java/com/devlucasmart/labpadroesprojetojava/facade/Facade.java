package com.devlucasmart.labpadroesprojetojava.facade;

import com.devlucasmart.labpadroesprojetojava.subsistema1.crm.CrmService;
import com.devlucasmart.labpadroesprojetojava.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        var cidade = CepApi.getInstancia().recuperarCidade(cep);
        var estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
