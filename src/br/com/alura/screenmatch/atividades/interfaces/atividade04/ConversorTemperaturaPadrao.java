package br.com.alura.screenmatch.atividades.interfaces.atividade04;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double celsius) {

        System.out.println("Convertendo celsius  para fahrenheit");
        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("valor em celsius é :" + celsius);
        System.out.println("valor em fahrenheit é :" + fahrenheit);
        System.out.println();
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {

        System.out.println("Convertendo fahrenheit para celsius");

        double celsius = (fahrenheit - 32) * 5/9;

        System.out.println("valor em fahrenheit é :" + fahrenheit);
        System.out.println("valor em celsius é :" + celsius);
        System.out.println();
    }

    public static void main(String[] args) {
        // 4- Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
        // Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão
        // e exibe os resultados.

        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.celsiusParaFahrenheit(32);
        conversor.fahrenheitParaCelsius(89.6);
    }
}
