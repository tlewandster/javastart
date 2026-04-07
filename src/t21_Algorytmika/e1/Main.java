package t21_Algorytmika.e1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        System.out.println("Podaj liczby całkowite <= 100. Większa zakończy program.");
        Scanner scanner = new Scanner(System.in);
        do {
            sum += number;
            number = scanner.nextInt();
        } while (number <= 100);
        scanner.close();
        String result = sum % 2 == 0 ? "parzysta" : "nieparzysta";
        System.out.println("Suma podanych liczb to " + sum + " i jest to liczba " + result);
    }
}
