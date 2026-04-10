package t26_Metody_klasy_object.e1;

public class NotebookShop {
    static void main() {
        DataStore dataStore = new DataStore(5);
        dataStore.add(new Computer("Lenovo", 5));
        dataStore.add(new Computer("Dell", 7));
        dataStore.add(new Computer("Lenovo", 11));
        dataStore.add(new Computer("Acer", 7));
        dataStore.add(new Computer("Lenovo", 5));

        System.out.println(dataStore.checkAvailability(new Computer("Lenovo", 5)));
        System.out.println(dataStore.showAll());
    }
}
