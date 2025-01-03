package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
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
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println();
            System.out.println("Digite um filme para busca: ");
            busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ","+") + "&apikey=5d75dc03";
            System.out.println(endereco);
            // apenas no java 11 em diante

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

                HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
                System.out.println();
                String json = response.body();
                System.out.println(json);

                TituloOmdb tituloOmdb = gson.fromJson(json,TituloOmdb.class);
                System.out.println();
                System.out.println(tituloOmdb);
                System.out.println();
                Titulo titulo = new Titulo(tituloOmdb);
                System.out.println("Titulo já convertido");
                System.out.println();
                System.out.println(titulo);

                titulos.add(titulo);

            } catch (NumberFormatException e) {
                System.out.println();
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println();
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println();
                System.out.println(e.getMensagem());
            }
        }
        System.out.println();
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println("o arquivo foi salvo corretamente");
    }
}
