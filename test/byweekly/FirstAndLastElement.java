package test.byweekly;
import java.util.Arrays;

public class FirstAndLastElement {

	public static void main(String[] args) {
//		int[] nums = {5,7,7,8,8,10};
//		int target = 8;
		
		int[] nums = {2,2,3,4,4,4,4,7,7,8,8,10};
		int target = 4;
		
		
//		int[] nums = {5,7,7,8,8,10};
//		int target = 6;
		
//		int[] nums = {};
//		int target = 0;
		
		System.out.println(PrintPostions(nums,target));
		
		
	}
	static String PrintPostions(int[] nums, int target) {
		int first = FindPositionFirst(nums,target);
		int last = FindPositionLast(nums,target);
		
		return Arrays.toString(new int[] {first,last});
	}
	
	static int FindPositionFirst(int[] nums, int target) {
		int result = -1;
		int l = 0, r = nums.length-1;
		while(l<=r) {
			int mid = l + (r-l)/2;
			
			if(nums[mid]==target){
				result = mid;
				r = mid-1;
			}
			
			else if (nums[mid]<target) {
				l = mid+1;
			}
			else {
				r = mid-1;
			}
		}
		return result;
	}
	
	static int FindPositionLast(int[] nums, int target) {
		int result = -1;
		int l = 0, r = nums.length-1;
		while(l<=r) {
			int mid = l + (r-l)/2;
			
			if(nums[mid]==target){
				result = mid;
				l = mid+1;
			}
			
			else if (nums[mid]<target) {
				l = mid+1;
			}
			else {
				r = mid-1;
			}
		}
		return result;
	}

}
