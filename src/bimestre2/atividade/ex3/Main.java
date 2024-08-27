package bimestre2.atividade.ex3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String SOURCE_PATH = "src/bimestre2/atividade/ex3/";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FileOutputStream out = null;

        try {
            out = new FileOutputStream(SOURCE_PATH + "num.txt");

            System.out.println("Digite 10 números a serem gravados no arquivo:");

            byte[] spaceBytes = " ".getBytes();
            for (int i = 0; i < 10; i++) {
                Integer num = scanner.nextInt();

                byte[] numInBytes = num.toString().getBytes();
                out.write(numInBytes);
                out.write(spaceBytes);
            }
        }
        catch (IOException err) {
            err.printStackTrace();
        }
        finally {
            try {
                if (out != null) {
                    out.close();
                }
            }
            catch (IOException err) {
                err.printStackTrace();
            }
        }

        scanner.close();
    }
}
