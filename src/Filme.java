public class Filme {

    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Está incluido no plano: " + incluidoNoPlano);
        pegaMedia();
        System.out.println("Avaliação: " + somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + getTotalDeAvaliacoes());
        System.out.println("Duaração em minutos: " + duracaoEmMinutos);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }


     void pegaMedia(){
        this.somaDasAvaliacoes = somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
