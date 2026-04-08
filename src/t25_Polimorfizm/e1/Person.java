package t25_Polimorfizm.e1;

class Person {

    private String firstName;
    private String lastName;
    private int salary;

    Person(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    int getSalary() {
        return salary;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    String getInfo() {
        return "Imię: " + firstName + ", Nazwisko: " + lastName + ", Pensja: " + salary;
    }

}
