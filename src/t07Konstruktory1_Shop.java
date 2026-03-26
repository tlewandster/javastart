public class t07Konstruktory1_Shop {
    public static void main(String[] args) {
        t07Konstruktory1_Product product1 = new t07Konstruktory1_Product("Czekolada mleczna", "Milka");
        t07Konstruktory1_Offer offer1 = new t07Konstruktory1_Offer(product1,3.99,true);
        offer1.printOffer();
    }
}
