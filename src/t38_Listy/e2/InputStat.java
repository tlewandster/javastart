package t38_Listy.e2;

import java.util.ArrayList;
import java.util.Scanner;

public class InputStat {
    static void main() {
        Scanner sc = new Scanner(System.in);
        boolean numberIsCorrect = true;
        ArrayList<Integer> numbers = new ArrayList<>();
        while (numberIsCorrect) {
            System.out.println("Podaj kolejną liczbę nieujemną, podzielną przez 5:");
            int number = sc.nextInt();
            numberIsCorrect = number > 0 && number % 5 == 0;
            if (numberIsCorrect) numbers.add(number);
        }
        System.out.printf("Ile poprawnych liczb: %d%n", numbers.size());
        System.out.printf("Ich suma wynosi: %d%n", getSum(numbers));
        if (!numbers.isEmpty()) {
            System.out.printf("Natomiast średnia to: %.2f%n", getAvg(numbers));
        }
    }

    private static double getAvg(ArrayList<Integer> numbers) {
        return (double) getSum(numbers) / numbers.size();
    }

    private static int getSum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum = sum + number;
        }
        return sum;
    }
}
