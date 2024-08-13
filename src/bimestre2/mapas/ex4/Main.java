package bimestre2.mapas.ex4;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> diasDaSemanaPorData = new HashMap<>();

        System.out.println("Digite o dia, mês e ano de uma data (separados por um espaço): ");

        while (true) {
            String dataStr = scanner.nextLine();

            if (dataStr.isBlank()) {
                break;
            }

            String[] dataFragments = dataStr.split(" ");

            if (dataFragments.length != 3) {
                System.out.println("Formato inválido, tente novamente.");
            }

            int dia = Integer.parseInt(dataFragments[0]);
            int mes = Integer.parseInt(dataFragments[1]);
            int ano = Integer.parseInt(dataFragments[2]);

            LocalDate data = LocalDate.of(ano, mes, dia);

            diasDaSemanaPorData.put(data.toString(), data.getDayOfWeek().toString());
        }

        Map<String, String> dayOfWeekToPortuguese = new HashMap<>();
        dayOfWeekToPortuguese.put("MONDAY", "SEGUNDA-FEIRA");
        dayOfWeekToPortuguese.put("TUESDAY", "TERÇA-FEIRA");
        dayOfWeekToPortuguese.put("WEDNESDAY", "QUARTA-FEIRA");
        dayOfWeekToPortuguese.put("THURSDAY", "QUINTA-FEIRA");
        dayOfWeekToPortuguese.put("FRIDAY", "SEXTA-FEIRA");
        dayOfWeekToPortuguese.put("SATURDAY", "SÁBADO");
        dayOfWeekToPortuguese.put("SUNDAY", "DOMINGO");

        Map<String, Integer> datasPorDiaDaSemana = new HashMap<>();

        for (String data : diasDaSemanaPorData.keySet()) {
            String dayOfWeek = diasDaSemanaPorData.get(data);
            String diaDaSemana = dayOfWeekToPortuguese.get(dayOfWeek);

            if (!datasPorDiaDaSemana.containsKey(diaDaSemana)) {
                datasPorDiaDaSemana.put(diaDaSemana, 0);
            }
            datasPorDiaDaSemana.put(diaDaSemana, datasPorDiaDaSemana.get(diaDaSemana) + 1);
        }

        for (String diaDaSemana : datasPorDiaDaSemana.keySet()) {
            System.out.println(diaDaSemana + ": " + datasPorDiaDaSemana.get(diaDaSemana));
        }

        scanner.close();
    }
}
