package br.com.mateus.medeiros.servidor;

import java.io.PrintStream;

public class ComandoC2 implements Runnable {

    private PrintStream saida;

    public ComandoC2(PrintStream saida) {
        this.saida = saida;
    }

    @Override
    public void run() {

        System.out.println("Executando comando c2");

        try {
            // faz algo bem demorado
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        throw new RuntimeException("Error c2");
        //devolvendo resposta para o cliente
        //saida.println("Comando c2 executado com sucesso!");
    }
}
