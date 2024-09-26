package br.com.alura.screenmatch.atividades.modificadoresDeacesso.atividade01;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ///1-Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e
        // titular (publico). Implemente métodos getters e setters para os atributos privados.

        ContaBancaria conta = new ContaBancaria();

        conta.titular = "Bruno";
        conta.setNumeroConta(9172);
        conta.setSaldo(3600);


        System.out.println("Atividade 1");
        System.out.println("Titular: " + conta.titular);
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());

        conta.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta.getSaldo());
        System.out.println();

    }
}
