package t33_Rekurencja.e1;

public class Factorial {
    static void main() {
        int n = 5;
        System.out.printf("Silnia liczby %d to %d", n, factorial(n));
    }

    static long factorial(int n) {
        return n == 0 ? 1 : n * factorial(n - 1);
    }
}
