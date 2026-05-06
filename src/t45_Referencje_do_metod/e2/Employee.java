package t45_Referencje_do_metod.e2;

class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private Employment employment;

    public Employee(String firstName, String lastName, double salary, Employment employment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.employment = employment;
    }

    public boolean isFullTime() {
        return employment == Employment.FULL_TIME;
    }

   public String getFullName() {
        return firstName + " " + lastName;
   }

    public void applyBonus() {
        this.salary *= 1.1;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", employment=" + employment +
                '}';
    }
}