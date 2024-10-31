package br.com.alura.screenmatch.atividades.arraylist2.atividade05;

class Quadrado implements Forma {
    double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
