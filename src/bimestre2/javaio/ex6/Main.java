package bimestre2.javaio.ex6;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import bimestre2.javaio.Utils;

public class Main {

    private static final String PKG = "ex6";

    public static void main(String[] args) {
        List<String> vogais = List.of("a", "e", "i", "o", "u");
        List<String> outros = List.of(" ", ",", ".");

        FileReader reader = null;

        Map<String, Integer> counter = new HashMap<>(); 

        counter.put("Vogais", 0);
        counter.put("Consoantes", 0);
        counter.put("Outros", 0);
        counter.put("Total", 0);

        try {
            reader = new FileReader(Utils.getFilePath(PKG, "input.txt"));

            int bits;
            while ((bits = reader.read()) != -1) {
                String character = String.valueOf((char) bits);

                counter.put("Total", counter.get("Total") + 1);
                
                if (outros.contains(character)) {
                    counter.put("Outros", counter.get("Outros") + 1);
                }
                else if (vogais.contains(character)) {
                    counter.put("Vogais", counter.get("Vogais") + 1);
                } 
                else {
                    counter.put("Consoantes", counter.get("Consoantes") + 1);
                }
            }

        }
        catch (IOException err) {
            System.out.println(err.getMessage());
        }
        finally {
            try {
                reader.close();
            }
            catch (IOException err) {
                System.out.println(err.getMessage());
            }
        }

        for (String key : counter.keySet())
        System.out.println(key + ": " + counter.get(key));
    }
}
