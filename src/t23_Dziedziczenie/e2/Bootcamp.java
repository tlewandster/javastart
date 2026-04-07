package t23_Dziedziczenie.e2;

public class Bootcamp extends Course {
    private String instructorFirstName;
    private String instructorLastName;
    private int consultationDuration;

    public Bootcamp(int courseId, String courseName, String courseDescription, double coursePrice, String instructorFirstName, String instructorLastName, int consultationDuration) {
        super(courseId, courseName, courseDescription, coursePrice);
        this.instructorFirstName = instructorFirstName;
        this.instructorLastName = instructorLastName;
        this.consultationDuration = consultationDuration;
    }

    public String getInstructorFirstName() {
        return instructorFirstName;
    }

    public void setInstructorFirstName(String instructorFirstName) {
        this.instructorFirstName = instructorFirstName;
    }

    public String getInstructorLastName() {
        return instructorLastName;
    }

    public void setInstructorLastName(String instructorLastName) {
        this.instructorLastName = instructorLastName;
    }

    public int getConsultationDuration() {
        return consultationDuration;
    }

    public void setConsultationDuration(int consultationDuration) {
        this.consultationDuration = consultationDuration;
    }
}
