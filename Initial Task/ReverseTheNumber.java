import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the numbers to be reversed: ");
		int number = scan.nextInt();
		int reverse = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit; 
            number /= 10;    
        }
        
        System.out.println("The number in reverse order is: " + reverse);
        scan.close();

	}

}
