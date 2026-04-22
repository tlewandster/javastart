package t33_Rekurencja.e2;

public class Cart {
    final Product[] products = new Product[10];
    int index = 0;

    public void addProduct(Product product) {
        if (index == products.length) {
            System.out.println("Koszyk jest pełny, nie można dodać produktu.");
        } else if (products[index] == null) {
            products[index++] = product;
            System.out.printf("Produkt %s został dodany do koszyka.\n", product.getName());
        } else {
            addProduct(product);
        }
    }

    public void totalCost() {
        double total = 0.0;
        for (Product product : products) {
            if (product != null) {
                total += product.getPrice();
            }
        }
        System.out.printf("Całkowita wartość koszyka: %.2f\n", total);
    }
}
