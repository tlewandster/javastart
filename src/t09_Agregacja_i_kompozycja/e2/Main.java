package t09_Agregacja_i_kompozycja.e2;

public class Main {

    static void main(String[] args) {
        Auction auction1 = new Auction();
        auction1.title = "XBOX One";
        auction1.description = "Konsola dla wymagających graczy";
        auction1.price = 999.99;

        auction1.seller = new Seller();
        auction1.seller.firstName = "Jan";
        auction1.seller.lastName = "Kowalski";

        auction1.seller.address = new Address();
        auction1.seller.address.city = "Wrocław";
        auction1.seller.address.postalCode = "50-500";
        auction1.seller.address.street = "Kościuszki";
        auction1.seller.address.homeNo = "24A";
        auction1.seller.address.flatNo = 21;

        Auction auction2 = new Auction();
        auction2.title = "Samsung S20";
        auction2.description = "Niesamowity telefon z trzema obiektywami";
        auction2.price = 3999.0;

        auction2.seller = new Seller();
        auction2.seller.firstName = "Justyna";
        auction2.seller.lastName = "Adamczyk";
        auction2.seller.address = new Address();

        System.out.println("Aukcja 1:");
        System.out.println("Sprzedający: " + auction1.seller.firstName + " " + auction1.seller.lastName);
        System.out.println("Przedmiot: " + auction1.title + " - " + auction1.description);
        System.out.println("Cena: " + auction1.price + " PLN");

        System.out.println();

        System.out.println("Aukcja 2:");
        System.out.println("Sprzedający: " + auction2.seller.firstName + " " + auction2.seller.lastName);
        System.out.println("Przedmiot: " + auction2.title + " - " + auction2.description);
        System.out.println("Cena: " + auction2.price + " PLN");
    }

    static class Address {
        String city;
        String postalCode;
        String street;
        String homeNo;
        int flatNo;
    }

    static class Seller {
        String firstName;
        String lastName;
        Address address;
    }

    static class Auction {
        String title;
        String description;
        double price;
        Seller seller;
    }
}