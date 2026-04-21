package t32_Operacje_na_plikach.e1;

import java.io.*;
import java.util.Scanner;

class CompanyApp {

    private final Company company = new Company();
    private final Scanner sc = new Scanner(System.in);
    private final String fileName = "employees.obj";

    static void main() {
        CompanyApp app = new CompanyApp();
        app.showMenu();
    }

    void showMenu() {
        boolean exit = false;
        do {
            System.out.println("1 - Dodaj pracowników i zapisz do pliku");
            System.out.println("2 - Wczytaj pracowników z pliku");
            System.out.println("3 - Wyjście z programu");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    SaveEmployeesToFile(addEmployees());
                    break;
                case 2:
                    showEmployees(loadEmployeesFromFile());
                    break;
                case 3:
                    sc.close();
                    exit = true;
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór");
                    break;
            }
        } while (!exit);

    }

    Employee[] addEmployees() {
        for (int i = 0; i < company.employees.length; i++) {
            System.out.println("Podaj imię pracownika nr " + (i + 1));
            String firstName = sc.nextLine();
            System.out.println("Podaj nazwisko pracownika nr " + (i + 1));
            String lastName = sc.nextLine();
            System.out.println("Podaj zarobki pracownika nr " + (i + 1));
            int salary = sc.nextInt();
            sc.nextLine();
            company.employees[i] = new Employee(firstName, lastName, salary);
        }
        return company.employees;
    }


    void SaveEmployeesToFile(Employee[] employees) {

        try (
                var fs = new FileOutputStream(fileName);
                var os = new ObjectOutputStream(fs)
        ) {
            os.writeObject(employees);
            System.out.println("Plik zapisany");
        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku");
        }
    }

    Employee[] loadEmployeesFromFile() {
        Employee[] employees = null;
        try (
                var fs = new FileInputStream(fileName);
                var os = new ObjectInputStream(fs)
        ) {
            employees = (Employee[]) os.readObject();
        } catch (ClassNotFoundException | IOException e) {
            System.err.println("Błąd odczytu pliku");
        }
        return employees;
    }

    void showEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

}

