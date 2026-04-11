package t11_Przeciążanie_metod_i_this.e1;

public class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return add(a,b) + c;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return subtract(a,b)-c;
    }
}
