package br.com.alura.screenmatch.atividades.herança.atividade02;

public class TesteAnimal {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();
    }
}

