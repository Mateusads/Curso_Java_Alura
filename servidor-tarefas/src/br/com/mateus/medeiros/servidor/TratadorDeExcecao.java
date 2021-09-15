package br.com.mateus.medeiros.servidor;

import java.lang.Thread.UncaughtExceptionHandler;

public class TratadorDeExcecao implements UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Deu exceção na thread | " + t.getName() + ", "
                + e.getMessage());
    }
}