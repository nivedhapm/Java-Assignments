package exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your phone number (digits only): ");
            long phoneNumber = scanner.nextLong();  // expects numeric input

            System.out.println("Phone number entered: " + phoneNumber);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Only numbers are allowed for phone number.");
        } finally {
            scanner.close();
        }
    }
}

