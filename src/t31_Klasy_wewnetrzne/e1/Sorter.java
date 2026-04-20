package t31_Klasy_wewnetrzne.e1;

import java.util.Arrays;

public class Sorter {

    Sortable bubbleSort = new Sortable() {
        public int[] sort(int[] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
            return array;
        }
    };

    static void main() {
        Sorter sorter = new Sorter();
        int[] array = {5, 23, 94, 12, 1, 0, -1};
        int[] sortedArray = sorter.bubbleSort.sort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}
