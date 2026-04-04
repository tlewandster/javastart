package t19_Petle.e2;

import java.util.Scanner;

public class Hospital {

    private static Patient[] patients = new Patient[100];
    private static int numberOfPatients = 0;

    void addPatient(Scanner scanner) {
        scanner.nextLine();
        Patient patient = new Patient();
        System.out.println("Imię: ");
        patient.setFirstName(scanner.nextLine());
        System.out.println("Nazwisko: ");
        patient.setLastName(scanner.nextLine());
        System.out.println("PESEL: ");
        patient.setPesel(scanner.nextInt());
        patients[numberOfPatients++] = patient;
        System.out.println("Pacjent dodany.");
        System.out.println();
    }

    void printPatients() {
        int index = 0;
        System.out.println("Lista pacjentów:");
        for (Patient patient : patients) {
            if (patient != null) {
                System.out.println(++index + ". " + patient.getFirstName() + " " + patient.getLastName() + " PESEL: " + patient.getPesel());
            }
        }
        System.out.println();
    }
}
