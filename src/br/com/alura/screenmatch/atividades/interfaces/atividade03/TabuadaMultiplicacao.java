package br.com.alura.screenmatch.atividades.interfaces.atividade03;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int numero) {

        System.out.println("Tabuada do numero: " + numero);
        for (int i = 1;i < 11;i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // 3- Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada()
        // para exibir a tabuada de um número. A classe deve receber o número como parâmetro.

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(2);
        tabuada.mostrarTabuada(9);
        tabuada.mostrarTabuada(100);
    }


}

