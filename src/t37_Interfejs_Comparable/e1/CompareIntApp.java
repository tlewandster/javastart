package t37_Interfejs_Comparable.e1;

import java.util.Arrays;
import java.util.Comparator;

public class CompareIntApp implements Comparator<Integer> {
    static final Integer[] numbers = new Integer[20];

    static void main() {
        drawNumbers();
        showNumbers();
        getNumbersRight();
        showNumbers();
    }

    private static void getNumbersRight() {
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
    }

    private static void showNumbers() {
        for (Integer number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println("\n");
    }

    private static void drawNumbers() {
        for (int i = 0; i < 20; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
