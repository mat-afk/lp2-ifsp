package semana02.exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CaracteresSet {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite uma string: ");
        String string = scan.nextLine();

        String[] caracteres = string.split("");

        Set<String> caracteresUnicos1 = new HashSet<>();
        Set<String> caracteresUnicos2 = new TreeSet<>();

        for (String caractere : caracteres) {
            caracteresUnicos1.add(caractere);
            caracteresUnicos2.add(caractere);
        }

        System.out.println("Caracteres armazenados em HashSet: ");
        for (String caractereUnico : caracteresUnicos1) {
            System.out.printf(caractereUnico + " / ");
        }

        System.out.println("\nCaracteres armazenados em TreeSet: ");
        for (String caractereUnico : caracteresUnicos2) {
            System.out.printf(caractereUnico + " / ");
        }

        // HashSet armazena itens únicos, em ordem aleatória
        // TreeSet armazena itens únicos, em ordem crescente

        scan.close();
    }
}
