package t48_Daty_i_czas.e2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Calendar {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("PIERWSZA DATA");
        LocalDate firstDate = getUserDate(sc);
        System.out.println("DRUGA DATA");
        LocalDate secondDate = getUserDate(sc);
        processDates(firstDate, secondDate);
        sc.close();
    }

    private static void processDates(LocalDate firstDate, LocalDate secondDate) {
        LocalDate earliestDate = firstDate.isBefore(secondDate) ? firstDate : secondDate;
        System.out.println("Wcześniejsza data to: " + earliestDate);
        Period period = Period.between(firstDate, secondDate);
        int years = Math.abs(period.getYears());
        int months = Math.abs(period.getMonths());
        int days = Math.abs(period.getDays());
        System.out.printf("Podane daty dzielą się %d lat, %d miesięcy i %d dni.", years, months, days);
    }

    private static LocalDate getUserDate(Scanner sc) {
        System.out.println("Podaj dzień miesiąca:");
        int day = sc.nextInt();
        System.out.println("Podaj miesiąc:");
        int month = sc.nextInt();
        System.out.println("Podaj rok:");
        int year = sc.nextInt();
        return LocalDate.of(year, month, day);
    }
}
