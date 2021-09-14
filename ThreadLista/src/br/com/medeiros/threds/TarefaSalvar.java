package br.com.medeiros.threds;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class TarefaSalvar implements Runnable {

	private ThreadList list;

	public TarefaSalvar(ThreadList list) {
		this.list = list;
	}

	@Override
	public void run() {

		synchronized (list) {			
			System.out.println("Dormindo");	
			
			try {
				list.wait();
				FileOutputStream fos = new FileOutputStream("thread-safe2.txt");
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write("Este arquivo foi criado usando thread-safe");
				bw.newLine();
				int c = 0;

				for (int i = 0; i < list.tamanho(); i++) {
					String linha = list.pegaElemento(i);
					bw.write(linha);

					if (c >= 10) {
						bw.newLine();
						c = 0;
					}
					c++;
					System.out.println(linha);
				}
				bw.close();
			} catch (Exception e) {
			}

		}
	}
}
