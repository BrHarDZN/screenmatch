package br.com.alura.screenmatch.atividades.arraylist2.atividade06;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta,double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}

