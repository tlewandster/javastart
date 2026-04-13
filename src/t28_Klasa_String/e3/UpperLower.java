package t28_Klasa_String.e3;

import java.util.Scanner;

public class UpperLower {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź tekst do przekształcenia: ");
        String input = sc.nextLine();
        System.out.println("Tekst po transformacji: ");
        char firstChar = input.charAt(0);
        if (firstChar >= 'a' && firstChar <= 'z') {
            System.out.println(input.toLowerCase());
        } else if (firstChar >= 'A' && firstChar <= 'Z') {
            System.out.println(input.toUpperCase());
        } else {
            System.out.println(input);
        }
    }
}
