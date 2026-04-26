package t42_Iteratory.e2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class WordsRemover {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj wyraz nr " + (i + 1));
            words.add(scanner.nextLine());
        }

        Iterator<String> iterator = words.iterator();
        System.out.println("Podaj tekst do odfiltrowania:");
        String filterWord = scanner.nextLine();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.toLowerCase().contains(filterWord.toLowerCase()))
                iterator.remove();
        }
        System.out.println(words);
    }
}