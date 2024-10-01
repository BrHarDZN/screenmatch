package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O poderoso chefão", 1970);
        filme1.avalia(9);

        Filme filme2 = new Filme("Avatar", 2023);
        filme2.avalia(6);

        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);

        Serie lost = new Serie("Lost", 2000);


        ArrayList<Titulo> Lista = new ArrayList<Titulo>();
        Lista.add(filmeDoPaulo);
        Lista.add(filme1);
        Lista.add(filme2);
        Lista.add(lost);
//        Lista.forEach(item -> System.out.println(item));
//        Lista.forEach(System.out::println);

        for (Titulo item : Lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme) {
                System.out.println("Classificação: " + ((Filme) item).getClassificacao());
            }
        }
    }
}