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
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);


    }
}


