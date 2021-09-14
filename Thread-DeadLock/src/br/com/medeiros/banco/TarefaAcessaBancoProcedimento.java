package br.com.medeiros.banco;

public class TarefaAcessaBancoProcedimento implements Runnable {

	private PoolDeConexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaAcessaBancoProcedimento(PoolDeConexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		// TODO Auto-generated constructor stub
		this.tx = tx;
	}

	@Override
	public void run() {
		synchronized (tx) {
			
			System.out.println("Come�ando a tx");
			tx.begin();
			
			synchronized (pool) {
				System.out.println("Pool - peguei a conex�o");
				pool.getConnection();
				
			}
		}

	}

}
