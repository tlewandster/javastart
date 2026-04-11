package t11_Przeciążanie_metod_i_this.e1;

public class CalcTest {
    static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(1,2));
        System.out.println(calc.add(1,2,3));
        System.out.println(calc.subtract(1,2));
        System.out.println(calc.subtract(1,2,3));
    }
}
