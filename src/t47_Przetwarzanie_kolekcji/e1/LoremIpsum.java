package t47_Przetwarzanie_kolekcji.e1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class LoremIpsum {
    static void main() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/t47_Przetwarzanie_kolekcji/e1/loremipsum.txt"));
        List<String> words = sc.tokens()
                .map(LoremIpsum::removePeriodOrComma)
                .toList();
        sc.close();
        long sCount = words.stream().filter(LoremIpsum::isStartingWithS).count();
        long fiveCharCount = words.stream().filter(LoremIpsum::isFiveLettersLong).count();
        System.out.printf("%d wyrazów na 's', %d wyrazów 5-cio literowych", sCount, fiveCharCount);
    }

    private static boolean isFiveLettersLong(String word) {
        return word.length() == 5;
    }

    private static boolean isStartingWithS(String word) {
        return word.toLowerCase().startsWith("s");
    }

    private static String removePeriodOrComma(String word) {
        return word.replace(".", "").replace(",", "");
    }
}
