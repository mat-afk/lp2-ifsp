package bimestre2.javaio.ex4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import bimestre2.javaio.Utils;

public class Main {

    private static final String PKG = "ex4";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva uma mensagem para ser guardada no arquivo: ");
        String message = scanner.nextLine();

        FileWriter out = null;

        try {
            out = new FileWriter(Utils.getFilePath(PKG, "output.txt"));

            out.write(message);
        }
        catch (IOException err) {
            System.out.println(err.getMessage());
        }
        finally {
            try {
                out.close();
            }
            catch (IOException err) {
                System.out.println(err.getMessage());
            }
        }

        scanner.close();
    }
}
