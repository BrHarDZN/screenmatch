package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;
import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public Titulo(String nome,int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public Titulo(TituloOmdb tituloOmdb) {
        this.nome = tituloOmdb.title();
        if (tituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não consegui convcerter o ano porque tem amis de 04 caracteres");
        }
        this.anoLancamento = Integer.valueOf(tituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(tituloOmdb.runtime().substring(0,2));
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Duração em minutos: " + getDuracaoEmMinutos());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
        System.out.println("Está incluido no plano: " + getIncluidoNoPlano());
        System.out.println("Avaliação: " + pegaMedia());
        System.out.println("Total de avaliações: " + getTotalDeAvaliacoes());
        System.out.println();
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.nome);
    }

    @Override
    public String toString() {
        return "Titulo{nome='%s', anoLancamento=%d, duracaoEmMinutos=%d}".formatted(nome,anoLancamento,duracaoEmMinutos);
    }
}
