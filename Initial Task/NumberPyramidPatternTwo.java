
public class NumberPyramidPatternTwo {
    public static void main(String[] args) {
        int n = 9; 
        
        for (int i = 0; i < n; i++) {  
           
            for (int space = 0; space < (n - i - 1); space++) {
                System.out.print("  "); 
            }

            int val = n - i;
            for (int j = 0; j <= i; j++) {
                System.out.print(val++ + " ");
            }

            val -= 2;
            for (int j = 0; j < i; j++) {
                System.out.print(val-- + " ");
            }

            System.out.println();  
        }
    }
}
