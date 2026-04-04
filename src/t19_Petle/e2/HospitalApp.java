package t19_Petle.e2;

import java.util.Scanner;

public class HospitalApp {
    static void main(String[] args) {
        Hospital hospital = new Hospital();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wybierz opcję:");
            System.out.println("0 - wyjście z programu");
            System.out.println("1 - dopisanie pacjenta");
            System.out.println("2 - wyświetlenie listy pacjentów");

            switch (scanner.nextInt()) {
                case 0 -> {
                    return;
                }
                case 1 -> hospital.addPatient(scanner);
                case 2 -> hospital.printPatients();
                default -> System.out.println("Nieprawidłowa opcja");
            }
        }
    }
}
