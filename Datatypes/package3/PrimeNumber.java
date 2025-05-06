package package3;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("The prime numbers between 1 to 30 are --> \n");
		for(int i = 1; i<30; i++) {
			if (isPrime(i)) {
				System.out.print(i +" ");
			}
		}
	}
	
	static boolean isPrime(int n) {
		if (n<=1) return false;
		for (int j = 2; j < Math.sqrt(n); j++) {
            if (n % j == 0)
                return false;
		}
        return true;
	}

}
