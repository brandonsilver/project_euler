/* I had some trouble with this one. It asks to find the sum of the digits of 2^1000.
 * I got stuck due to an off-by-one error. I started out the BigInt at 2, and raised it to
 * the 1001st power, all the while thinking I had raised it to 1000. 
 */
// Answer:  1366

import java.math.BigInteger;
public class Problem016
{
	public static void main(String[] args)
	{

		BigInteger number = BigInteger.valueOf(2L);
		String numberString = "";
		int digitSum = 0;

		// create our huge power number
		for (int i = 0; i < 999; i++) {
			number = number.multiply(BigInteger.valueOf(2L));
//			System.out.println(number.toString());
		}

		numberString = number.toString();

		for (int i = 0; i < numberString.length(); i++) {
			System.out.println("i = " + i);
			digitSum += Integer.parseInt(numberString.substring(i,i+1));
			System.out.println("Intermediate sum = " + digitSum);
		}

		System.out.println("digit sum = " + digitSum + "\n");

	//	for (int i = 0; i < numberString.length(); i++) {
//			System.out.print( numberString.charAt(i) + " + " );
//		}
		System.out.println("number: " + number.toString());

	} // end main method

}
