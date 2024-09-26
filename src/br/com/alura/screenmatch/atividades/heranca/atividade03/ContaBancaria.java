package br.com.alura.screenmatch.atividades.heranca.atividade03;

//3-Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar()
//e consultarSaldo().Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método
//específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

public class ContaBancaria {
    protected double saldo;

    public void consultarSaldo() {
        System.out.println("seu saldo atual: " + this.saldo);
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);

        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
}
