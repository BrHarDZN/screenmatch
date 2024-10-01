package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O poderoso chefão", 1970);
        filme1.avalia(9);
        filme1.avalia(9);

        Filme filme2 = new Filme("Avatar", 2023);
        filme2.avalia(6);
        filme2.avalia(6);

        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        filmeDoPaulo.avalia(10);

        Serie lost = new Serie("Lost", 2000);


        ArrayList<Titulo> lista = new ArrayList<Titulo>();
        lista.add(filmeDoPaulo);
        lista.add(filme1);
        lista.add(filme2);
        lista.add(lost);
//        lista.forEach(item -> System.out.println(item));
//        lista.forEach(System.out::println);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme) {
                System.out.println("Classificação: " + ((Filme) item).getClassificacao());
            }
            System.out.println();
        }

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Bruno");
        buscaPorArtistas.add("Adam Sandler");
        buscaPorArtistas.add("Mairone");
        buscaPorArtistas.add("Marvin");
        buscaPorArtistas.add("Paulo");
        buscaPorArtistas.add("Jaqueline");
        System.out.println(buscaPorArtistas);
        System.out.println();

        Collections.sort(buscaPorArtistas);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtistas);
        System.out.println();

        System.out.println("Ordenação por nome");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println();

        System.out.println("Ordenação por ano de lançamento");
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println(lista);
    }
}