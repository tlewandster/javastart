package t15_Enkapsulacja.e1;

class DiscountService {
    public double calculateDiscountPrice(Client client, double price) {
        if(client.premium())
            return calculatePremiumDiscount(price);
        else
            return calculateStandardDiscount(price);
    }

    private double calculateStandardDiscount(double price) {
        if(price > 1000)
            return applyDiscount(price, 0.1);
        else
            return price;
    }

    private double calculatePremiumDiscount(double price) {
        if(price > 1000)
            return applyDiscount(price, 0.15);
        else
            return applyDiscount(price, 0.05);
    }

    private double applyDiscount(double price, double discount) {
        return price * (1 - discount);
    }

    void printDiscountInfo(Client client, double price, double priceDiscount) {
        System.out.println(clientWelcome(client));
        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Do zapłaty (po rabacie): " + priceDiscount);
    }

    private String clientWelcome(Client client) {
        if (client.hasFirstName() && client.hasLastName()) {
            return "Witaj " + client.firstName() + " " + client.lastName();
        } else if (client.hasFirstName()) {
            return "Witaj " + client.firstName();
        } else if (client.hasLastName()) {
            return "Witaj pani/panie " + client.lastName();
        } else {
            return "Witaj nieznajomy";
        }
    }
}