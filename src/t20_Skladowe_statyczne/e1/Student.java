package t20_Skladowe_statyczne.e1;

public class Student {
    private String firstName;
    private String lastName;
    private int studentIndexNumber;
    private static int numberOfStudents;

    public Student(String firstName, String lastName, int studentIndexNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentIndexNumber = studentIndexNumber;
        numberOfStudents++;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static void setNumberOfStudents(int numberOfStudents) {
        Student.numberOfStudents = numberOfStudents;
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

    public int getStudentIndexNumber() {
        return studentIndexNumber;
    }

    public void setStudentIndexNumber(int studentIndexNumber) {
        this.studentIndexNumber = studentIndexNumber;
    }
}
