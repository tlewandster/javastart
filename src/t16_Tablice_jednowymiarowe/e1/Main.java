package t16_Tablice_jednowymiarowe.e1;

public class Main {
    static void main() {
        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {4, 5, 6};

        System.out.println("Suma elementów tablicy 1: " + (numbers1[0] + numbers1[1] + numbers1[2]));
        System.out.println("Suma elementów tablicy 2: " + (numbers2[0] + numbers2[1] + numbers2[2]));
        System.out.println("Suma elementów obu tablic: " + sumArrays(numbers1, numbers2));

    }

    static int sumArrays(int[] numbers1, int[] numbers2) {
        int sum1 = numbers1[0] + numbers1[1] + numbers1[2];
        int sum2 = numbers2[0] + numbers2[1] + numbers2[2];
        return sum1 + sum2;
    }
}
