package t28_Klasa_String.e2;

import java.util.Scanner;

public class RollOfTheDice {
    static void main() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nWciśnij ENTER, aby rzucić kostką");
            sc.nextLine();
            showResult(rollDice());
        }
    }

    private static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    private static void showResult(int diceRoll) {
        String edge = " - - - - ";
        String diceFace = "";
        switch (diceRoll) {
            case 1 -> diceFace = """
                    %s
                    |       |
                    |   0   |
                    |       |
                    %s
                    """;
            case 2 -> diceFace = """
                    %s
                    | 0     |
                    |       |
                    |     0 |
                    %s
                    """;
            case 3 -> diceFace = """
                    %s
                    | 0     |
                    |   0   |
                    |     0 |
                    %s
                    """;
            case 4 -> diceFace = """
                    %s
                    | 0   0 |
                    |       |
                    | 0   0 |
                    %s
                    """;
            case 5 -> diceFace = """
                    %s
                    | 0   0 |
                    |   0   |
                    | 0   0 |
                    %s
                    """;
            case 6 -> diceFace = """
                    %s
                    | 0   0 |
                    | 0   0 |
                    | 0   0 |
                    %s
                    """;
        }
        System.out.printf(diceFace, edge, edge);
    }

}
