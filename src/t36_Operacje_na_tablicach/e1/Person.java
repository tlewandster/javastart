package t36_Operacje_na_tablicach.e1;

public class Person {
    private String firstName;
    private String lastName;
    private final String PESEL;

    public Person(String firstName, String lastName, String PESEL) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.PESEL = PESEL;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPESEL() {
        return PESEL;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;

        return getFirstName().equals(person.getFirstName()) && getLastName().equals(person.getLastName()) && getPESEL().equals(person.getPESEL());
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " PESEL " + PESEL;
    }
}
