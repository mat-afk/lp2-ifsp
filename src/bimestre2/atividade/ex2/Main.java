package bimestre2.atividade.ex2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static final String SOURCE_PATH = "src/bimestre2/atividade/ex2/";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Envie uma mensagem: ");
        String mensagem = scanner.nextLine();

        Set<String> vogais = Set.of("a", "e", "i", "o", "u");
        Set<String> invalidCharacters = Set.of(" ", ".", ",", ":", ";", "!", "?", "@", "#", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9");

        FileWriter writerVogais = null;
        FileWriter writerConsoantes = null;

        try {
            writerVogais = new FileWriter(SOURCE_PATH + "vogais.txt");
            writerConsoantes = new FileWriter(SOURCE_PATH + "consoantes.txt");
            
            for (String letra : mensagem.split("")) {
                if (invalidCharacters.contains(letra)) {
                    continue;
                }

                if (vogais.contains(letra.toLowerCase())) {
                    writerVogais.write(letra + " ");
                }
                else {
                    writerConsoantes.write(letra + " ");
                }
            }
        }
        catch (IOException err) {
            System.out.println(err.getMessage());
        }
        finally {
            try {
                if (writerVogais != null) {
                    writerVogais.close();
                }
                    
                if (writerConsoantes != null) {
                    writerConsoantes.close();
                }
            }
            catch (IOException err) {
                System.out.println(err.getMessage());
            }
        }

        scanner.close();
    }
}
