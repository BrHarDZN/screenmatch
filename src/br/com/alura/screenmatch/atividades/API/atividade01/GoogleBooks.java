package br.com.alura.screenmatch.atividades.API.atividade01;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GoogleBooks {
    //  1- Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse para fazer uma
    //  consulta à API do Google Books. Solicite ao usuário que insira o título de um livro, e exiba as informações
    //  disponíveis sobre o livro retornado pela API.
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {


        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o título do livro para a busca (coloque + ao inves de espaços): ");
        var tituloLivro = leitura.nextLine();

        //sem a chave pois não consegui criar.
        String chave = "";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + tituloLivro + "&key=" + chave;
        System.out.println(endereco);


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }

}
