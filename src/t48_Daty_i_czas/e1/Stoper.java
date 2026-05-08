package t48_Daty_i_czas.e1;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Stoper {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wciśnij ENTER by włączyć stoper");
        sc.nextLine();
        Instant start = Instant.now();

        System.out.println("Wciśnij ENTER by zatrzymać stoper");
        sc.nextLine();
        Instant end = Instant.now();

        long duration = Duration.between(start, end).toMillis();
        System.out.println("Czas : " + duration + " ms");
    }
}
