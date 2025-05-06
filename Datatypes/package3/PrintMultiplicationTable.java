package package3;
import java.util.Scanner;

public class PrintMultiplicationTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to print its multiplication table: ");
		int number = scan.nextInt();
		
		System.out.println("\nMultiplication Table for " + number + ":");
        System.out.println("---------------------------\n");
        
        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.printf("%d × %-2d = %d\n", number, i, product);
        }    
		scan.close();

	}

}
