public class t06AgregacjaIKompozycja1 {
    static void main(String[] args) {
        Address address1 = new Address();
        address1.street = "Deszczowa";
        address1.houseNumber = 10;
        address1.flatNumber = 1;
        address1.city = "Wąchock";
        address1.postCode = "00-001";

        Address address2 = new Address();
        address2.street = "Chmurna";
        address2.houseNumber = 100;
        address2.flatNumber = 10;
        address2.city = "Dupowo Wielkie";
        address2.postCode = "00-901";

        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "90897812362";
        person1.residentialAddress = address1;
        person1.permanentAddress = person1.residentialAddress;

        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;

        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 2000;
        credit1.interestRate = 0.05;
        credit1.termMonths = 12;

        Person person2 = new Person();
        person2.firstName = "Janina";
        person2.lastName = "Kowalska";
        person2.pesel = "91897812362";
        person2.residentialAddress = address1;
        person2.permanentAddress = address2;

        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 100_000;

        Credit credit2 = new Credit();
        credit2.borrower = person2;
        credit2.cashBorrowed = 2000;
        credit2.interestRate = 0.05;
        credit2.termMonths = 12;

        System.out.println("Osoba 1:");
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
        System.out.println("mieszka pod adresem " + person1.residentialAddress.street + " " + person1.residentialAddress.houseNumber + "/" + person1.residentialAddress.flatNumber + " " + person1.residentialAddress.postCode + " " + person1.residentialAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);

        System.out.println("Osoba 2:");
        System.out.println(person2.firstName + " " + person2.lastName + " " + person2.pesel);
        System.out.println("mieszka pod adresem " + person2.residentialAddress.street + " " + person2.residentialAddress.houseNumber + "/" + person2.residentialAddress.flatNumber + " " + person2.residentialAddress.postCode + " " + person2.residentialAddress.city);
        System.out.println("posiada konto bankowe z kwotą: " + account2.balance);
        System.out.println("oraz kredyt na kwotę: " + credit2.cashBorrowed);
    }

    static class Person {
        String firstName;
        String lastName;
        String pesel;
        Address residentialAddress;
        Address permanentAddress;
    }

    static class BankAccount {
        Person owner;
        double balance;
    }

    static class Credit {
        Person borrower;
        double cashBorrowed;
        double cashReturned;
        double interestRate;
        int termMonths;
    }

    static class Address {
        String street;
        int houseNumber;
        int flatNumber;
        String city;
        String postCode;
    }
}
