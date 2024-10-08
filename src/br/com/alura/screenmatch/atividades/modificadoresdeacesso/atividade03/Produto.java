package br.com.alura.screenmatch.atividades.modificadoresdeacesso.atividade03;

///3-Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar
// e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double aplicarDesconto(double porcentagem){
        if (porcentagem > 0) {
            return  this.preco - this.preco * (porcentagem / 100) ;
        }

        return this.preco = this.preco;
    }
}

