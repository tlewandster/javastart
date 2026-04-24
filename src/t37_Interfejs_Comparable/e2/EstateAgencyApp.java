package t37_Interfejs_Comparable.e2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class EstateAgencyApp {

    private static final int MAX_PROPERTIES = 10;
    private static final String delimiter = ";";
    static Property[] properties = new Property[MAX_PROPERTIES];
    static String fileName = "properties.csv";
    private static boolean hasHeader = true;

    static void main() {
        readProperties(fileName);
        sortProperties();
        System.out.println("Dostępne nieruchomości: ");
        printProperties();
    }

    private static void readProperties(String fileName) {
        try (
                BufferedReader in = new BufferedReader(new FileReader(fileName))
        ) {
            int i = 0;
            String line;
            while ((line = in.readLine()) != null) {
                if (hasHeader) {
                    hasHeader = false;
                    continue;
                }
                String[] split = line.split(delimiter);
                Property property = new Property(split[0], Double.parseDouble(split[1]), Double.parseDouble(split[2]));
                properties[i++] = property;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void sortProperties() {
        Arrays.sort(properties);
    }

    private static void printProperties() {
        for (Property property : properties) {
            System.out.println(property);
        }
    }

}
