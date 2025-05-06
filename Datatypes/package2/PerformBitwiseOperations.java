package package2;
import java.util.Scanner;

public class PerformBitwiseOperations {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number to perform Bitwise Operations (a): ");
		int a = scan.nextInt();
		
		System.out.print("Enter a number to perform Bitwise Operations (b): ");
		int b = scan.nextInt();
		
		//Bitwise AND
        System.out.println("a & b: " + (a & b));
        //Bitwise OR
        System.out.println("a | b: " + (a | b));
        //Bitwise XOR
        System.out.println("a ^ b: " + (a ^ b));
        //Bitwise NOT
        System.out.println("~a: " + (~a));
        //Bitwise Left shift
        System.out.println("a << 1: " + (a << 1));
        //Bitwise Right shift
        System.out.println("a >> 1: " + (a >> 1));
        //Bitwise Unsigned right shift
        System.out.println("a >>> 2: " + (a >>> 2));
        
        scan.close();
	}

}
