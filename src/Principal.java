import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O poderoso chefão");

        filme1.setAnoLancamento(1970);
        filme1.setIncluidoNoPlano(true);
        filme1.setDuracaoEmMinutos(180);

        filme1.avalia(9);
        filme1.avalia(7);
        filme1.avalia(4);
        filme1.avalia(10);
        filme1.avalia(9);
        filme1.avalia(5);

        filme1.exibeFichaTecnica();

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da serie: " + lost.getDuracaoEmMinutos());
        System.out.println();

        Filme filme2 = new Filme("Avatar");
        filme2.setAnoLancamento(2023);
        filme2.setIncluidoNoPlano(true);
        filme2.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(lost);
        System.out.println("Tempo total calculado titulos em minutos: " + calculadora.getTempoTotal());
        System.out.println();


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
        System.out.println();


        Filme filmeDoPaulo = new Filme("Dogville");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setAnoLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> Filmes = new ArrayList<Filme>();
        Filmes.add(filmeDoPaulo);
        Filmes.add(filme1);
        Filmes.add(filme2);
        System.out.println("Tamanho da lista: " + Filmes.size());
        System.out.println("Primeiro filme:" + Filmes.get(0).getNome());
        System.out.println(Filmes);
        System.out.println("toString do filme: " + Filmes.get(0).toString());

    }
}


