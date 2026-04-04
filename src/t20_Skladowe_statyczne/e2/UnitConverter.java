package t20_Skladowe_statyczne.e2;

import java.util.Scanner;

public class UnitConverter {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int unit;
        do {
            System.out.println("Wpisz rodzaj jednostki i wartość do przeliczenia:");
            System.out.println("1 - szklanka");
            System.out.println("2 - łyżka");
            System.out.println("3 - łyżeczka");
            System.out.println("0 - koniec");
            unit = scanner.nextInt();
            if (unit == 0) {
                scanner.close();
                return;
            }
            scanner.nextLine();
            double value = scanner.nextDouble();

            switch (unit) {
                case 1:
                    convertCupToML(value);
                    break;
                case 2:
                    convertSpoonToML(value);
                    break;
                case 3:
                    convertTeaspoonToML(value);
                    break;
                default:
                    System.out.println("Nieznana jednostka");
                    break;
            }
            System.out.println();
        } while (true);
    }

    private static void convertTeaspoonToML(double value) {
        System.out.println(value + " * łyżeczka = " + (value * 5) + " ml");
    }

    private static void convertSpoonToML(double value) {
        System.out.println(value + " * łyżka = " + (value * 15) + " ml");
    }

    private static void convertCupToML(double value) {
        System.out.println(value + " * szklanka = " + (value * 250) + " ml");
    }
}

