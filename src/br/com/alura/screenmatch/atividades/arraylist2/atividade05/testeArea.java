package br.com.alura.screenmatch.atividades.arraylist2.atividade05;

import java.util.ArrayList;

public class testeArea {
    public void main(String[] args) {

    // 5-Crie uma interface Forma com um método calcularArea(). Implemente a interface em duas classes, por exemplo,
    // Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma) e utilize um loop para
    // calcular e imprimir a área de cada forma.

        Circulo circulo = new Circulo();
        circulo.raio = 7;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 5;

        // Lista de formas
        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        // Calcular e imprimir a área de cada forma
        for (Forma forma : listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
