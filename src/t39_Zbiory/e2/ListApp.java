package t39_Zbiory.e2;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class ListApp {
    private static final Scanner sc = new Scanner(System.in);
    private static final Set<Product> products = new HashSet<>();

    static void main() {
        printMenu();
    }

    private static void printMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("Dostępne opcje: ");
            System.out.println(" > Dodaj nowy produkt - 0");
            System.out.println(" > Koniec programu - 1");

            int choice;

            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Musisz wybrać liczbę!");
                sc.nextLine();
                continue;
            }

            sc.nextLine();

            if (choice == 0) {
                addProduct();
            } else if (choice == 1) {
                showProducts();
                exit = true;
            } else {
                System.out.println("Wybrano nieprawidłową opcję.");
            }
        }

        sc.close();
    }

    private static void showProducts() {
        System.out.println("Lista produktów:");
        System.out.println(products);
    }

    private static void addProduct() {
        System.out.println("Podaj nazwę produktu:");
        String name = sc.nextLine();

        System.out.println("Podaj cenę produktu:");

        double price;

        try {
            price = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Cena musi być liczbą!");
            sc.nextLine();
            return;
        }

        sc.nextLine();

        Product product = new Product(name, price);

        if (!products.contains(product) || getDecision()) {
            products.add(product);
        }
    }

    private static boolean getDecision() {
        while (true) {
            System.out.println("Znaleziono produkt o takiej nazwie.");
            System.out.println("Co chcesz zrobić:");
            System.out.println(" > Zignoruj ten produkt - 0");
            System.out.println(" > Nadpisz ten produkt - 1");

            int choice;

            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Musisz wybrać liczbę!");
                sc.nextLine();
                continue;
            }

            sc.nextLine();

            if (choice == 0) {
                return false;
            } else if (choice == 1) {
                return true;
            } else {
                System.out.println("Wybrano nieprawidłową opcję.");
            }
        }
    }
}