package br.com.alura.screenmatch.atividades.arraylist2.atividade04;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome,double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{nome='%s', preco=%d}".formatted(nome,preco);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
