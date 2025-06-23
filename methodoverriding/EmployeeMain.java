package methodoverriding;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("EMP-A-1022", "Nivedha", "QA Testing", "998877****", "nivedha@example.com", "nivedha@456", 12);
        Employee partTimeEmployee = new PartTimeEmployee("EMP-A-1021", "Harshini", "Tech Support", "892376****", "harshini@example.com", "harshini@789", 85000);

        fullTimeEmployee.printEmployeeDetails();
        partTimeEmployee.printEmployeeDetails();
    }
}

class Employee {
    private String employeeId;
    private String employeeName;
    private String department;
    private String contactNumber;
    private String emailAddress;
    private String loginPassword;
    private double totalSalary;

    public Employee(String employeeId, String employeeName, String department, String contactNumber, String emailAddress, String loginPassword, double totalSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.setLoginPassword(loginPassword);
        this.totalSalary = totalSalary;
    }

    public void printEmployeeDetails() {
        System.out.println(
            "Employee ID: " + this.employeeId +
            " | Name: " + this.employeeName +
            " | Contact: " + this.contactNumber +
            " | Department: " + this.department +
            " | Email: " + this.emailAddress +
            " | Salary: " + this.totalSalary
        );
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }
}

class PartTimeEmployee extends Employee {

    private static final int HOURLY_RATE = 380;

    public PartTimeEmployee(String employeeId, String employeeName, String department, String contactNumber, String emailAddress, String loginPassword, int hoursWorked) {
        super(employeeId, employeeName, department, contactNumber, emailAddress, loginPassword, HOURLY_RATE * hoursWorked);
    }

    @Override
    public void printEmployeeDetails() {
        super.printEmployeeDetails();
        System.out.println("Hourly Rate: " + HOURLY_RATE);
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String employeeId, String employeeName, String department, String contactNumber, String emailAddress, String loginPassword, double totalSalary) {
        super(employeeId, employeeName, department, contactNumber, emailAddress, loginPassword, totalSalary);
    }

    @Override
    public void printEmployeeDetails() {
        super.printEmployeeDetails();
    }
}
