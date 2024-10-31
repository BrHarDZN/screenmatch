package br.com.alura.screenmatch.atividades.arraylist2.atividade03;

import br.com.alura.screenmatch.atividades.arraylist2.atividade02.Animal;
import br.com.alura.screenmatch.atividades.arraylist2.atividade02.Cachorro;

public class testeCachorro {
    public static void main(String[] args) {
    //2-Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto da classe Cachorro
    // e faça o casting para a classe Animal.

        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;
    }
}
