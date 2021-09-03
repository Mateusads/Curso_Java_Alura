
public class TestaConexao {

	public static void main(String[] args) {

		// Jeito Novo com AutoClose

		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (Exception e) {
			System.out.println("Erro com a conexao ");
		}

		// Jeito antigo para fechar conexao

//	    Conexao con = null;
//	    try {
//	        con = new Conexao();
//	        con.leDados();
//	    } catch(IllegalStateException ex) {
//	        System.out.println("Deu erro na conexao");	        
//	    } finally {
//	    	if(con != null) {
//	    		con.fecha();
//	    	}
//	    	
//		}
	}

}
