package br.com.alura.screenmatch.atividades.arraylist2.atividade05;

class Circulo implements Forma {
    double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
