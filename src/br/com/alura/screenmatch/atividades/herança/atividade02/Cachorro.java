package br.com.alura.screenmatch.atividades.herança.atividade02;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Cachorro está latindo");
    }

    public void abanarRabo() {
        System.out.println("Cachorro está abanando o rabo");
    }

}
