package br.com.alura.screenmatch.atividades.herança.carro;


//1-Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
// Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o
// maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal
// para definir preços e mostrar informações.


public class Carro {
    private String modelo;
    private Double precoAno1;
    private Double precoAno2;
    private Double precoAno3;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(Double precoAno1, Double precoAno2, Double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: " + precoAno1);
        System.out.println("Preço Ano 2: " + precoAno2);
        System.out.println("Preço Ano 3: " + precoAno3);
        System.out.println("Maior Preço: " + calcularMaiorPreco());
        System.out.println("Menor Preço: " + calcularMenorPreco());

    }

    public Double calcularMenorPreco() {
        double menorPreco = this.precoAno1;

        if (menorPreco > this.precoAno2) {
            menorPreco = this.precoAno2;
        }

        if (menorPreco > this.precoAno3) {
            menorPreco = this.precoAno3;
        }
        return menorPreco;
    }

    public Double calcularMaiorPreco() {
        double maiorPreco = this.precoAno1;

        if (maiorPreco < this.precoAno2) {
            maiorPreco = this.precoAno2;
        }

        if (maiorPreco < this.precoAno3) {
            maiorPreco = this.precoAno3;
        }
        return maiorPreco;
    }

}
