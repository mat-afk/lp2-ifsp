package bimestre2.javaio.ex3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import bimestre2.javaio.Utils;

public class Main {

    private static final String PKG = "ex3";

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        
        Random randomizer = new Random();

        for (int i = 0; i < 10; i++) {
            nums.add(randomizer.nextInt(1, 101));
        }

        nums.sort(null);

        FileOutputStream outPares = null;
        FileOutputStream outImpares = null;

        try {
            outPares = new FileOutputStream(Utils.getFilePath(PKG, "pares.txt"));
            outImpares = new FileOutputStream(Utils.getFilePath(PKG, "impares.txt"));

            byte[] space = " ".getBytes();

            for (Integer num : nums) {
                byte[] bytes = num.toString().getBytes();
                if (num % 2 == 0) {
                    outPares.write(bytes);
                    outPares.write(space);
                } 
                else {
                    outImpares.write(bytes);
                    outImpares.write(space);
                }
            }
        }
        catch (IOException err) {
            System.out.println(err.getMessage());
        }
        finally {
            try {
                outPares.close();
                outImpares.close();
            }
            catch (IOException err) {
                System.out.println(err.getMessage());
            }
        }
    }
}
