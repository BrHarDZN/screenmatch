package br.com.alura.screenmatch.atividades.herança.atividade03;

public class TesteContaBancaria {
    public static void main(String[] args) {
        //3-Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar()
        //e consultarSaldo().Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método
        //específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
       
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.setTarifaMensal(20d);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();
    }
}
