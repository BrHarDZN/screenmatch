package br.com.alura.screenmatch.atividades.herança.atividade04;

public class TesteNumerosPrimos {
    public static void main(String[] args) {

        VerificadorPrimo verificadorPrimo = new VerificadorPrimo();
        verificadorPrimo.verificarSeEhPrimo(5);
        verificadorPrimo.verificarSeEhPrimo(8);

        GeradorPrimo geradorPrimo = new GeradorPrimo();
        System.out.println("proximo primo após 7 é: " + geradorPrimo.gerarProximoPrimo(7));

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(1000);

    }
}
