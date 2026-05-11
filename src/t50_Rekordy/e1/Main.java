package t50_Rekordy.e1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
        static Path FILE = Path.of("src/t50_Rekordy/e1/weather.csv");
        static String comaDelimiter = ";";
        static Scanner sc = new Scanner(System.in);

    static void main() throws IOException {
        List<DailyTemperature> records = getDataFromCsv(FILE);
        LocalDate userDate = getUserDate();
        DailyTemperature.TempUnit userUnit = getUserUnit();
        findRecordByDate(records,userDate,userUnit);
    }

    private static void findRecordByDate(List<DailyTemperature> records, LocalDate userDate, DailyTemperature.TempUnit userUnit) {
        records.stream()
                .filter(dailyTemperature -> dailyTemperature.date().equals(userDate))
                .forEach(r-> System.out.println("Minimalna temperatura dnia " + userDate + " wynosiła " + r.tempInUnit(r.minTemperature(), userUnit) + ", a maksymalna "+ r.tempInUnit(r.maxTemperature(), userUnit)));
    }

    private static DailyTemperature.TempUnit getUserUnit() {
        System.out.println("W jakiej jednostce wyświetlić pomiary? (C / F)?:");
        String s = sc.nextLine();
        if (s.equals("F") || s.equals("f")) {
            return DailyTemperature.TempUnit.FAHRENHEIT;
        } else {
            return DailyTemperature.TempUnit.CELSIUS;
        }
    }

    private static LocalDate getUserDate() {
        System.out.println("Dane z którego dnia Cię interesują? (format yyyy-MM-dd):");
        return LocalDate.parse(sc.nextLine());
    }

    private static List<DailyTemperature> getDataFromCsv(Path file) throws IOException {
        return Files.readAllLines(file)
                .stream()
                .map(line -> line.split(comaDelimiter))
                .map(Main::getRecord)
                .toList();
    }

    private static DailyTemperature getRecord(String[] line) {
        LocalDate localDate = LocalDate.parse(line[0]);
        double minTemperature = Double.parseDouble(line[1]);
        double maxTemperature = Double.parseDouble(line[2]);
        DailyTemperature.TempUnit tempUnit = DailyTemperature.TempUnit.valueOf(line[3]);
        return new DailyTemperature(localDate, minTemperature, maxTemperature, tempUnit);
    }


}
