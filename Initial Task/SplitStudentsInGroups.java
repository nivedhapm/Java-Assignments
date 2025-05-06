import java.util.Scanner;

public class SplitStudentsInGroups {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Total Number of Students: ");
        int totalStudents = scan.nextInt();



        for (int i = 1; i<5 ; i++){
                System.out.println("Group"+i+": ");
                int n = 100+i;
                while (n <= 100 + totalStudents) {
                    System.out.println(n);
                    n += 4;
                }
        }
        scan.close();
    }
}
