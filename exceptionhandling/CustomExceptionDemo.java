package exceptionhandling;

class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class CustomExceptionDemo {
 public static void checkAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age must be 18 or above to register.");
     } else {
         System.out.println("Registration successful!");
     }
 }

 public static void main(String[] args) {
     int userAge = 16; 

     try {
         checkAge(userAge);
     } catch (InvalidAgeException e) {
         System.out.println("Caught Exception: " + e.getMessage());
     }
 }
}
