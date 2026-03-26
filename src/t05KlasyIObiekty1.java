public class t05KlasyIObiekty1 {
    static void main(String[] args) {
        Employee person1 = new Employee();
        person1.firstName = "Tolek";
        person1.lastName = "Banan";
        person1.yearOfBirth = 1970;
        person1.seniority = 36;

        Employee person2 = new Employee();
        person2.firstName = "Todek";
        person2.lastName = "Klops";
        person2.yearOfBirth = 1980;
        person2.seniority = 26;

        Employee person3 = new Employee();
        person3.firstName = "Jaś";
        person3.lastName = "Kunefał";
        person3.yearOfBirth = 1980;
        person3.seniority = 16;

        for (Employee person : new Employee[]{person1, person2, person3}) {
            System.out.println(person.firstName + " " + person.lastName + ", urodzony w " + person.yearOfBirth + " roku, " + person.seniority + " lat stażu pracy.");
        }

    }

    static class Employee {
        String firstName;
        String lastName;
        short yearOfBirth;
        byte seniority;
    }
}
