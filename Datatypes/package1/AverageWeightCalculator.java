package package1;
import java.util.Scanner;

public class AverageWeightCalculator {

	public static void main(String[] args) {
		final int numberOfPeople = 10;
		double totalWeight = 0.0;
		Scanner scan = new Scanner(System.in);
		
		for(int personIndex = 1; personIndex <= numberOfPeople; personIndex++) {
			System.out.print("Enter the weight of the person "+personIndex+" (in kgs): ");
			double personWeight = scan.nextDouble();
			totalWeight += personWeight;
		}
		double averageWeight = totalWeight/numberOfPeople;
		System.out.printf("The average weight of 10 people: %.2f", averageWeight);
		scan.close();
	}
}
