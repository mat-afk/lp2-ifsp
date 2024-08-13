package bimestre2.mapas.ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> cidades = new HashMap<>();

        while (true) {
            
            System.out.print("Digite o nome de uma cidade: ");
            String nomeCidade = scanner.nextLine();

            if (nomeCidade.isBlank()) {
                break;
            }

            if (cidades.keySet().contains(nomeCidade)) {
                continue;
            }

            String semEspacos = nomeCidade.replaceAll(" ", "");
            cidades.put(nomeCidade, semEspacos.length());
        }

        System.out.println("Letras contadas em cada cidade.");
        for (String cidade : cidades.keySet()) {
            System.out.println(cidade + ": " + cidades.get(cidade));
        }

        scanner.close();
    }
}
