package com.devlucasmart.labpadroesprojetojava.subsistema2.cep;

import com.devlucasmart.labpadroesprojetojava.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Araquara";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
