package t15_Enkapsulacja.e2;

class CinemaSystem {
    static void main() {

        Showing showing = new Showing("Omen", 16, 72, 72);

        Person person1 = new Person("Jan", "Kowalski", 15);
        Ticket ticket1 = Ticket.sell(showing, person1);

        Person person2 = new Person("Anna", "Zalewska", 19);
        Ticket ticket2 = Ticket.sell(showing, person2);

        Ticket.sold(ticket1,ticket2);
        showing.info();
    }
}
