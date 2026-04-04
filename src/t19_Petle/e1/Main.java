package t19_Petle.e1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile liczb chcesz wprowadzić?:");
        double sum = 0;
        int numberOfNumbers = scanner.nextInt();
        while (numberOfNumbers-- > 0) {
            System.out.println("Podaj liczbę: ");
            sum += scanner.nextInt();
        }
        System.out.println("Suma liczb: " + sum);
        scanner.close();
    }
}
