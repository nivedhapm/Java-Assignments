package package5;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of people: ");
        int n = scan.nextInt();
        
        int[][] weights= new int[n][];
        
        while(true) {
        	System.out.println("1. Add weight");
        	System.out.println("2. Find Minimum Weight of a Person");
        	System.out.println("3. Exit");
        	System.out.print("Enter your choice:");
        	int choice = scan.nextInt();
        	
        	switch (choice) {
        	case 1:
        		System.out.print("Enter the person index: ");
                int person = scan.nextInt();
                System.out.print("Enter the new weight:");
                int weight = scan.nextInt();
                
                if (person < 0 || person >= weights.length) {
                    System.out.println("Invalid person index");
                    return;
                }else {
                	weights[person] = addWeight(weights[person], weight);
                	System.out.println("Weights updated successfully - " + Arrays.toString(weights[person]));
                }
                break;
        	case 2:
        		findMinWeight(weights, scan);
                break;
        	case 3:
        		scan.close();
        		return;
            default:
                System.out.println("Invalid choice!");
        	}
        }
	}
        public static int[] addWeight(int[] weights, int weight) {      
            int[] newWeight;
            
            if (weights == null || weights.length<1) { 
                newWeight = new int[1];
                newWeight[0] = weight;
            } else {
                newWeight = new int[weights.length + 1];
                for (int i = 0; i < weights.length; i++) {
                    newWeight[i] = weights[i];
                }
                newWeight[weights.length] = weight;
            }
            
            return newWeight;
        }
        
        public static void findMinWeight(int[][] weights, Scanner scan) {
            System.out.print("Enter the person index: ");
            int person = scan.nextInt();
            
            if (person < 0 || weights[person]==null || person >= weights.length || weights[person].length == 0) {
                System.out.println("Invalid person index or no weights recorded");
                return;
            }

            int minWeight = weights[person][0];
            for (int weight : weights[person]) {
                if (weight < minWeight) {
                    minWeight = weight;
                }
            }

            System.out.println("Minimum weight of person " + (person + 1) + ": " + minWeight);
        }

}
