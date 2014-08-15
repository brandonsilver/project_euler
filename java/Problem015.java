/* 
 * 
 * Starting in the top left corner of a 2×2 grid, there are 6 routes (without backtracking) to the bottom right corner.
 * How many routes are there through a 20×20 grid?
 *
 *
 * Answer:  137846528820
 */

public class Problem015
{
	public static double factorial(int n)
	{
		double f = 1L;

		for (int i = n; i > 0; i--) {
			System.out.println("i = " + i);
			f *= i;
			System.out.println("f = " + f);
		}

		System.out.println("f = " + f);

		return f;

	} // end numPaths

	public static double combination(int a, int b)
	{

		return factorial(a) / ( factorial(b) * factorial(a - b) );

	}

	public static void main(String[] args)
	{
		int sizeGrid = 20;
		
		double numPaths = combination(2*sizeGrid,sizeGrid);

		System.out.println("Answer:  " + numPaths);
		
	}

}
