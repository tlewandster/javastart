package t26_Metody_klasy_object.e1;

public class DataStore {

    private final Computer[] computers;
    private int size = 0;

    public DataStore(int size) {
        computers = new Computer[size];
    }

    public void add(Computer computer) {
        computers[size++] = computer;
    }

    public String checkAvailability(Computer computer) {
        int identicalNum = 0;
        for (Computer comp : this.computers) {
            if (comp.equals(computer)) {identicalNum++;}
        }
        if (identicalNum >0) {
            return "W sklepie dostępne " + identicalNum + " szt. " + computer;
        } else {
            return "Brak takich komputerów w sklepie!";
        }
    }

    public String showAll() {
        if (size == 0) {
            return "Brak komputerów w sklepie!";
        }
        String result = "";
        for (Computer comp : this.computers) {
            result += comp.toString() + "\n";
        }
        return result;
    }
}
