package br.com.bytebank.teste.util;

import java.util.ArrayList;

import br.com.bytebank.modelo.ContaCorrente;

public class TesteJavaUtil {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		ContaCorrente cc1 = new ContaCorrente(10, 101);
		list.add(cc1);
		ContaCorrente cc2 = new ContaCorrente(10, 102);
		list.add(cc2);
		ContaCorrente cc3 = new ContaCorrente(10, 103);
		list.add(cc3);
		ContaCorrente cc4 = new ContaCorrente(10, 104);
		list.add(cc4);
		ContaCorrente cc5 = new ContaCorrente(10, 105);
		list.add(cc5);		
		
		System.out.println(list);
		list.remove(4);
		
		System.out.println(list.contains(cc5));
		
		list.set(0, cc5);
		
		for(Object o : list) {
			System.out.println(o);
		}
		
		
		
		
		/*
		 * 55665644 - ultimo size() na maquina do teste.
		 * TESTE PARA VERIFICAR EXCEPTION QUANDO ACABA A MEMÓRIA DA JVM.
		Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
		at br.com.bytebank.teste.util.TesteJavaUtil.main(TesteJavaUtil.java:31)
		 */		
//		while(true) {
//				list.add(new ContaCorrente(10, 101));
//				list.add(new ContaCorrente(10, 101));
//				list.add(new ContaCorrente(10, 101));
//				list.add(new ContaCorrente(10, 101));
//				list.add(new ContaCorrente(10, 101));
//				list.add(new ContaCorrente(10, 101));
//				list.add(new ContaCorrente(10, 101));
//				list.add(new ContaCorrente(10, 101));
//				list.add(new ContaCorrente(10, 101));				
//				System.out.println(list.size());
		//}

		
	}

}
