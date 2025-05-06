package test;
import java.util.Scanner;

public class LargestConcatenatedNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int n = sc.nextInt();
        int[] list = new int[n];

        System.out.println("Enter the list of numbers: ");
        for(int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println(largestNumber(list, n));
        sc.close();
    }

    public static String largestNumber(int[] list, int n) {
        String result = "";

        for(int i = 0; i < n; i++) {
            int maxEle = -1;
            for(int j = 0; j < n; j++) {
                if (list[j] != -1) {
                    if (maxEle==-1 || isGreater(list[j], list[maxEle])) {
                        maxEle = j;
                    }
                }
            }
            result += list[maxEle];
            list[maxEle] = -1; 
        }

        return result;
    }
    public static boolean isGreater(int a, int b) {
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);

        int len = Math.max(str1.length(), str2.length());

        for (int i = 0; i < len; i++) {
            char c1 = (i < str1.length()) ? str1.charAt(i) : str1.charAt(0); 
            char c2 = (i < str2.length()) ? str2.charAt(i) : str2.charAt(0);

            if (c1 > c2) return true;
            if (c1 < c2) return false;
        }
        return false;
    }
}
