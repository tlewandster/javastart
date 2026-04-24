package t38_Listy.e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumNum {

    static List<Integer> numbers = new ArrayList<>();

    static void main() {
        getNumbers();
        printNumbers();
        printSumNumbers();
    }

    private static void printNumbers() {
        System.out.println("Podałeś numery:");
        for (Integer number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();
    }

    private static void getNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź numery do zsumowania:");
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        scanner.close();
    }

    private static void printSumNumbers() {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + (i != numbers.size()-1 ? " + ": " = "));
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }
}
