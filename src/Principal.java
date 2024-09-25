import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.setNome("O poderoso chefão");
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

        Filme filme2 = new Filme();
        filme2.setNome("Avatar");
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
    }
}


