package t35_Typy_generyczne.e1;

public class TestPair {
    static void main() {
        Pair<String, Integer> pair = new Pair<>("Tomasz", 25);
        System.out.println(pair.toString());
    }
}
