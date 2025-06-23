package exceptionhandling;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.println("Accessing index 5: " + numbers[5]);  // Index 5 doesn't exist
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e);
        }

        System.out.println("Program continues after exception.");
    }
}

