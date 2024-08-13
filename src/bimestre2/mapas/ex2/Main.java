package bimestre2.mapas.ex2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com uma frase: ");
        String frase = scanner.nextLine();

        Set<String> palavrasNaoRepetidas = new HashSet<>();

        String[] palavras =  frase.split(" ");
        for (String palavra : palavras) {
            palavrasNaoRepetidas.add(palavra.toLowerCase());
        }

        System.out.println("Foram encontradas " + palavrasNaoRepetidas.size() + " palavras não repetidas.");

        scanner.close();
    }   
}
