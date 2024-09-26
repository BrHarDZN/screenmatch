package br.com.alura.screenmatch.atividades.modificadoresdeacesso.atividade02;

///2-Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar
// e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
public class IdadePessoa {

    private String nome;
    private int idade;

    public IdadePessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (this.idade >= 18) {
            System.out.println(this.nome + " tem " + this.idade +" anos e é maior de idade");
        } else {
            System.out.println(this.nome + " tem " + this.idade +" anos e é menor de idade");
        }
    }
}
