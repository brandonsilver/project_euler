import java.math.BigInteger;
 
public class Problem048
{
	public static void main(String[] args)
	{
		BigInteger sum = BigInteger.ZERO;
		BigInteger currentTerm = BigInteger.ONE;
		BigInteger finalSum = BigInteger.ZERO;
 
		for (int i = 1; i <= 1000; i++)
		{
			sum = currentTerm.pow(i);
			currentTerm = currentTerm.add(BigInteger.ONE);
			finalSum = finalSum.add(sum);
		}
 
		long end = System.currentTimeMillis();
 
		String answer = finalSum.toString();
		System.out.println(answer);
//		System.out.println("Answer:  \n");
//		for (int i = 0; i <= 9; i++ ) {
//			System.out.print(answer.charAt(i));
//		}
	}
}