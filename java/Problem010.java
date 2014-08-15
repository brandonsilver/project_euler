// Answer:  142913828922
public class Problem010 {

	public static void main(String[] args)
	{
		int n = 2000000;
		boolean[] primes = new boolean[n];
		for (int i = 2; i < primes.length; i++)
			primes[i] = true;

		findPrimes(n, primes);

		long sum = 0;

		sum = sumPrimes(primes);

		System.out.println("Answer =  " + sum);
		
	//	methodThree(n);


	}


	/**
	* @param n the upper boundary to process for prime numbers
	* @param primes  the array to store primes
	*/ 
	public static void findPrimes(int n, boolean[] primes) {
		// Variable Definitions
		int sqrtN = (int) Math.sqrt(n);
		
		// again, still trying to get's going on here
		for (int i = 2; i <= sqrtN; i++) {
			if (primes[i]) {
				for (int j = i*i; j < n; j += i) {
					primes[j] = false;
				} // end inner
			}
		} // end outer	
		
	} // end findPrimes 


	/**
	 * @param primes the array from which primes are read
	 */	
	public static long sumPrimes(boolean[] primes)
	{
		long sum = 0L;

		for (int i = 2; i < primes.length; i++)
			if (primes[i] == true)
				sum += i;

		return sum;


	}
	
//	public static void methodThree(int n) {
//		// Variable Definitions
//		int[] primeNums = new int[n];     // an array to hold primes in int form
//		primeNums[0] = 2;  // we'll start out the array with 2, a prime.
//		int pIndex = 1;  // Next location to place a prime in the primeNums array
//		boolean isPrime;
//		int sum = 0;
//
//		for (int i = 3; i < n; i+=2) { 
//			int jmax = (int) Math.sqrt(i);
//			isPrime = true;
//			for (int j = 0; primeNums[j] <= jmax; j++) {
//				if (i % primeNums[j] == 0) {
//					isPrime = false;
//					break;
//				}
//			} // end inner
//			if (isPrime) {
//				primeNums[pIndex] = i;
//				pIndex++;
//			}
//		} // end outer
//		
//		for (int element : primeNums)
//				sum += element;
//		System.out.println("Answer = " + sum);
//	}

}
