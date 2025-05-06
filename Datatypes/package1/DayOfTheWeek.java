package package1;
import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number (1-7) for the day of the week: ");
		int dayNumber = scan.nextInt();
		
		if(dayNumber>=1 || dayNumber<=7) {
			Weekday day = Weekday.values()[dayNumber-1];
			System.out.println("The day is "+day);
		}
		else {
			System.out.println("Invalid input! Please enter a number between 1 and 7.");
		}
		scan.close();
	}

}

enum Weekday{
	Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
}