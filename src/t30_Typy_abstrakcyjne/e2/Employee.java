package t30_Typy_abstrakcyjne.e2;

public abstract class Employee {
    String firstName;
    String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract double montlyPayment();

    public abstract double annualPayment();

    @Override
    public String toString() {
        return String.format("%s %s, wypłata miesięczna %.2f, wypłata roczna %.2f", firstName, lastName, montlyPayment(), annualPayment());
    }

    public static String employeesSummary(Employee[] employees) {
        StringBuilder summary = new StringBuilder();
        for (Employee employee : employees) {
            summary.append(employee).append("\n");
        }
        return summary.toString();
    }

    public static String paymentSummary(Employee[] employees) {
        double montlyPaymentSum = 0;
        double annualPaymentSum = 0;
        StringBuilder summary = new StringBuilder();
        for (Employee employee : employees) {
            montlyPaymentSum += employee.montlyPayment();
            annualPaymentSum += employee.annualPayment();
        }

        summary.append("Suma miesięcznych wynagrodzeń: ").append(montlyPaymentSum).append("\n");
        summary.append("Suma rocznych wynagrodzeń: ").append(annualPaymentSum).append("\n");

        return summary.toString();
    }
}
