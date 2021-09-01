package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaJoao = new Conta();
		System.out.println("João -- Deposita 100");
		contaJoao.deposita(100);
		System.out.println("João -- Valor do saldo atual = " + contaJoao.saldo);
		System.out.println("João -- Saca 75");
		boolean retorno = contaJoao.saca(75);
		System.out.println("João -- Tem o valor  = " + retorno);
		System.out.println("João -- Valor do saldo atual = " + contaJoao.saldo);
		System.out.println("João -- Saca 80");
		retorno = contaJoao.saca(80);
		System.out.println("João -- Tem o valor  = " + retorno);
		System.out.println("João -- Valor do saldo atual = " + contaJoao.saldo);
		
		Conta contaCarlos = new Conta();
		System.out.println("Carlos -- Deposita 100");
		contaCarlos.deposita(100);
		System.out.println("Carlos -- Valor do saldo atual = " + contaCarlos.saldo);
		System.out.println("Carlos -- Transfere 99 para o João");
		if(contaCarlos.transfere(99, contaJoao)) {
			System.out.println("Carlos -- Valor tranferido com sucesso");
		}else {
			System.out.println("Carlos -- Erro ao transferir");
		}
		
		System.out.println("João -- Saca 80");
		retorno = contaJoao.saca(80);
		System.out.println("João -- Tem o valor  = " + retorno);
		System.out.println("João -- Valor do saldo atual = " + contaJoao.saldo);
	}

}
