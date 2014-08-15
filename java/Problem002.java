/* Answer:  4613732 */
public class Problem002 {
	public static void main(String[] args)
	{
		int sum = 2;
		int prevTerm2 = 1;
		int prevTerm1 = 2;
		int currentTerm = 3;
		
		
		while (currentTerm < 4000001)
		{
			System.out.println("Current Term = " + currentTerm);
			if (currentTerm % 2 == 0)
				sum += currentTerm;
			
			prevTerm2 = prevTerm1;
			prevTerm1 = currentTerm;
			currentTerm = prevTerm2 + prevTerm1;
			
		}
		
		System.out.println("Sum = " + sum);

	} // end main method
	
	
} // end Problem2
