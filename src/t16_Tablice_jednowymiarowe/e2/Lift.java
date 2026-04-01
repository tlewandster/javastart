package t16_Tablice_jednowymiarowe.e2;

import java.util.Arrays;

public class Lift {
    private final Person[] people = new Person[4];

    public void add(Person person) {
        if (people[0] == null) {
            people[0] = person;
            System.out.println("Wsiadła osoba");
        } else if (people[1] == null) {
            people[1] = person;
            System.out.println("Wsiadła osoba");
        } else if (people[2] == null) {
            people[2] = person;
            System.out.println("Wsiadła osoba");
        } else if (people[3] == null) {
            people[3] = person;
            System.out.println("Wsiadła osoba");
        } else System.out.println("W windzie nie ma już miejsca!");

    }

    public void remove(Person person) {
        if (people[0] == person) {
            people[0] = null;
            System.out.println("Wysiadła osoba");
        } else if (people[1] == person) {
            people[1] = null;
            System.out.println("Wysiadła osoba");
        } else if (people[2] == person) {
            people[2] = null;
            System.out.println("Wysiadła osoba");
        } else if (people[3] == person) {
            people[3] = null;
            System.out.println("Wysiadła osoba");
        } else System.out.println("W windzie nie ma osoby o takim ID!");
        if (Arrays.equals(people, new Person[]{null, null, null, null})) System.out.println("Winda jest pusta!");

    }

    public void start() {
        int sumWeight = 0;
        if (people[0] != null) {
            sumWeight += people[0].weight;
        }
        if (people[1] != null) {
            sumWeight += people[1].weight;
        }
        if (people[2] != null) {
            sumWeight += people[2].weight;
        }
        if (people[3] != null) {
            sumWeight += people[3].weight;
        }
        if (sumWeight > 300) System.out.println("Winda jest przeciążona o " + (sumWeight - 300) + " kg!");
        else System.out.println("Winda ruszyła z obciążeniem " + sumWeight + " kg!");

    }


}

