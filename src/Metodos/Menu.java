package Metodos;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public void menu() throws IOException, InterruptedException {
        Scanner scan = new Scanner(System.in);
        Conversor conversor = new Conversor();

        boolean sair = false;
        while (!sair) {
            System.out.println("Escolha alguma conversão:");
            System.out.println();
            System.out.println("1) Dólar -> Peso argentino");
            System.out.println("2) Peso argentino -> Dólar");
            System.out.println("3) Dólar -> Real brasileiro");
            System.out.println("4) Real brasileiro -> Dólar");
            System.out.println("5) Dólar -> Peso colombiano");
            System.out.println("6) Peso colombiano -> Dólar");
            System.out.println("7) Sair");
            var entrada = scan.nextInt();
            switch (entrada){
                case 1:
                    conversor.api("USD", "ARS");
                    break;
                case 2:
                    conversor.api("ARS", "USD");
                    break;
                case 3:
                    conversor.api("USD", "BRL");
                    break;
                case 4:
                    conversor.api("BRL", "USD");
                    break;
                case 5:
                    conversor.api("USD", "COP");
                    break;
                case 6:
                    conversor.api("COP", "USD");
                    break;
                case 7:
                    sair = true;
                    break;
            }
            if (sair) {
                break;
            }
        }
    }
}
