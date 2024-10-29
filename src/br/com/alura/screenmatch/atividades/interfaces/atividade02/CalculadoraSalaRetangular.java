package br.com.alura.screenmatch.atividades.interfaces.atividade02;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura,double largura) {
        System.out.println("Calculando Area da sala");
        System.out.println("altura: " + altura);
        System.out.println("largura: " + largura);
        System.out.println("A Area da sala é:" + (altura * largura));
        System.out.println();
    }

    @Override
    public void calcularPerimetro(double altura,double largura) {
        System.out.println("Calculando perimetro da sala");
        System.out.println("altura: " + altura);
        System.out.println("largura: " + largura);
        System.out.println("O perimetro da sala é:" + (altura + largura) * 2);
        System.out.println();
    }

    public static void main(String[] args) {
        //2- Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos
        // calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular.
        // A classe deve receber altura e largura como parâmetros.


        CalculadoraSalaRetangular salaRetangular = new CalculadoraSalaRetangular();
        salaRetangular.calcularArea(5,8);
        salaRetangular.calcularPerimetro(5,8);
    }
}


