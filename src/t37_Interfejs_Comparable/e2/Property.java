package t37_Interfejs_Comparable.e2;

public class Property implements Comparable<Property> {
    private final String city;
    private final double price;
    private final double meterage;
    private final double pricePerM2;

    public Property(String city, double price, double meterage) {
        this.city = city;
        this.price = price;
        this.meterage = meterage;
        this.pricePerM2 = price / meterage;
    }

    @Override
    public String toString() {
        return String.format("%s, %.2fzł, %.2fmkw, %.2fZł/mkw", city, price, meterage, pricePerM2);
    }

    @Override
    public int compareTo(Property other) {
        return Double.compare(pricePerM2, other.pricePerM2);
    }
}
