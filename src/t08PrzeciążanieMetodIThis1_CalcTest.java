public class t08PrzeciążanieMetodIThis1_CalcTest {
    static void main(String[] args) {
        t08PrzeciążanieMetodIThis1_Calculator calc = new t08PrzeciążanieMetodIThis1_Calculator();
        System.out.println(calc.add(1,2));
        System.out.println(calc.add(1,2,3));
        System.out.println(calc.subtract(1,2));
        System.out.println(calc.subtract(1,2,3));
    }
}
