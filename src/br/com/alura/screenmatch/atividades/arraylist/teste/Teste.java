package br.com.alura.screenmatch.atividades.arraylist.teste;

public class Teste {

//    o p1.getPreco() vai retornar o valor 2.00 , pois ao fazer a referencia de p2 = p1 ,
//    eles apontam para o mesma parte que foi salva na memoria.

//    Ao fazer `p2 = p1`, você está criando uma referência de `p2` para o mesmo objeto que `p1` aponta na memória. Então,
//    quando você altera o preço de `p2` usando `p2.setPreco(2.00)`, você está modificando o objeto original, que também é
//    acessado por `p1`. Por isso, `p1.getPreco()` retorna `2.00`. Continue assim, estudando e praticando, você está no
//    caminho certo!

    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 1.50);
        Produto p2 = p1;
        p2.setPreco(2.00);
        System.out.println(p1.getPreco());
    }
}