package br.com.bytebank.teste;
import br.com.bytebank.especial.ContaEspecial;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupança;

/**
 * Classe Testa as contas. 
 * @author mateus.medeiros
 *@version 1.0
 */


public class TesteConta {

	public static void main(String[] args) {
		
		
		ContaEspecial ce = new ContaEspecial(444, 123322);
		ce.deposita(99);
		//ce.saldo - não funciona (protected)

		ContaCorrente cc = new ContaCorrente(11, 123231);
		cc.deposita(12.99);
		
		ContaPoupança cp = new ContaPoupança(11, 123123);
		cp.deposita(74.50);
		try {
			cc.transfere(12.78, cp);			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		System.out.println("CE: " + ce.saldoCE());
		
		System.out.println("Valor de rendimento da CC: " + cc.rendimento() + "% ao mês");
		System.out.println("Valor de rendimento da CP: " + cp.rendimento() + "% ao mês");
		System.out.println("Valor de rendimento da CE: " + ce.rendimento() + "% ao mês");

	}

}
