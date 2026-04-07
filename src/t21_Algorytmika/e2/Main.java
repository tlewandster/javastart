package t21_Algorytmika.e2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int index = 0;
        int multi = 1;
        int next = 0;
        Scanner scanner = new Scanner(System.in);
        while (index < 5) {
            next = scanner.nextInt();
            multi *= next;
            System.out.println(multi);
            index++;
        }
        System.out.println(multi >= 0 ? "nieujemna" : "ujemna");

    }
}
