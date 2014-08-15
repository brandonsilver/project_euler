/* This was another case of trying to do it recursively and failing, epically. 
 * Instead, I tried to replace as much loopiness with if/else logic as possible.
 * This worked. 
 *
 *
 * Answer:   76576500
 */

public class Problem012
{
	public static int numDivisors(int number)
	{
		int numberTotal = 0;

		if (number > 1) {
			if ( number % 2 == 0 ) {
				for (long i = 1; i * i <= number; i++) {
					if (number % i == 0)
						numberTotal+=2;
				}
			}
			else {
				for (long i = 1; i * i <= number; i+=2)
					if (number % i == 0)
						numberTotal+=2;
			}
		} // end >1 logic
		else if (number == 0)
			return 0;
		else if (number == 1)
			return 1;
		else if (number < 0)
			return numDivisors(number *= -1);

		return numberTotal;
	
	}

	public static void main(String[] args)
	{

		final int TARGET_NUM_DIVISORS = 500;
		int currentTerm = 1;
		int index = 1;
//		int counter = 2;
//		int divisorIndex = 0;
		
		while( numDivisors(currentTerm) <= 500 ) {

			index++;
			currentTerm += index;

//			if (numDivisors(currentTerm) >= TARGET_NUM_DIVISORS) {
//				System.out.println("Answer:   " + currentTerm);
//				break;
//			}
//			else {
//				System.out.println(currentTerm);
//			}
//
//		}

//		while (getNumDivisors(currentTerm) < TARGET_NUM_DIVISORS) {
//			System.out.println("currentTerm: " + currentTerm);
//			counter++;
//			currentTerm += counter;
//		}

//		System.out.println("\n\nAnswer:  " + currentTerm);
			

		} // end while
	
		System.out.println("Answer:   " + currentTerm);
	}

}
