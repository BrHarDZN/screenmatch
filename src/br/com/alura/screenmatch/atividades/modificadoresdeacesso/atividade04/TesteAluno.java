package br.com.alura.screenmatch.atividades.modificadoresdeacesso.atividade04;

public class TesteAluno {
    public static void main(String[] args) {
        ///4-Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para
        // acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.

        Aluno aluno = new Aluno("bruno", 10, 5, 7);

        System.out.println("atividade 4");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.println("Nota 3: " + aluno.getNota3());
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println();
        aluno.calcularMedia();
    }
}
