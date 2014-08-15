/* What is the first term in the Fibonacci sequence to contain 1000 digits?
 * 
 * 
 * Answer:  4782
 */

import java.math.BigInteger;

public class Problem025
{
	public static int numDigits(BigInteger input)
	{
		String inputString = input.toString();
		
		return inputString.length();
	}
	
	public static void main(String[] args)
	{
		long numTerms = 3L;
		BigInteger prevPrevTerm = BigInteger.valueOf(1L);
		BigInteger prevTerm = BigInteger.valueOf(1L);
		BigInteger currentTerm = BigInteger.valueOf(2L);
		
		while(numDigits(currentTerm) < 1000) {
			
			prevPrevTerm = prevTerm;
			prevTerm = currentTerm;
			currentTerm = prevPrevTerm.add(prevTerm);
			numTerms++;
		}
		
		System.out.println("currentTerm: " + currentTerm.toString());
		System.out.println("Answer:  " + numTerms);
	}

}
