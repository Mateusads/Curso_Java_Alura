package br.com.mateus.medeiros.servidor;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ServidorTarefas {

    public static void main(String[] args) throws Exception {

        System.out.println("---- Iniciando Servidor ----");
        ServerSocket servidor = new ServerSocket(12345);
        ExecutorService poolDeThreadsFixo = Executors.newFixedThreadPool(2); //Cria um limite de 2 threads e reaproveita ela assim que um cliente não usar mais.
        //ExecutorService poolDeThreads = Executors.newCachedThreadPool();
 

        while (true) {
            Socket socket = servidor.accept();    
            System.out.println("Aceitando novo cliente na porta " + socket.getPort());
            DistribuirTarefas distribuirTarefas = new DistribuirTarefas(socket);
            poolDeThreadsFixo.execute(distribuirTarefas);
        }
    }
}