package t30_Typy_abstrakcyjne.e2;

public class AppPayment {
    static void main() {
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee("Tomasz", "Lewandowski", 5000);
        employees[1] = new PartTimeEmployee("Jan", "Kowalski", 10, 80);
        System.out.println(Employee.employeesSummary(employees));
        System.out.println(Employee.paymentSummary(employees));


    }
}
