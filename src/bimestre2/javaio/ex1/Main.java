package bimestre2.javaio.ex1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import bimestre2.javaio.Utils;

public class Main {
    private static final String PKG = "ex1";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FileInputStream in = null;

        while (true) {
            System.out.print("Digite o nome de um arquivo para ler o seu conteúdo: ");
            String fileName = scanner.nextLine();

            try {
                in = new FileInputStream(Utils.getFilePath(PKG, fileName + ".txt"));
            }
            catch (FileNotFoundException err) {
                System.out.println("Arquivo não encontrado.");
                continue;
            }

            break;
        }

        int bits;
                
        try {
            while ((bits = in.read()) != -1) {
                System.out.print((char) bits);
            }

            in.close();
        }
        catch (IOException err) {
            err.printStackTrace();
        }

        scanner.close();
    }
}