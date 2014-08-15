/*
 * The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.


Answer:  25164150
 */
public class Problem006
{

	public static void main(String[] args)
	{
		long temp = 0L;
		long sumSquares = 0L;
		long squareSum = 0L;

		for (int i = 1; i <= 100; i++) {
			temp = (long) i*i;
			System.out.println(i + " * " + i + " = " + temp);
			sumSquares += temp;
		}

		System.out.println("\nsumSquares = " + sumSquares);

		for (int i = 1; i <= 100; i++) {
			squareSum += (long) i;
		}

		squareSum = squareSum * squareSum;

		System.out.println("\nsquareSum = " + squareSum);

		System.out.println("\nAnswer = " + (squareSum - sumSquares));


	}

}
