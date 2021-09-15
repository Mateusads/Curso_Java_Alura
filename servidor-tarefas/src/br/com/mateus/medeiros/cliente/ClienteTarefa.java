package br.com.mateus.medeiros.cliente;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTarefa {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 12345);
        System.out.println("conexão estabelecida");

        //enviando comando c1 para servidor
        PrintStream saida = new PrintStream(socket.getOutputStream());       

        //aguardando enter
        Scanner teclado = new Scanner(System.in);
        while(true) {
            System.out.println("Digite 1 para mostrar o PI");
            System.out.println("Digite 2 para encerrar a conexão");
        	
        	 String d = teclado.nextLine(); 
        	 if(d.equals("2")) break;
        	 saida.println(d);
        }
       

        //fechando recursos
        saida.close();
        teclado.close();
        socket.close();
    }
}