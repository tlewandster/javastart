package t36_Operacje_na_tablicach.e1;

import java.util.Arrays;

public class PersonDatabase {
    Person[] persons = new Person[1];

    void add(Person p) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] == null) {
                persons[i] = p;
                System.out.println("Dodano osobę " + p);
                return;
            }
        }
        persons = Arrays.copyOf(persons, persons.length + 1);
        persons[persons.length - 1] = p;
        System.out.println("Dodano osobę " + p);
    }


    void remove(Person p) {
        if (p == null) throw new NullPointerException("Osoba jest typu null");
        int index = 0;
        for (Person person : persons) {
            if (person.equals(p)) {
                persons[index] = null;
                break;
            }
            index++;
        }
        moveNullLast();
    }

    private void moveNullLast() {
        int index = 0;
        for (Person person : persons) {
            if (person != null) {
                persons[index] = person;
                index++;
            }
        }
        for (int i = index; i < persons.length; i++) {
            persons[i] = null;
        }
    }

    int size() {
        int count = 0;
        for (Person p : persons) {
            if (p != null) count++;
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nLista osób (%d rekordy):\n", size()));
        for (Person p : persons) {
            if (p != null) {
                sb.append(p).append("\n");
            }
        }
        return sb.toString();
    }
}