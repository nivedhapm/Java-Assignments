import java.util.Scanner;

public class PlayWithOperators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int a = scan.nextInt();
	    System.out.print("Enter a number: ");
	    int b = scan.nextInt();
	    int x;
		
		System.out.println("++a - b-- : " + (++a - b--) + " ; " + "a=" + a + " " + "b=" + b);
		System.out.println("a % b++ : " + (a % b++)+ " ; " + "a=" + a + " "+ "b=" + b);
		System.out.println("a *= b+5 : " + (a *= b+5)+ " ; " + "a=" + a + " "+ "b=" + b);
		System.out.println("x = 69>>>2 : " + (x = 69>>>2)+ " ; " + "x=" + x);
		scan.close();
	}
	
}
