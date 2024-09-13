package br.com.alura.screenmatch.modelos;

public class Filme {

    public String nome;
    public int anoLancamento;
    public boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    public int duracaoEmMinutos;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Está incluido no plano: " + incluidoNoPlano);
        pegaMedia();
        System.out.println("Avaliação: " + somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + getTotalDeAvaliacoes());
        System.out.println("Duaração em minutos: " + duracaoEmMinutos);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public void pegaMedia() {
        this.somaDasAvaliacoes = somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
