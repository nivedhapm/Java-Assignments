package abstractclassandmethods;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeView {
    private static ArrayList<BaseEmployee> teamList = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Employee Records =====");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Hourly Employee");
            System.out.println("3. Display Employee List");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int option = input.nextInt();

            switch (option) {
                case 1 -> addFullTimeEmployee();
                case 2 -> addHourlyEmployee();
                case 3 -> showEmployees();
                case 4 -> {
                    System.out.println("Exiting Employee View.");
                    input.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addFullTimeEmployee() {
        System.out.print("Employee ID: ");
        String id = input.next();
        System.out.print("Name: ");
        String name = input.next();
        System.out.print("Team: ");
        String team = input.next();
        System.out.print("Contact Number: ");
        String phone = input.next();
        System.out.print("Email: ");
        String email = input.next();
        System.out.print("Fixed Salary: ");
        double fixedSalary = input.nextDouble();

        BaseEmployee emp = new FullTimeEmployee(id, name, team, phone, email, fixedSalary);
        teamList.add(emp);
        System.out.println("Full-Time Employee added.");
    }

    private static void addHourlyEmployee() {
        System.out.print("Employee ID: ");
        String id = input.next();
        System.out.print("Name: ");
        String name = input.next();
        System.out.print("Team: ");
        String team = input.next();
        System.out.print("Contact Number: ");
        String phone = input.next();
        System.out.print("Email: ");
        String email = input.next();
        System.out.print("Worked Hours: ");
        int hours = input.nextInt();

        BaseEmployee emp = new ContractEmployee(id, name, team, phone, email, hours);
        teamList.add(emp);
        System.out.println("Contract Employee added.");
    }

    private static void showEmployees() {
        if (teamList.isEmpty()) {
            System.out.println("No employee records found.");
            return;
        }

        System.out.println("\n===== Employee Summary =====");
        for (BaseEmployee emp : teamList) {
            emp.printDetails();
            System.out.println("Total Pay: ₹" + emp.calculatePay());
            System.out.println("----------------------------");
        }
    }
}

// Abstract Class
abstract class BaseEmployee {
    private String empId;
    private String empName;
    private String teamName;
    private String contact;
    private String email;
    protected double baseSalary;

    public BaseEmployee(String empId, String empName, String teamName, String contact, String email, double baseSalary) {
        this.empId = empId;
        this.empName = empName;
        this.teamName = teamName;
        this.contact = contact;
        this.email = email;
        this.baseSalary = baseSalary;
    }

    public void printDetails() {
        System.out.println("ID: " + empId + " | Name: " + empName + " | Team: " + teamName +
                " | Phone: " + contact + " | Email: " + email + " | Base Salary: ₹" + baseSalary);
    }

    public abstract double calculatePay();
}

class ContractEmployee extends BaseEmployee {
    private static final int RATE_PER_HOUR = 400;
    private int hoursWorked;

    public ContractEmployee(String empId, String empName, String teamName, String contact, String email, int hoursWorked) {
        super(empId, empName, teamName, contact, email, RATE_PER_HOUR * hoursWorked);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Worked Hours: " + hoursWorked + " | Hourly Rate: ₹" + RATE_PER_HOUR);
    }

    @Override
    public double calculatePay() {
        return hoursWorked * RATE_PER_HOUR;
    }
}

class FullTimeEmployee extends BaseEmployee {
    public FullTimeEmployee(String empId, String empName, String teamName, String contact, String email, double fixedSalary) {
        super(empId, empName, teamName, contact, email, fixedSalary);
    }

    @Override
    public double calculatePay() {
        return baseSalary;
    }
}
