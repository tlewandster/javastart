package t39_Zbiory.e1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Names {
    private static final Path fileName = Path.of("src/t39_Zbiory.e1/namespl.txt");

    static void main() {
        TreeSet<String> names = getNamesFromFile();
        printSum(names);
        printFirstAndLast(names);
    }

    private static void printFirstAndLast(TreeSet<String> set) {
        System.out.printf("Pierwsze i ostatnie imię to %s i %s%n", set.first(), set.last());
    }

    private static void printSum(TreeSet<String> names) {
        System.out.printf("Liczba unikalnych imion: %d%n", names.size());
    }

    private static TreeSet<String> getNamesFromFile() {
        List<String> lines;
        try {
            lines = Files.readAllLines(fileName);
        } catch (IOException e) {
            throw new RuntimeException("Nie można odczytać pliku " + fileName);
        }
        TreeSet<String> set = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                return -s1.compareTo(s2);
            }
        });
        set.addAll(lines);
        return set;
    }
}
