package package3;
import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the score of the student(0-100): ");
		int score = scan.nextInt();
		
		if(score<0 || score>100) {
			System.out.println("Invalid score. Please enter a score between 0 and 100.");
		}
		char grade;
		int range = score/10;
		switch(range){
		
		case 10:
			grade = 'O';
			break;
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		case 5:
			grade = 'E';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("The corresponding grade of the score obtained by the student - ");
		System.out.println("Score: "+ score);
		System.out.println("Grade: "+ grade);
		
		scan.close();
	}

}
