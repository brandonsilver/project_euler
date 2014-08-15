/* Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 * ( see Problem13.in in the /bin folder for the numbers)
 *
 * Answer:  5537376230
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem013
{
	public static void main(String[] args)
	{
		BigInteger sumNums = BigInteger.valueOf(0L);
		try {

			Scanner scan = new Scanner( new File("Problem13.in") );

			sumNums = new BigInteger(scan.nextLine());
			while (scan.hasNextLine()) {
				sumNums = sumNums.add( new BigInteger(scan.nextLine()));
			}

			System.out.println("Answer:  " + sumNums.toString().substring(0,10));

		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found.");
			System.exit(0);
		}




		
	}

}