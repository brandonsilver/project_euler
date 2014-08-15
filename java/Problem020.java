/* Find the sum of 100!'s digits.
 *
 *
 * Answer:  648
 */
import java.math.*;
public class Problem020
{
	public static void main(String[] args)
	{
		BigInteger hundredFactorial = BigInteger.valueOf(100L);
		String hundredFactorialString = "";
		long digitSum = 0L;
		
		for (int i = 99; i > 0; i--) {
			hundredFactorial = hundredFactorial.multiply(BigInteger.valueOf(i));
		}
		
		hundredFactorialString = hundredFactorial.toString();
		
		for (int i = 0; i < hundredFactorialString.length(); i++) {
			digitSum += Integer.parseInt(hundredFactorialString.substring(i,i+1));
		}
		
		System.out.println("Answer:  " + digitSum);
	}

}
