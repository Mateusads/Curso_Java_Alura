package br.com.curso.alura.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TesteSets {

	public static void main(String[] args) {

		Collection<Integer> numeros = new ArrayList<Integer>();

		long inicio = System.currentTimeMillis();

		for (int i = 1; i <= 90000; i++) {
			numeros.add(i);
		}

		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		long fim = System.currentTimeMillis();

		long tempoDeExecucao = fim - inicio;

		System.out.println("Tempo gasto com Arrays: " + tempoDeExecucao);
		
		Collection<Integer> numerosSet = new HashSet<Integer>();
		
		long inicioSet = System.currentTimeMillis();

		for (int i = 1; i <= 90000; i++) {
			numerosSet.add(i);
		}

		for (Integer numero : numerosSet) {
			numerosSet.contains(numero);
		}

		long fimSet = System.currentTimeMillis();

		long tempoDeExecucaoSet = fimSet - inicioSet;

		System.out.println("Tempo gasto com Sets: " + tempoDeExecucaoSet);
		
//		RESULTADO NO CONSOLE
//		Tempo gasto com Arrays: 5263 -> Com Arrays demorou 5263mlsegundos- esse tempo é váriavel
//		Tempo gasto com Sets: 33 -> Com Set foi de 33 mlsegundos - esse tempo é váriavel

	}

}
