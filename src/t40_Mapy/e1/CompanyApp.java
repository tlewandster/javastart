package t40_Mapy.e1;

import java.util.Scanner;

public class CompanyApp {
    private static final Scanner sc = new Scanner(System.in);

    static void main() {
        boolean exit = false;
        while (!exit) {
            switch (showMenu()) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    showEmployee();
                    break;
                case 3:
                    exit = true;
            }

        }
    }

    private static void showEmployee() {
        System.out.println("Imię:");
        String firstName = sc.nextLine();
        System.out.println("Nazwisko:");
        String lastName = sc.nextLine();
        String key = firstName + lastName;
        Employee employee = Company.employees.get(key);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Nie znaleziono pracownika");
        }
    }

    private static void addEmployee() {
        System.out.println("Imię:");
        String firstName = sc.nextLine();
        System.out.println("Nazwisko:");
        String lastName = sc.nextLine();
        System.out.println("Wynagrodzenie");
        double salary = Double.parseDouble(sc.nextLine());
        Employee employee = new Employee(firstName, lastName, salary);
        String key = firstName + lastName;
        Company.employees.put(key, employee);
        System.out.println("Dodano pracownika");
    }

    private static int showMenu() {
        System.out.println("Wybierz jedną z opcji:");
        System.out.println("1 - Dodaj pracownika");
        System.out.println("2 - Wyszukaj pracownika");
        System.out.println("3 - Wyjście");
        String choice = sc.nextLine();
        if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
            System.out.println("Wybrana opcja jest niewłaściwa");
            showMenu();
        }
        return Integer.parseInt(choice);
    }


}
