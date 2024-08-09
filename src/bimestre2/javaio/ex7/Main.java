package bimestre2.javaio.ex7;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import bimestre2.javaio.Utils;

public class Main {

    private static final String PKG = "ex7";

    public static void main(String[] args) {

        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader(Utils.getFilePath(PKG, "notas.txt"));

            int bits;
            StringBuilder line = new StringBuilder();
            while ((bits = reader.read()) != -1) {
                line.append((char) bits);
            }

            List<Double> notas = new ArrayList<>();

            for (String text : line.toString().split(" ")) {
                notas.add(Double.parseDouble(text));
            }

            double soma = 0.0;
            for (double nota : notas) {
                soma += nota;
            }

            double media = soma / notas.size();

            writer = new FileWriter(Utils.getFilePath(PKG, "notas.txt"));

            for (double nota : notas) {
                writer.write(nota + " ");
            }

            writer.write("\n" + media);
        }
        catch (IOException err) {
            System.out.println(err.getMessage());
        }
        finally {
            try {
                if (reader != null) 
                    reader.close();

                if (writer != null) 
                    writer.close();
            }
            catch (IOException err) {
                System.out.println(err.getMessage());
            }
        }
    }
}
