package t23_Dziedziczenie.e2;

public class Stationary extends Course{

    private String locality;
    private int lessonNumber;

    public Stationary(int courseId, String courseName, String courseDescription, double coursePrice, String locality, int lessonNumber) {
        super(courseId, courseName, courseDescription, coursePrice);
        this.locality = locality;
        this.lessonNumber = lessonNumber;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public int getLessonNumber() {
        return lessonNumber;
    }

    public void setLessonNumber(int lessonNumber) {
        this.lessonNumber = lessonNumber;
    }
}
