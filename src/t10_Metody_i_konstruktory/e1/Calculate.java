package t10_Metody_i_konstruktory.e1;

public class Calculate {
    static void main(String[] args) {
        int x = 5;
        int y = 10;
        Calculator calc = new Calculator();
        System.out.println(calc.add(x, y));
        System.out.println(calc.subtract(x, y));
        System.out.println(calc.multiply(x, y));
        System.out.println(calc.divide(x, y));
    }
}
