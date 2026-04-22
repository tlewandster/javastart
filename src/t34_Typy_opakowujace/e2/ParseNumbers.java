package t34_Typy_opakowujace.e2;

import java.util.Scanner;

public class ParseNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dowolny tekst z literami i cyframi:");
        String input = sc.nextLine();
        sc.close();

        System.out.printf("""
                Liczba cyfr w tekście: %d
                Liczba liter w tekście %d
                """, countNumbers(input), countChars(input));
        if (countNumbers(input) != 0) System.out.println("Największa cyfra w tekście to " + findMaxDigit(input));
    }


    private static int countNumbers(String input) {
        int count = 0;
        var chars = input.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    private static int countChars(String input) {
        int count = 0;
        var chars = input.toCharArray();
        for (char c : chars) {
            if (Character.isAlphabetic(c)) {
                count++;
            }
        }
        return count;
    }

    private static int findMaxDigit(String input) {
        int maxDigit = 0;
        var chars = input.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                maxDigit = Math.max(maxDigit, Character.getNumericValue(c));
            }
        }
        return maxDigit;
    }
}
