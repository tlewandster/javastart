package t42_Iteratory.e1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    static void main() {
        Map<String, Person> persons = new TreeMap<>();
        Person person1 = new Person("Tomasz", "Kowalski", 25);
        Person person2 = new Person("Jan", "Ryba", 40);
        Person person3 = new Person("Witold", "Grzyb", 120);
        Person person4 = new Person("Marek", "Pupa", 10);
        Person person5 = new Person("Klaudiusz", "Kmiocik", 6);
        persons.put(person1.getLastName(), person1);
        persons.put(person2.getLastName(), person2);
        persons.put(person3.getLastName(), person3);
        persons.put(person4.getLastName(), person4);
        persons.put(person5.getLastName(), person5);

        Iterator<Person> iterator = persons.values().iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }


    }
}
