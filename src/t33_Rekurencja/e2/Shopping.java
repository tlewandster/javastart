package t33_Rekurencja.e2;

public class Shopping {
    static void main() {

        Cart cart = new Cart();

        cart.addProduct(new Product("Ogórki", 10.0));
        cart.addProduct(new Product("Kaszanka", 20.0));
        cart.totalCost();
    }
}
