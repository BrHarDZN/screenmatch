package br.com.alura.screenmatch.atividades.interfaces.atividade05;

public class testeProduto {
    public static void main(String[] args) {
        //5- Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas classes
        // Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.

        Livro livro = new Livro();
        livro.setNome("senhor dos aneis");
        livro.setAutor("eu mesmo");
        livro.setPreco(100);
        livro.setPreco(livro.calcularPrecoFinal());
        System.out.println(livro);

        ProdutoFisico cadeira = new ProdutoFisico();
        cadeira.setNome("cadeira de bar");
        cadeira.setPreco(50);
        cadeira.setPreco(cadeira.calcularPrecoFinal());
        System.out.println(cadeira);

    }
}
