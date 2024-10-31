package br.com.alura.screenmatch.atividades.arraylist2.atividade06;

import java.util.ArrayList;

public class TesteConta {

    public static void main(String[] args) {
    // 6-Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie uma lista de
    // contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a conta com o maior saldo.

        ContaBancaria conta1 = new ContaBancaria(1,6000.0);
        ContaBancaria conta2 = new ContaBancaria(333,2500.0);
        ContaBancaria conta3 = new ContaBancaria(4444,8888.8);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);

        ContaBancaria contaMaiorSaldo = listaContas.get(0);
        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.printf("Conta com o maior saldo - Número: %d, Saldo: %s%n",contaMaiorSaldo.getNumeroConta(),contaMaiorSaldo.getSaldo());
    }
}

