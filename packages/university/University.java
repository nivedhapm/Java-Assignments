package packages.university;

import packages.university.students.Student;
import packages.university.courses.Course;
import packages.university.faculty.Faculty;

public class University {
    public static void main(String[] args) {
        // Create course
        Course course = new Course("Data Structures", "CS201", 4);

        // Create student enrolled in that course
        Student student = new Student("Lakshmi", "S123", course.getCourseName());

        // Create faculty teaching that subject
        Faculty faculty = new Faculty("Dr. Meena", "F456", "Data Structures");

        // Display details
        System.out.println("\n--- Course Details ---");
        course.displayCourseInfo();

        System.out.println("\n--- Student Details ---");
        student.displayStudentInfo();

        System.out.println("\n--- Faculty Details ---");
        faculty.displayFacultyInfo();
    }
}

