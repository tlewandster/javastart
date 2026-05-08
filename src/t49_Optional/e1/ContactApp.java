package t49_Optional.e1;

import java.util.Optional;
import java.util.Scanner;

class ContactApp {
     static void main() {
        Optional<ContactManager> contactManager = ContactReader.readFile("src/t49_Optional/e1/contacts.csv");
        if (contactManager.isEmpty()) {
            System.out.println("Nie udało się wczytać pliku z kontaktami.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres email do wyszukania kontaktu:");
        String email = scanner.nextLine();
        Optional<Contact> contactByEmail = contactManager.get().findByEmail(email);
        contactByEmail.ifPresentOrElse(
                contact -> System.out.println(contact.getShortInfo()),
                () -> System.out.println("Nie znaleziono kontaktu o podanym adresie email."));
    }
}