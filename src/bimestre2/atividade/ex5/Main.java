package bimestre2.atividade.ex5;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("Bernardo", "Professor");
        mapa.put("Mateus", "Aluno");
        mapa.put("Marino", "Aluno");
        mapa.put("Ana Lucia", "Coordenadora");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Verifique se a chave existe no mapa: ");
        String key = scanner.nextLine();

        if (mapa.containsKey(key)) {
            System.out.println("Sucesso!");
            System.out.println(key + ": " + mapa.get(key));
        } else {
            System.out.println("Fracasso! A chave não existe no mapa.");
        }

        scanner.close();
    }
}