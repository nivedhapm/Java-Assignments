package package4;
import java.util.Scanner;

public class ValidateEmailAddress {

	public static boolean isValidEmail(String email) {
     
        int atIndex = email.indexOf('@');
        if (atIndex == -1 || atIndex == 0 || atIndex == email.length() - 1) {
            return false; 
        }
  
        String localPart = email.substring(0, atIndex);
        String domainPart = email.substring(atIndex + 1);

        if (localPart.isEmpty() || domainPart.isEmpty()) {
            return false;
        }

        int dotIndex = domainPart.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex == domainPart.length() - 1 || dotIndex == 0) {
            return false; 
        }
        
        String domainExtension = domainPart.substring(dotIndex + 1);
        if (domainExtension.length() < 2) {
            return false;
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an email address: ");
        String email = scan.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Valid email address!");
        } else {
            System.out.println("Invalid email address!");
        }
        scan.close();
    }

}
