package test.byweekly;

public class MinimumPlatforms {

	public static void main(String[] args) {
		int[] arr = {900, 940, 950, 1100, 1500, 1800};
		int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
		
//		int arr[] = {1, 5};
//		int dep[] = {3, 7}; 
		
		System.out.println(platformsNeeded(arr,dep));
	}
	
	static int platformsNeeded(int[] arr, int[] dep) {
		int maxTime = 0;
		for(int i = 0; i<dep.length; i++) {
			maxTime = Math.max(maxTime, dep[i]);
		}
		
		int[] freq = new int[maxTime + 1];
		for(int i = 0; i<arr.length; i++) {
			freq[arr[i]]++;
			freq[dep[i]]--;
		}
		
		int platforms = 1;
		int count = 0;
		for(int i = 0; i<=maxTime; i++) {
			count+=freq[i];
			platforms = Math.max(platforms, count);
		}
		
		return platforms;
	}

}
