package test.byweekly;

public class CroakOfFrogs {

	public static void main(String[] args) {
//		String croakSound = "croakcroak";
//		String croakSound = "crcoakroak";
		String croakSound = "croakcrook";
		System.out.println(croakingFrogsCount(croakSound));
	}
	
	
	static int croakingFrogsCount(String sound) {
		if(sound.length()%5!=0) {
			return - 1;
		}
		int[] freq = new int[5]; //'c','r','o','a','k'
		for(char ch:sound.toCharArray()) {
			if(ch=='c') freq[0]++;
			else if(ch=='r') freq[1]++;
			else if(ch=='o') freq[2]++;
			else if(ch=='a') freq[3]++;
			else freq[4]++;
		}
		
		if(freq[1]%freq[0]!=0 || freq[2]%freq[0]!=0 || freq[3]%freq[0]!=0 || freq[4]%freq[0]!=0) {
			return -1;
		}
		
		int count = 1, index = 0;
		for(int i = 1; i<sound.length(); i++) {
			if(sound.charAt(i)=='c' && Math.abs(index-i)!=5) {
				
				count++;
				index = i;
			}
		}
		
		return count;
	}
}
