package package3;
import java.util.Scanner;

public class PrintGreatestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Print the greatest of three numbers!");
		
		System.out.print("Enter the 1st number(int): ");
		int num1 = scan.nextInt();
		
		System.out.print("Enter the 2nd number(int): ");
		int num2 = scan.nextInt();
		
		System.out.print("Enter the 3rd number(int): ");
		int num3 = scan.nextInt();
		
		if(num1>=num2 && num1>=num3) {
			System.out.printf("%d is the greatest of the three number!",num1);
		}
		else if(num2>=num1 && num2>=num3) {
			System.out.printf("%d is the greatest of the three number!",num2);
		}else {
			System.out.printf("%d is the greatest of the three number!",num3);
		}
		scan.close();
	}

}
