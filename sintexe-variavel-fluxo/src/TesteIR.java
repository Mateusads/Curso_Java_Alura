
public class TesteIR {

    public static void main(String[] args) {

        double salario = 4664.1;

        if(salario >= 1900 && salario <= 2800) {        	
        	System.out.println("IR de 7,5% - deduzir na declara��o o valor de R$ 142");        
        }else if(salario >= 2800.01 && salario <= 3751.0) {
        	System.out.println("IR de 15% - deduzir na declara��o o valor de R$ 350");
        }else if(salario >= 3751.01 && salario <= 4664) {
        	System.out.println("IR de 22,5% - deduzir na declara��o o valor de R$ 636");            
        }else {
        	System.out.println("IR isento ou n�o consta -> dever� ser consultado em tabela.");            
        }
        
    }
}
