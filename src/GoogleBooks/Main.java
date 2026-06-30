package GoogleBooks;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o titulo de um livro: ");
        String titulo = sc.nextLine();

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + titulo + "&key=" + "AIzaSyD1X246xlz_s8tGoqGDiXW-58GFQ5GAMfs";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
