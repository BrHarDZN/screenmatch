package br.com.alura.screenmatch.atividades.interfaces.atividade01;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double valorEmDolar) {
        System.out.println("Valor em dolar é : US$" + valorEmDolar);
        System.out.println("Valor em reais é : R$" + valorEmDolar * 5.44);
        System.out.println();
    }

    public static void main(String[] args) {
        // 1- Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método
        // converterDolarParaReal() para converter um valor em dólar para reais.
        // A classe deve receber o valor em dólar como parâmetro.

        ConversorMoeda conversor = new ConversorMoeda();
        conversor.converterDolarParaReal(5);
        conversor.converterDolarParaReal(50);
        conversor.converterDolarParaReal(1300);
    }


}


