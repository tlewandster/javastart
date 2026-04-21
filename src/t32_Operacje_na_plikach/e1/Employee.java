package t32_Operacje_na_plikach.e1;

import java.io.Serializable;

class Employee extends Person implements Serializable {

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
