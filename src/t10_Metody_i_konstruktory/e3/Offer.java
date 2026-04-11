package t10_Metody_i_konstruktory.e3;

public class Offer {

    Product product;
    double price;
    boolean special;

    Offer(Product product, double price, boolean special) {
        this.product = product;
        this.price = price;
        this.special = special;
    }

    void printOffer() {
        System.out.println(this.product.name + " "
                + this.product.producer + " "
                + this.price + "zł, "
                + "oferta specjalna? " + this.special);
    }
}
