package br.com.alura.screenmatch.atividades.arraylist.atividade01;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa: " + nome + " (Idade: " + idade + ")";
    }
}



