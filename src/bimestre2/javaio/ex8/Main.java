package bimestre2.javaio.ex8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import bimestre2.javaio.Utils;

public class Main {

    private static final String PKG = "ex8";
    private static int ARRAY_SIZE = 10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[ARRAY_SIZE];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite um número: ");
            nums[i] = scanner.nextInt();
        }

        scanner.close();

        FileWriter out = null;

        try {
            out = new FileWriter(Utils.getFilePath(PKG, "num.txt"));

            for (int num : nums) {
                out.write(num + "\n");
            }
        }
        catch (IOException err) {
            System.out.println(err.getMessage());
        }
        finally {
            try {
                if (out != null) 
                    out.close();
            }
            catch (IOException err) {
                System.out.println(err.getMessage());
            }
        }
    }
}
