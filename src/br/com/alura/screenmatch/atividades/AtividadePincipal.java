package br.com.alura.screenmatch.atividades;

public class AtividadePincipal {
    public static void main(String[] args) {

        ///1-Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e
        // titular (publico). Implemente métodos getters e setters para os atributos privados.

        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Bruno";
        conta.setNumeroConta(9172);
        conta.setSaldo(3600);


        System.out.println("Atividade 1");
        System.out.println("Titular: " + conta.titular);
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());

        conta.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta.getSaldo());
        System.out.println();


        ///2- Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para
        /// acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
        IdadePessoa idadePessoa = new IdadePessoa("Bruno", 17);

        System.out.println("Atividade 2");
        idadePessoa.verificarIdade();
        System.out.println();

        //3-Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar
        /// e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

        Produto produto = new Produto("camisa", 1000);

        System.out.println("atividade 3");
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.aplicarDesconto(50));
        System.out.println();

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
