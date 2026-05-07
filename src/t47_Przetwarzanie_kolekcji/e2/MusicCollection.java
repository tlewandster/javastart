package t47_Przetwarzanie_kolekcji.e2;

import java.util.List;

class MusicCollection {
    public static void main(String[] args) {
        List<Song> songs = List.of(
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("No One", 248, "Alicia Keys", Song.Genre.POP),
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("Believer", 216, "Imagine Dragons", Song.Genre.ROCK),
                new Song("Fear of The Dark", 438, "Iron Maiden", Song.Genre.METAL),
                new Song("Enter Sandman", 346, "Metallica", Song.Genre.METAL),
                new Song("The Unforgiven", 348, "Metallica", Song.Genre.METAL),
                new Song("Girl on Fire", 404, "Alicia Keys", Song.Genre.POP)
        );

        System.out.println("Łączny czas piosenek popowych na playliście (w sekundach): " + totalLengthForGenre(songs, Song.Genre.POP));
        System.out.println(("Liczba piosenek Mettaliki na playliście: " + totalSongsForArtist(songs, "Metallica")));
        System.out.println("Piosenki bez POPu: ");
        printSongsExcludingGenre(songs, Song.Genre.POP);
    }

    private static int totalLengthForGenre(List<Song> songs, Song.Genre genre) {
        return songs.stream()
                .filter(song -> song.getGenre() == genre)
                .map(Song::getLength)
                .reduce(0, Integer::sum);
    }

    private static int totalSongsForArtist(List<Song> songs, String artist) {
        return (int) songs.stream()
                .filter(song -> song.getArtist().equals(artist))
                .count();
    }

    private static void printSongsExcludingGenre(List<Song> songs, Song.Genre genre) {
        songs.stream()
                .filter(song -> song.getGenre() != genre)
                .distinct()
                .forEach(System.out::println);
    }
}