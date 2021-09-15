package br.com.mateus.medeiros.servidor;

import java.io.PrintStream;
import java.util.Random;
import java.util.concurrent.Callable;

public class ComandoC2AcessaBanco implements Callable<String> {

    private PrintStream saida;

    public ComandoC2AcessaBanco(PrintStream saida) {
        this.saida = saida;
    }

    @Override
    public String call() throws Exception {

        System.out.println("Servidor recebeu comando c2 - Banco");
        Thread.sleep(new Random().nextInt(250) + 150);
        
        
        saida.println("Processando comando c2 - Banco");        
        for(int i = 0; i < 3; i++) {
        	saida.println("Waiting...");
        	Thread.sleep(new Random().nextInt(2500) + 1900);
        }
        
        int numero = new Random().nextInt(100) + 1;

        System.out.println("Servidor finalizou comando c2 - Banco");

        return Integer.toString(numero);
    }
}