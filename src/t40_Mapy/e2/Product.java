package t40_Mapy.e2;

import java.util.Objects;

public class Product implements Comparable<Product>{
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public int compareTo(Product o) {
        int nameComparison = name.compareTo(o.name);
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Double.compare(price, o.price);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2fzł", name, price);
    }
}
