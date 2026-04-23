package t36_Operacje_na_tablicach.e2;

import java.util.Arrays;
import java.util.Scanner;

class CompareTwoStrings {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String result = "";
        System.out.println("Podaj dwie linie tekstu: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();

        if (!compare(s1, s2)) result = "nie";
        System.out.printf("Napisy %s składają się z tych samych liter", result);
    }

    static boolean compare(String s1, String s2) {
        s1 = sortString(s1);
        s2 = sortString(s2);
        return s1.trim().equalsIgnoreCase(s2.trim());
    }

    private static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
