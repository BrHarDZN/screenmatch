package br.com.alura.screenmatch.atividades.modificadoresdeacesso.atividade02;

public class TesteIdadePessoa {
    public static void main(String[] args) {
        ///2- Crie uma classe idadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para
        /// acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
        IdadePessoa idadePessoa = new IdadePessoa("Bruno", 17);

        System.out.println("Atividade 2");
        idadePessoa.verificarIdade();
        System.out.println();
    }
}
