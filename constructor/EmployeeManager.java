package constructor;

import classesAndObjects.Employee;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class EmployeeManager {
    private static int totalEmployees;
    private static List<Employee> employees = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Total Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scan.nextInt();
            scan.nextLine();
            
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    System.out.println("Total Employees: " + totalEmployees);
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Incorrect choice!");
            }
        }
    }

    public static void addEmployee() {
        System.out.print("Enter Employee Name: ");
        String name = scan.nextLine();
        
        System.out.print("Enter Employee ID: ");
        int id = scan.nextInt();
        scan.nextLine(); 
        
        System.out.print("Enter Email: ");
        String email = scan.nextLine();
        
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scan.nextLine();
        
        System.out.print("Enter Address: ");
        String address = scan.nextLine();
        
        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dateOfBirth = scan.nextLine();
        
        System.out.print("Enter Gender: ");
        String gender = scan.nextLine();
        
        System.out.print("Enter Job Title: ");
        String jobTitle = scan.nextLine();
        
        System.out.print("Enter Department: ");
        String department = scan.nextLine();
        
        System.out.print("Enter Employee Type (Full-Time/Part-Time): ");
        String employeeType = scan.nextLine();
        
        System.out.print("Enter Salary: ");
        double salary = scan.nextDouble();
        scan.nextLine(); 
        
        Employee newEmployee = new Employee(name, id, email, phoneNumber, address, dateOfBirth,
                gender, jobTitle, department, employeeType, salary);
        
        employees.add(newEmployee);
        totalEmployees++;
        System.out.println("Employee added successfully!");
    }

    public static void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees added yet.");
        } else {
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
    }
}
