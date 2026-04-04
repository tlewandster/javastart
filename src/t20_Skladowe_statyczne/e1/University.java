package t20_Skladowe_statyczne.e1;

public class University {
    static void main() {
        new Student("Tomasz", "Lewandowski", 123456);
        new Student("Jan", "Kowalski", 654321);
        System.out.println("Liczba wszystkich studentów: " + Student.getNumberOfStudents());
    }

}
