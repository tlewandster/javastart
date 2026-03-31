package t15_Enkapulacja.e1;

class DiscountApp {
    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();

        Client client1 = new Client("Jan", "Kowalski", true);
        double price1 = 1100;

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100;

        double priceDiscount1 = discountService.calculateDiscountPrice(client1, price1);
        double priceDiscount2 = discountService.calculateDiscountPrice(client2, price2);

        discountService.printDiscountInfo(client1, price1, priceDiscount1);
        discountService.printDiscountInfo(client2, price2, priceDiscount2);
    }
}