public class t07Konstruktory1_Offer {

    t07Konstruktory1_Product product;
    double price;
    boolean special;

    t07Konstruktory1_Offer(t07Konstruktory1_Product product, double price, boolean special) {
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
