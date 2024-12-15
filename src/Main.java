import Metodos.Conversor;
import Metodos.Menu;
import Modelos.Moeda;
import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Menu menu = new Menu();
        menu.menu();

    }
}
