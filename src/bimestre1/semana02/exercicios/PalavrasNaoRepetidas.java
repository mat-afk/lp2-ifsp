package bimestre1.semana02.exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PalavrasNaoRepetidas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite uma frase: ");
        String frase = scan.nextLine();
        String[] palavras = frase.split(" ");

        Set<String> palavrasNaoRepetidas = new HashSet<>();

        for (String palavra : palavras) {
            palavra = palavra.replace(",", "");
            palavra = palavra.replace(".", "");
            palavra = palavra.replace(";", "");
            palavrasNaoRepetidas.add(palavra);
        }

        System.out.println("Palavras não repetidas: " + palavrasNaoRepetidas.size());
        for (String palavraNaoRepetida : palavrasNaoRepetidas) {
            System.out.printf(palavraNaoRepetida + " / ");
        }

        scan.close();
    }
}
