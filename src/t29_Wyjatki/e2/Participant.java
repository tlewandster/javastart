package t29_Wyjatki.e2;

class Participant {
    private String firstName;
    private String lastName;
    private final String documentId; //np. pesel
    private final int age;

    public Participant(String firstName, String lastName, String documentId, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentId = documentId;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", id: " + documentId + ", age: " + age;
    }
}
