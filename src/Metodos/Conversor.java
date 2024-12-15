package Metodos;

import Modelos.Moeda;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Conversor {
    public void api(String primeiraMoeda, String segundaMoeda) throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/bd3b56a6e11d325515373a9b/latest/USD"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        JsonObject jsonObject = new Gson()
                .fromJson(response.body(), JsonObject.class);
        JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");
        Moeda moeda = new Moeda(primeiraMoeda, segundaMoeda);
        JsonPrimitive primeiroRate = (JsonPrimitive) rates.get(primeiraMoeda);
        JsonPrimitive segundoRate = (JsonPrimitive) rates.get(segundaMoeda);

        System.out.println();
        System.out.println("Digite o valor que deseja converter");
        moeda.valor = scan.nextDouble() * Double.parseDouble(primeiroRate.toString());
        moeda.calcularResultado(moeda.valor, Double.parseDouble(primeiroRate.toString()), Double.parseDouble(segundoRate.toString()));
        System.out.println(moeda);
    }
}
