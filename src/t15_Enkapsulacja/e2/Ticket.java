package t15_Enkapsulacja.e2;

public class Ticket {
    static int nextId = 0;
    private final int id;
    private final String personData;
    private final String movieTitle;

    public Ticket(int id, String personData, String movieTitle) {
        this.id = id;
        this.personData = personData;
        this.movieTitle = movieTitle;
    }

    public static Ticket sell(Showing showing, Person person) {
        if (showing.getFreeSeats() == 0) {
            System.out.println("Brak wolnych miejsc na seans");
            return null;
        } else if (person.age() < showing.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + showing.getAgeRequired() + " lat");
            return null;
        } else {
            String personData = person.firstName() + " " + person.lastName();
            String movieTitle = showing.getMovieTitle();
            showing.bookSeat();
            return new Ticket(++nextId, personData, movieTitle);
        }
    }

    public static void sold(Ticket ticket1, Ticket ticket2) {
        if (nextId != 0) System.out.println("Sprzedane bilety:");
        ticketInfo(ticket1);
        ticketInfo(ticket2);
    }

    private static void ticketInfo(Ticket ticket) {
        if (ticket != null) {
            System.out.println(ticket.id + " | " + ticket.personData + " | " + ticket.movieTitle);
        }
    }
}
