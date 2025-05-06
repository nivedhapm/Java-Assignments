package package2;
import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the temperature in celsius to be converted to fahrenheit: ");
		double celsius = scan.nextInt();
		double fahrenheit = (celsius*9/5)+32;
		System.out.printf("The temperature equivalent in fahrenheit of %.0f (°C) is : %.1f (°F) ", celsius, fahrenheit);
		scan.close();
	}

}
