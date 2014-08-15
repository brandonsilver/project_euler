/*
 The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143 ?
 
 
 Answer:
6857
*/
 public class Problem003 {

	public static void main(String[] args)
	{
		// take sq route of big number, find primes up to that sq route
		long number = 600851475143L;
		int sqrtNumber = (int) Math.sqrt(number);
		findPrimes(number, sqrtNumber);
	}
	
	public static void findPrimes(long number, int sqrtNumber)
	{
		// Variable Definitions
		boolean[] primes = new boolean[sqrtNumber + 10];  // set up boolean array for primes
		for (int i = 2; i < sqrtNumber; i++)    // initialize boolean array with true values
			primes[i] = true;
		int sqrtN = (int) Math.sqrt(sqrtNumber);
				
		// again, still trying to get's going on here
		for (int i = 2; i <= sqrtN; i++) {
			if (primes[i]) {
				for (int j = i*i; j < sqrtNumber; j += i) {
					primes[j] = false;
				} // end inner
			}
		} // end outer
		
		for (int i = primes.length - 1; i > 0; i--)
			if (primes[i])
				if(number % i == 0)
					System.out.println(i);
		
	}


}
