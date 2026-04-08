package t25_Polimorfizm.e1;

class Hospital {
    private final Person[] persons;
    private int personsNumber;

    Hospital() {
        persons = new Person[5];
        personsNumber = 0;
    }

    void add(Person person) {
        if (personsNumber < persons.length) {
            persons[personsNumber] = person;
            personsNumber++;
        } else {
            System.out.println("Brak wolnego wakatu");
        }
    }

    void getInfo() {
        System.out.println("Pracownicy szpitala: ");
        for (Person person : persons) {
            if (person != null) {
                System.out.println(person.getInfo());
            }
        }
    }
}
