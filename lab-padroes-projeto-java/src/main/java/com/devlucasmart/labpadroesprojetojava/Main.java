package com.devlucasmart.labpadroesprojetojava;

import com.devlucasmart.labpadroesprojetojava.facade.Facade;
import com.devlucasmart.labpadroesprojetojava.singleton.SingletonEager;
import com.devlucasmart.labpadroesprojetojava.singleton.SingletonLazy;
import com.devlucasmart.labpadroesprojetojava.singleton.SingletonLazyHolder;
import com.devlucasmart.labpadroesprojetojava.strategy.Comportamento;
import com.devlucasmart.labpadroesprojetojava.strategy.ComportamentoAgressivo;
import com.devlucasmart.labpadroesprojetojava.strategy.ComportamentoDefensivo;
import com.devlucasmart.labpadroesprojetojava.strategy.ComportamentoNormal;
import com.devlucasmart.labpadroesprojetojava.strategy.Robo;

public class Main {
    public static void main(String[] args) {

        //Singleton
//        var lazy = SingletonLazy.getInstance();
//        System.out.println(lazy);
//        lazy = SingletonLazy.getInstance();
//        System.out.println(lazy);
//
//        var eager = SingletonEager.getInstancia();
//        System.out.println(eager);
//        eager = SingletonEager.getInstancia();
//        System.out.println(eager);
//
//        var lazyHolder = SingletonLazyHolder.getInstance();
//        System.out.println(lazyHolder);
//        lazyHolder = SingletonLazyHolder.getInstance();
//        System.out.println(lazyHolder);

        //Strategy
//        Comportamento normal = new ComportamentoNormal();
//        Comportamento defensivo = new ComportamentoDefensivo();
//        Comportamento agressivo = new ComportamentoAgressivo();
//
//        var robo = new Robo();
//        robo.setComportamento(normal);
//        robo.mover();
//        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Lucas", "14989898");
    }
}
