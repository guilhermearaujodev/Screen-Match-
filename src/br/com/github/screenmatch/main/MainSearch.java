package br.com.github.screenmatch.main;

import br.com.github.screenmatch.models.Title;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner reading = new Scanner (System.in);
        System.out.println("Type a movie to search: ");
        var search = reading.nextLine();
        String address = "http://www.omdbapi.com/?t=" + search + "&apikey=38aa991e";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(address))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson ();
        Title myTitle = gson.fromJson(json, Title.class);
        System.out.println("Title: " + myTitle.getName());
    }
}
