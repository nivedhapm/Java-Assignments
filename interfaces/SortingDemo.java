package interfaces;
import java.util.Scanner;

//Interface
interface Sortable {
 void sort(int[] arr);
}

//Bubble Sort Implementation
class BubbleSort implements Sortable {
 public void sort(int[] arr) {
     int n = arr.length;
     for (int i = 0; i < n - 1; i++) {
         for (int j = 0; j < n - i - 1; j++) {
             if (arr[j] > arr[j + 1]) {
                 // swap
                 int temp = arr[j];
                 arr[j] = arr[j + 1];
                 arr[j + 1] = temp;
             }
         }
     }
 }
}

//Quick Sort Implementation
class QuickSort implements Sortable {
 public void sort(int[] arr) {
     quickSort(arr, 0, arr.length - 1);
 }

 private void quickSort(int[] arr, int low, int high) {
     if (low < high) {
         int pi = partition(arr, low, high);

         quickSort(arr, low, pi - 1);
         quickSort(arr, pi + 1, high);
     }
 }

 private int partition(int[] arr, int low, int high) {
     int pivot = arr[high];
     int i = low - 1;

     for (int j = low; j < high; j++) {
         if (arr[j] <= pivot) {
             i++;
             // swap
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
     }

     // swap pivot
     int temp = arr[i + 1];
     arr[i + 1] = arr[high];
     arr[high] = temp;

     return i + 1;
 }
}

//Merge Sort Implementation
class MergeSort implements Sortable {
 public void sort(int[] arr) {
     mergeSort(arr, 0, arr.length - 1);
 }

 private void mergeSort(int[] arr, int left, int right) {
     if (left < right) {
         int mid = left + (right - left) / 2;

         mergeSort(arr, left, mid);
         mergeSort(arr, mid + 1, right);

         merge(arr, left, mid, right);
     }
 }

 private void merge(int[] arr, int left, int mid, int right) {
     int n1 = mid - left + 1;
     int n2 = right - mid;

     int[] L = new int[n1];
     int[] R = new int[n2];

     for (int i = 0; i < n1; i++) L[i] = arr[left + i];
     for (int i = 0; i < n2; i++) R[i] = arr[mid + 1 + i];

     int i = 0, j = 0, k = left;
     while (i < n1 && j < n2) {
         arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
     }

     while (i < n1) arr[k++] = L[i++];
     while (j < n2) arr[k++] = R[j++];
 }
}

//Main Demo
public class SortingDemo {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of elements in the array: ");
     int n = sc.nextInt();
     int[] arr = new int[n];

     System.out.println("Enter array elements:");
     for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

     System.out.println("\nChoose Sorting Algorithm:");
     System.out.println("1. Bubble Sort");
     System.out.println("2. Quick Sort");
     System.out.println("3. Merge Sort");
     System.out.print("Enter choice: ");
     int choice = sc.nextInt();

     Sortable sorter;

     switch (choice) {
         case 1 -> sorter = new BubbleSort();
         case 2 -> sorter = new QuickSort();
         case 3 -> sorter = new MergeSort();
         default -> {
             System.out.println("Invalid choice!");
             sc.close();
             return;
         }
     }

     sorter.sort(arr);

     System.out.println("\nSorted Array:");
     for (int num : arr) {
         System.out.print(num + " ");
     }

     sc.close();
 }
}
