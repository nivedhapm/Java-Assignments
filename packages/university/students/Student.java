package packages.university.students;

public class Student {
    private String name;
    private String studentId;
    private String courseEnrolled;

    public Student(String name, String studentId, String courseEnrolled) {
        this.name = name;
        this.studentId = studentId;
        this.courseEnrolled = courseEnrolled;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("ID: " + studentId);
        System.out.println("Enrolled Course: " + courseEnrolled);
    }
}
