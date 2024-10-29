package br.com.alura.screenmatch.atividades.interfaces.atividade05;

public class Livro extends Produto implements Calculavel {
    private String autor;

    public double calcularPrecoFinal() {
        return getPreco() * 0.9;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
