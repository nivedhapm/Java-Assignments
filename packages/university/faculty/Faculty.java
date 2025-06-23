package packages.university.faculty;

public class Faculty {
    private String name;
    private String facultyId;
    private String subject;

    public Faculty(String name, String facultyId, String subject) {
        this.name = name;
        this.facultyId = facultyId;
        this.subject = subject;
    }

    public void displayFacultyInfo() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Faculty ID: " + facultyId);
        System.out.println("Subject: " + subject);
    }
}
