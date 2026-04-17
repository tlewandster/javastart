package t30_Typy_abstrakcyjne.e2;

public class FullTimeEmployee extends Employee{
    double salary;

    public FullTimeEmployee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double montlyPayment() {
        return salary;
    }

    @Override
    public double annualPayment() {
        int annualBonus = 5;
        return salary * 12 * (1 + (double) annualBonus / 100);
    }

}
