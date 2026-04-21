package t32_Operacje_na_plikach.e1;

class Employee extends Person {

    private final int salary;

    Employee(String firstName, String lastName, int salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + ", zarobki: " + salary;
    }
}
