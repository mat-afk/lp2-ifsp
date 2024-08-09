package bimestre2.javaio.ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import bimestre2.javaio.Utils;

public class Main {

    private static final String PKG = "ex2";

    public static void main(String[] args) {
        
        FileInputStream in = null;
        FileOutputStream outMaior = null;
        FileOutputStream outMenor = null;

        try {
            in = new FileInputStream(Utils.getFilePath(PKG, "entrada.txt"));
            outMaior = new FileOutputStream(Utils.getFilePath(PKG, "maior.txt"));
            outMenor = new FileOutputStream(Utils.getFilePath(PKG, "menor.txt"));

            int bits;

            while ((bits = in.read()) != -1) {
                if (bits > 128) {
                    outMaior.write(bits);
                }
                else {
                    outMenor.write(bits);
                }
            }
        }
        catch (IOException err) {
            err.printStackTrace();
        }
        finally {
            try {
                in.close();
                outMaior.close();
                outMenor.close();
            }
            catch (IOException err) {
                err.printStackTrace();
            }
        }
    }
}
