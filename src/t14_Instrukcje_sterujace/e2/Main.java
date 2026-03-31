package t14_Instrukcje_sterujace.e2;

public class Main {
    static void main() {
        int rnd = (int) (Math.random() * 10_000);
        System.out.println("Wylosowana liczba: " + rnd);

        if (rnd < 5_000) {
            System.out.println(rnd + " jest mniejsza niż 5000");
        } else if (rnd > 5_000) {
            System.out.println(rnd + " jest większa niż 5000");
        } else {
            System.out.println(rnd + " jest równa 5000");
        }
        if (rnd % 2 == 0) {
            System.out.println(rnd + " jest parzysta");
        } else {
            System.out.println(rnd + " jest nieparzysta");
        }

        System.out.println("Uzupełniona do 4 cyfr: " + test(rnd));
    }

    static int test(int number) {
         if (number == 0) return 0;
         else if (number < 10) return number * 1_000;
         else if (number < 100) return number * 1_00;
         else if (number < 1000) return number * 1_0;
         else return number;
    }

}
