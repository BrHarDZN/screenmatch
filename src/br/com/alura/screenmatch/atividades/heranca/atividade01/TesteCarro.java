package br.com.alura.screenmatch.atividades.heranca.atividade01;

public class TesteCarro {
    public static void main(String[] args) {
        //1-Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
        // Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o
        // maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal
        // para definir preços e mostrar informações.

        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(30000.00, 32000.00, 35000.00);
        meuCarro.exibirInfo();
    }
}
