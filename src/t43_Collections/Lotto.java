package t43_Collections;

import java.util.*;

public class Lotto {
    private static final Scanner sc = new Scanner(System.in);
    private static List<Integer> numbers = new ArrayList<>();
    private static final List<Integer> userNumbers = new ArrayList<>();

    static void main() {
        getNumbers();
        generate();
        randomize();
        checkResult(numbers);
    }

    private static void getNumbers() {
        boolean numberIsIncorrect;
        System.out.println("Podaj 6 liczb z zakresu 1-49:");
        for (int i = 0; i < 6; i++) {
            do {
                numberIsIncorrect = true;
                System.out.printf("Liczba %d: ", i + 1);
                int number = sc.nextInt();
                if (number < 1 || number > 49) {
                    System.out.println("Trzymaj się zakresu!");
                } else if (userNumbers.contains(number)) {
                    System.out.println("Nie powtarzaj liczb!");
                } else {
                    numberIsIncorrect = false;
                    userNumbers.add(number);
                }
            } while (numberIsIncorrect);
        }
        sc.nextLine();
        userNumbers.sort(Comparator.naturalOrder());
        System.out.println("Oto Twoje liczby: " + userNumbers);
    }

    static void generate() {
        for (int i = 1; i <= 49; i++) {
            numbers.add(i);
        }
    }

    static void randomize() {
        Collections.shuffle(numbers);
        numbers = numbers.subList(0, 6);
        numbers.sort(Comparator.naturalOrder());
        System.out.println("Losowo wylosowano liczby: " + numbers);
    }

    static void checkResult(List<Integer> numbers) {
        Lotto.userNumbers.retainAll(numbers);
        if (Lotto.userNumbers.isEmpty()) {
            System.out.println("Nie odgadłeś ani jednej liczby!");
        } else {
            System.out.printf("Odgadłeś %d liczb! Oto one %s", Lotto.userNumbers.size(), Lotto.userNumbers);
        }
    }
}