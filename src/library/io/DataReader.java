package library.io;

import library.model.Book;
import library.model.Magazine;

import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);

    public void close() {
        sc.close();
    }

    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    public Book readAndCreateBook() {
        System.out.print("Tytuł: ");
        String title = sc.nextLine();
        System.out.print("Autor: ");
        String author = sc.nextLine();
        System.out.print("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.print("ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Rok wydania: ");
        int releaseDate = getInt();
        System.out.print("Ilość stron: ");
        int pages = getInt();

        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazine() {
        System.out.print("Tytuł: ");
        String title = sc.nextLine();
        System.out.print("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.print("Język: ");
        String language = sc.nextLine();
        System.out.print("Rok wydania: ");
        int year = getInt();
        System.out.print("Miesiąc: ");
        int month = getInt();
        System.out.print("Dzień: ");
        int day = getInt();

        return new Magazine(title, publisher, language, year, month, day);
    }
}