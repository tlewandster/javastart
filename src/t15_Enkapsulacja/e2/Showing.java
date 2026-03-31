package t15_Enkapsulacja.e2;

public class Showing {

    private final String movieTitle;
    private final int ageRequired;
    private final int maxSeats;
    private int freeSeats;

    public Showing(String movieTitle, int ageRequired, int maxSeats, int freeSeats) {
        this.movieTitle = movieTitle;
        this.ageRequired = ageRequired;
        this.maxSeats = maxSeats;
        this.freeSeats = freeSeats;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public int getAgeRequired() {
        return ageRequired;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    void bookSeat() {
        freeSeats--;
    }
    public void info() {
        System.out.println("Liczba pozostałych miejsc: " + freeSeats);
        System.out.println("Liczba sprzedanych biletów: " + (maxSeats - freeSeats));
    }
}
