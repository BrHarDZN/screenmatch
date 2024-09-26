package br.com.alura.screenmatch.atividades.heranca.atividade04;

public class TesteNumerosPrimos {
    public static void main(String[] args) {

        //4-Crie uma classe NummerosPrimos co métodos como verificarPrimalidade() e listarPrimos(). Em seguida,
        // crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos.
        // Adicione um método específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo
        // e c para o GeradorPrimo.

        VerificadorPrimo verificadorPrimo = new VerificadorPrimo();
        verificadorPrimo.verificarSeEhPrimo(5);
        verificadorPrimo.verificarSeEhPrimo(8);

        GeradorPrimo geradorPrimo = new GeradorPrimo();
        System.out.println("proximo primo após 7 é: " + geradorPrimo.gerarProximoPrimo(7));

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(1000);
    }
}
