package br.com.curso.alura.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.curso.alura.model.Aula;

public class TestaListaDeAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revistando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        // antes de ordenar:
        System.out.println(aulas);

        //compara usando Collections usando o titulo e ordem alfabética
        //metódo compareTo na classe (Ordem Natural)
        Collections.sort(aulas);
        System.out.println("Ordenado por ordem alfabética: " + aulas);

        //Compara usando Comparator e pela ordem do tempo da aula
        aulas.sort(Comparator.comparing(Aula::getTempo));
        // depois de ordenar:
        System.out.println("Ordenado por tem de aula: " + aulas);
    }
}