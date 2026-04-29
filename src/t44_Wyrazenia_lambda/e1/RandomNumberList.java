package t44_Wyrazenia_lambda.e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class RandomNumberList {
    static void main() {
        List<Integer> list = generateList(10, () -> new Random().nextInt(100));
        printList(list, s -> System.out.printf("%s ",s));
        filterList(list, s -> s % 2 == 0);
        printList(list, s -> System.out.printf("%s ",s));

    }

    private static <T> List<T> generateList(int elementsNumber, Supplier<T> supplier) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < elementsNumber; i++) {
            result.add(supplier.get());
        }
        return result;
    }

    private static <T> void printList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
        System.out.println();
    }

    private static <T> void filterList(List<T> list, Predicate<T> predicate){
        list.removeIf(predicate);
    }
}
