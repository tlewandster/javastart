package t40_Mapy.e2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductsApp {
    private static final Map<String, TreeSet<Product>> products = new HashMap<>();

    static void main() {
        readFile();
        String userCategory = getCategory();
        showCategory(userCategory);
    }

    private static void showCategory(String userCategory) {
        TreeSet<Product> categorySet = products.get(userCategory);
        if (categorySet == null) {
            System.out.println("Brak produktów z kategorii " + userCategory);
        } else {
            double sumPrice = 0;
            for (Product product : categorySet) {
                System.out.println(product);
                sumPrice += product.price;
            }
            double averagePrice = sumPrice / categorySet.size();
            System.out.printf("Srednia cena w kategorii: %.2fzł%n", averagePrice);
            System.out.println("Najtańszy produkt: " + categorySet.first());
            System.out.println("Najdroższy produkt: " + categorySet.last());
        }
    }

    private static String getCategory() {
        System.out.println("Podaj nazwę kategorii dla wyświetlenia statystyk:");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static void readFile() {
        File file = new File("src/t40_Mapy/e2/products.csv");
        try (Scanner sc = new Scanner(file)) {
            sc.nextLine();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] fields = line.split(";");
                String category = fields[0];
                String productName = fields[1];
                double productPrice = Double.parseDouble(fields[2]);
                Product product = new Product(productName, productPrice);
                addProductToMap(category, product);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Pliku nie znaleziono");
        }
    }

    private static void addProductToMap(String category, Product
            product) {
        if (ProductsApp.products.containsKey(category))
            ProductsApp.products.get(category).add(product);
        else {
            TreeSet<Product> categorySet = new TreeSet<>();
            categorySet.add(product);
            ProductsApp.products.put(category, categorySet);
        }
    }
}
