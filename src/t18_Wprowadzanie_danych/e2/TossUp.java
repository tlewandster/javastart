package t18_Wprowadzanie_danych.e2;

import java.util.Scanner;

public class TossUp {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz jedną z dwóch opcji: ");
        System.out.println("1 - orzeł");
        System.out.println("0 - reszka");
        int choice = scanner.nextInt();
        if (choice != 0 && choice != 1) {
            System.out.println("Nieprawidłowy wybór. Wybierz 0 lub 1.");
            return;
        }
        tossUp(choice);
        scanner.close();
    }

    private static void tossUp(int choice) {
        String[] coinSideNames = {"reszka", "orzeł"};
        int rnd = (int) (Math.random() * 2);
        if (choice == rnd) {
            System.out.println("Brawo, jest " + coinSideNames[rnd] + "! Wygrałeś!");
        } else {
            System.out.println("Niestety, jest " + coinSideNames[rnd] + "! Przegrałeś!");
        }
    }
}
