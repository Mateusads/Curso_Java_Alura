public class TesteReferencia {

    public static void main(String[] args) {

    	Designer d1 = new Designer();
        d1.setNome("José");
        d1.setSalario(1000.0);
    	
        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setSalario(5000.0);

        EditorVideo ev = new EditorVideo();
        ev.setNome("Rodrigo");
        ev.setSalario(2500.0);      
        

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(d1);
        controle.registra(g1);
        controle.registra(ev);
        System.out.println("Total de bonificacao dada aos funcionarios");
        System.out.println(controle.getSoma());

    }

}