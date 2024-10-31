package br.com.alura.screenmatch.atividades.arraylist2.atividade02;

public class testeCachorro {
    public static void main(String[] args) {
        //Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o objeto seja do tipo
        // correto antes de fazer o casting.

        Cachorro cachorro = new Cachorro();
        if (cachorro instanceof Cachorro) {
            Animal animal = (Animal) cachorro;
        }
    }
}
