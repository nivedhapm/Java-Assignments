import java.util.HashSet;
import java.util.Set;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] array1 = {2,4,5,6,7,9,10,13};
		int[] array2 = {2,3,4,5,6,7,8,9,11,15};
		
		Set<Integer> mergedArray = new HashSet<>();
		for (int i:array1) {
			mergedArray.add(i);
		}
		for (int j: array2) {
			mergedArray.add(j);
		}
		System.out.print(mergedArray);

	}

}
