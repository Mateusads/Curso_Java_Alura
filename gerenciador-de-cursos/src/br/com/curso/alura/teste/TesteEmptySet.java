package br.com.curso.alura.teste;
import java.util.*;

public class TesteEmptySet {

    public static void main(String[] args) {

        Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo"); //o que acontece aqui?
        
        //Erro pq uma Collections que nasceu empty não pode ser populada.
    }

}