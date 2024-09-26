package br.com.alura.screenmatch.atividades.modificadoresdeacesso.atividade03;

public class TesteProduto {
    public static void main(String[] args) {
        //3-Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar
        /// e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

        Produto produto = new Produto("camisa", 1000);

        System.out.println("atividade 3");
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.aplicarDesconto(50));
        System.out.println();

    }
}