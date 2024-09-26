package br.com.alura.screenmatch.atividades.heranca.atividade02;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Gato está miando");
    }

    public void arranharMoveis() {
        System.out.println("Gato está arranhando os móveis");
    }
}
