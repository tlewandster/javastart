public class t07Metody1_Claculate {
    static void main(String[] args) {
        int x = 5;
        int y = 10;
        t07Metody1_Claculator calc = new t07Metody1_Claculator();
        System.out.println(calc.add(x, y));
        System.out.println(calc.substract(x, y));
        System.out.println(calc.multiply(x, y));
        System.out.println(calc.divide(x, y));
    }
}
