package com.devlucasmart.labpadroesprojetojava;

import com.devlucasmart.labpadroesprojetojava.singleton.SingletonEager;
import com.devlucasmart.labpadroesprojetojava.singleton.SingletonLazy;
import com.devlucasmart.labpadroesprojetojava.singleton.SingletonLazyHolder;

public class Main {
    public static void main(String[] args) {
        var lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        var eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        var lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
    }
}
