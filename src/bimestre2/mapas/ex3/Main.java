package bimestre2.mapas.ex3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> palavrasCounter = new HashMap<>();

        while (true) {
            System.out.print("Digite uma frase: ");
            String frase = scanner.nextLine();

            if (frase.isBlank()) {
                break;
            }

            String[] palavras = frase.split(" ");

            for (String palavra : palavras) {
                String palavraLowerCase = palavra.toLowerCase();

                if (!palavrasCounter.keySet().contains(palavraLowerCase)) {
                    palavrasCounter.put(palavraLowerCase, 0);
                }
                
                palavrasCounter.put(palavraLowerCase, palavrasCounter.get(palavraLowerCase) + 1);
            }
        }

        System.out.println("Número de ocorrências de cada palavra.");
        for (String palavra : palavrasCounter.keySet()) {
            System.out.println(palavra + ": " + palavrasCounter.get(palavra));
        }

        scanner.close();
    }
}
