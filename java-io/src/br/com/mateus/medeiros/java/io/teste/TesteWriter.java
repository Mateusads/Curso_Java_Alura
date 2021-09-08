package br.com.mateus.medeiros.java.io.teste;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PrintStream ps = new PrintStream("ipsum3.txt");
		PrintWriter pw = new PrintWriter("ipsum3.txt");
		
		ps.println("oaksdosakdosakdosakdosakdoaksdkosa");
		ps.println("asdasdasdasda");
		ps.println("xcvxcvcxvcxvxcvxcvcx");
		ps.println("yuiyuiyuiyuiyuiyuyui");
		
		pw.println("123m123kl12m3kl12m3k12");
		

		ps.close();
		pw.close();

	}

}
