package t34_Typy_opakowujace.e1;

import java.io.FileReader;
import java.math.BigInteger;

public class TxtToNumber {
    static void main() {
        String[] numbers= new String[0];
        String fileName = "numbers.txt";
        try (FileReader reader = new FileReader(fileName)) {
            numbers = reader.readAllLines().toArray(new String[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int firstSum = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]) + Integer.parseInt(numbers[2]);
        System.out.println(firstSum);
        BigInteger secondSum = new BigInteger(numbers[3]).add(new BigInteger(numbers[4]));
        System.out.println(secondSum);
    }
}
