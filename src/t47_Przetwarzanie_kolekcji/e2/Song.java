package t47_Przetwarzanie_kolekcji.e2;

import java.util.Objects;

class Song {
    private String title;
    private int length; //sec
    private String artist;
    private Genre genre;

    public Song(String title, int length, String artist, Genre genre) {
        this.title = title;
        this.length = length;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    enum Genre {
        METAL,
        POP,
        ROCK,
        DANCE
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return getLength() == song.getLength() && Objects.equals(getTitle(), song.getTitle()) && Objects.equals(getArtist(), song.getArtist()) && getGenre() == song.getGenre();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getLength(), getArtist(), getGenre());
    }

    @Override
    public String toString() {
        return this.title + " - " + this.artist + " " + this.length + "sec, " + this.genre;
    }
}