package t28_Klasa_String.e1;

import java.util.Scanner;

public class Main {
    public static void main() {
        StringBuilder newWord = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int wordsNumber = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < wordsNumber; i++) {
            String word = sc.nextLine();
            newWord.append(word.charAt(word.length()-1));
        }

        System.out.println(newWord);
    }
}
