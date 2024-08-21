package bimestre2.atividade.ex2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static final String PATH = "src/bimestre2/atividade/ex2/";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Envie uma mensagem: ");
        String mensagem = scanner.nextLine();

        Set<String> vogais = Set.of("a", "e", "i", "o", "u");
        Set<String> invalidCharacters = Set.of(" ", ".", ",", ":", ";", "!", "?", "@", "#", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9");

        FileWriter writerVogais = null;
        FileWriter writerConsoantes = null;

        try {
            writerVogais = new FileWriter(PATH + "vogais.txt");
            writerConsoantes = new FileWriter(PATH + "consoantes.txt");

            Set<String> vogaisInMensagem = new HashSet<>();
            Set<String> consoantesInMensagem = new HashSet<>();
            
            for (String letra : mensagem.split("")) {
                if (invalidCharacters.contains(letra)) {
                    continue;
                }

                letra = letra.toLowerCase();

                if (vogais.contains(letra.toLowerCase())) {
                    vogaisInMensagem.add(letra);
                }
                else {
                    consoantesInMensagem.add(letra);
                }
            }

            writerVogais.write(String.join(" ", vogaisInMensagem));
            writerConsoantes.write(String.join(" ", consoantesInMensagem));
        }
        catch (IOException err) {
            System.out.println(err.getMessage());
        }
        finally {
            try {
                writerVogais.close();
                writerConsoantes.close();
            }
            catch (IOException err) {
                System.out.println(err.getMessage());
            }
        }

        scanner.close();
    }
}
