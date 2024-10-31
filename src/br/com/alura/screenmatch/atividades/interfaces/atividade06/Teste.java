package br.com.alura.screenmatch.atividades.interfaces.atividade06;

public class Teste {
    public static void main(String[] args) {
        // 6- Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade
        // e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a sua
        // própria lógica de cálculo de preço.

        Produto produto = new Produto("Notebook",3000.00);
        System.out.println("Preço total (2 unidades): " + produto.calcularPrecoTotal(2));

        produto.aplicarDesconto(10);
        System.out.println("Preço unitário com desconto de 10%: " + produto.calcularPrecoTotal(1));

        Servico servico = new Servico("Consultoria",150.00);
        System.out.println("\nPreço total (5 horas): " + servico.calcularPrecoTotal(5));

        servico.aplicarDesconto(20);
        System.out.println("Preço por hora com desconto de 20%: " + servico.calcularPrecoTotal(1));
    }
}


