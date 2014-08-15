/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 *
 * Answer =  104743
 */
public class Problem007 {

	public static void main(String[] args)
	{
		int n = 1000000;
		
		findNthPrime(n);


	}

	public static void findNthPrime(int n)
	{
		// Variable Definitions
		boolean[] primes = new boolean[n];  // set up boolean array for primes
		for (int i = 2; i < n; i++)    // initialize boolean array with true values
			primes[i] = true;
		int sqrtN = (int) Math.sqrt(n);
				
		// again, still trying to get's going on here
		for (int i = 2; i <= sqrtN; i++) {
			if (primes[i]) {
				for (int j = i*i; j < n; j += i) {
					primes[j] = false;
				} // end inner
			}
		} // end outer
		
		int counter = 0;
		for (int i = 0; i < primes.length; i++) {
			if (primes[i]) {
				counter++;
				System.out.println("counter = " + counter);
				if (counter == 10001) {
					System.out.println("\n10001 Prime: " + i);
					break;
				}
			}
				
		}

	} // end findNthPrime method


}
