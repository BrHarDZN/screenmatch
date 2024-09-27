package br.com.alura.screenmatch.atividades.arraylist.atividade02;

import java.util.ArrayList;

public class TesteProduto {
    public static void main(String[] args) {
        // 1-Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida, crie uma lista de objetos
        // Produto utilizando a classe ArrayList. Adicione alguns produtos, imprima o tamanho da lista e recupere
        // um produto pelo índice.

        // 2-Implemente o método toString() na classe Produto para retornar uma representação em texto do objeto.
        // Em seguida, imprima a lista de produtos utilizando o método System.out.println().

        // 3-Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar os atributos,
        // Em seguida, crie objetos Produto utilizando esse novo construtor.

        // 4-Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e um construtorque
        // utilize o construtor da classe mãe (super) para inicializar os atributos herdados,
        // Crie um objeto ProdutoPerecivel e imprima seus valores.


        ArrayList<Produto> produtos = new ArrayList<Produto>();

        Produto produto1 = new Produto("escova de dentes", 19.99, 2);
        Produto produto2 = new Produto("pack de sabonetes", 14.99, 8);

        produtos.add(produto1);
        produtos.add(produto2);

        System.out.println("tamanho da lista de produtos: " + produtos.size());
        System.out.println("Produto na posição 0: " + produtos.get(0).getNome());
        System.out.println("Produto na posição 1: " + produtos.get(1).getNome());
        System.out.println(produtos);


        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Carne", 30.00, 1, "27-09-2024");
        System.out.println(produtoPerecivel);


    }
}
