package br.com.alura.screenmatch.atividades.herança.carro;

public class TesteCarro {
    public static void main(String[] args) {

            ModeloCarro meuCarro = new ModeloCarro();
            meuCarro.definirModelo("Sedan");
            meuCarro.definirPrecos(30000.00, 32000.00, 35000.00);
            meuCarro.exibirInfo();
    }
}
