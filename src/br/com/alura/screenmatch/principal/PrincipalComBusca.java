package br.com.alura.screenmatch.principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        //java 8
       /* try {
            URL url = new URL("http://www.omdbapi.com/?t=matrix&y=1999&apikey=5d75dc03");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Print the result
                System.out.println(response.toString());
            } else {
                System.out.println("GET request failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/


        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = leitura.nextLine();

        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=5d75dc03";
        System.out.println(endereco);
        // apenas no java 11 em diante
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println();
        System.out.println(response.body());

    }
}
