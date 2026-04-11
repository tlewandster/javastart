package t10_Metody_i_konstruktory.e3;

public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product("Czekolada mleczna", "Milka");
        Offer offer1 = new Offer(product1,3.99,true);
        offer1.printOffer();
    }
}
