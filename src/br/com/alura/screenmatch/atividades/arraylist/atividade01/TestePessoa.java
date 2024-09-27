package br.com.alura.screenmatch.atividades.arraylist.atividade01;


import java.util.ArrayList;

public class TestePessoa {

    public static void main(String[] args) {


//       1-Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
//       2-No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
//       3-Adicione pelo menos três pessoas à lista utilizando o método add.
//       4-Imprima o tamanho da lista utilizando o método size.
//       5-Imprima a primeira pessoa da lista utilizando o método get.
//       6-Imprima a lista completa


        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Bruno", 23);
        Pessoa pessoa2 = new Pessoa("Mairone", 43);
        Pessoa pessoa3 = new Pessoa("Marvin", 19);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira Pessoa: " + listaDePessoas.get(0));
        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
