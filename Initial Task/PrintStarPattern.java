import java.util.Scanner;

public class PrintStarPattern {
    public static void printPattern(int n) {
        int size = 2 * n; 
        
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < size; j++) {
                if (j < n - i || j >= n + i) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
        
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < size; j++) {
                if (j < n - i || j >= n + i) {
                    System.out.print("*");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        printPattern(num);
    }
}
