package t23_Dziedziczenie.e2;

public class Online extends Course{
    private int courseDuration;
    private int courseVideoLength;

    public Online(int courseId, String courseName, String courseDescription, double coursePrice, int courseDuration, int courseVideoLength) {
        super(courseId, courseName, courseDescription, coursePrice);
        this.courseDuration = courseDuration;
        this.courseVideoLength = courseVideoLength;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public int getCourseVideoLength() {
        return courseVideoLength;
    }

    public void setCourseVideoLength(int courseVideoLength) {
        this.courseVideoLength = courseVideoLength;
    }
}
