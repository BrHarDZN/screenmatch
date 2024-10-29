package br.com.alura.screenmatch.atividades.interfaces.atividade05;

public class ProdutoFisico extends Produto implements Calculavel {
    public double calcularPrecoFinal() {
        // Implementação com taxas adicionais para produtos físicos
        return getPreco() * 1.05;
    }
}