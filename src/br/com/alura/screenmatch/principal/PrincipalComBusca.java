package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do filme: ");
        var busca = input.next();

        try {
        String endereco = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=971786e5";

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build();
    HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
    String json = response.body();
        System.out.println(json);

    var gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .create();

        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class); // convertendo json em objeto
        System.out.println(meuTituloOmdb);

        //try {
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Título já convertido");
            System.out.println(meuTitulo);
        } catch (NumberFormatException e) {
            System.out.println("Formáto inválido:");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
                System.out.println("Algum erro de argumento na busca");
        } catch (ErroDeConversaoDeAnoException e){
            System.out.println(e.getMensagem());
        }
        System.out.println("O programa finalizou corretamente! ");
    }
}

