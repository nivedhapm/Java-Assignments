package packages.university.courses;

public class Course {
    private String courseName;
    private String courseCode;
    private int credits;

    public Course(String courseName, String courseCode, int credits) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Code: " + courseCode);
        System.out.println("Credits: " + credits);
    }

    public String getCourseName() {
        return courseName;
    }
}

