package br.com.alura.screenmatch.atividades.arraylist.teste;

import java.util.HashMap;
import java.util.Map;

public class HashMapTeste {

    public static void main(String[] args) {
        //Criando um objeto da classe HashMap que implementa a interface Map
        Map<String, Integer> hashMap = new HashMap<>();

        // Adicionando pares chave-valor
        hashMap.put("Gatos", 1);
        hashMap.put("Cachorros", 2);
        hashMap.put("Roedores", 3);

        // Acessando um valor através de uma chave
        System.out.println("Valor da chave Cachorros: " + hashMap.get("Cachorros"));

        // Removendo um par chave-valor
        hashMap.remove("Roedores");

        // Iterando sobre as chaves
        for (String chave : hashMap.keySet()) {
            System.out.println("Chave: " + chave);
            System.out.println("Valor: " + hashMap.get(chave));
        }
    }
}

