package t30_Typy_abstrakcyjne.e2;

public class PartTimeEmployee extends Employee{

    int hoursNum;
    double hourlyRate;

    public PartTimeEmployee(String firstName, String lastName, int hoursNum, double hourlyRate) {
        super(firstName, lastName);
        this.hoursNum = hoursNum;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double montlyPayment() {
        return hoursNum * hourlyRate;
    }

    @Override
    public double annualPayment() {
        return montlyPayment() * 12;
    }
}
