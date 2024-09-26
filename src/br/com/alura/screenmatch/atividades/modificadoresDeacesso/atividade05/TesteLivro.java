package br.com.alura.screenmatch.atividades.modificadoresDeacesso.atividade05;

public class TesteLivro {
    public static void main(String[] args) {
        ///5-Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para
        // acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.

        Livro livro1 = new Livro();
        livro1.setTitulo("Guia do mochileira das galaxias");
        livro1.setAutor("Douglas Adams");

        Livro livro2 = new Livro();
        livro2.setTitulo("Senhor dos aneis");
        livro2.setAutor("J. R. R. Tolkien");

        System.out.println("atividade 5");
        livro1.exibirDetalhes();
        livro2.exibirDetalhes();

    }
}
