package br.com.alura.screenmatch.atividades.herança.atividade03;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldo);
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }
}
