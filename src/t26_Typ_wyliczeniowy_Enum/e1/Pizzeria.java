package t26_Typ_wyliczeniowy_Enum.e1;

import java.util.Scanner;

public class Pizzeria {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz rodzaj pizzy: ");
        System.out.println(Pizza.menu());
        Pizza pizza = Pizza.values()[scanner.nextInt()];
        System.out.println("Przyjęliśmy zamówienie: " + pizza.name() + " - " + pizza);
        scanner.close();
    }
}
