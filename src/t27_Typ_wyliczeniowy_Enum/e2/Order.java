package t27_Typ_wyliczeniowy_Enum.e2;

public class Order {
    private final String product;
    private final double price;
    private final Status status;

    public Order(String product, double price, Status status) {
        this.product = product;
        this.price = price;
        this.status = status;
    }

    @Override
    public String toString() {
        return product + " (" + price + " zł) - " + status.getDescription();
    }

    public Status getStatus() {
        return status;
    }

}
