package br.com.alura.screenmatch.atividades.arraylist2.atividade01;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //1-Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.

        ArrayList<String> list = new ArrayList<>();
        list.add("teste1");
        list.add("teste2");
        list.add("teste3");
        list.add("teste4");
        list.add("teste5");
        list.add("teste6");

        for (String item : list) {
            System.out.println(item);
        }

    }
}
