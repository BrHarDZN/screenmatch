package br.com.alura.screenmatch.atividades.arraylist2.atividade04;

import java.util.ArrayList;

public class TesteProduto {
    public static void main(String[] args) {
        //4-Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de produtos e utilize
        // um loop para calcular e imprimir o preço médio dos produtos.

        Produto produto1 = new Produto("Geladeira",3500.0);
        Produto produto2 = new Produto("Fogão",1200.0);
        Produto produto3 = new Produto("Micro-ondas",500.0);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double somaPrecos = 0;
        for (Produto produto : listaProdutos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);
    }
}
