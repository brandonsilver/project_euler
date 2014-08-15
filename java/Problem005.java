/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 *
 * Answer:   232792560
 */
public class Problem005 {
	
	public static void main(String[] args)
	{
		final long START = System.currentTimeMillis();
		long endTime;
		for (long i = 20L; i < 9223372036854775807L; i++) {
			System.out.println(i);
			if (i % 2 == 0 && i % 3 == 0 && i % 4 == 0 && i % 5 == 0 && i % 6 == 0
					&& i % 7 == 0 && i % 8 == 0 && i % 9 == 0 && i % 9 == 0
					&& i % 10 == 0 && i % 11 == 0 && i % 12 == 0 && i % 13 == 0
					&& i % 14 == 0 && i % 15 == 0 && i % 16 == 0 && i % 17 == 0
					&& i % 18 == 0 && i % 19 == 0 && i % 20 == 0) {
				System.out.println("Answer = " + i);
				break;
			}
			else
				continue;
		}

		endTime = System.currentTimeMillis();
		System.out.println("\n\nDone. It only took:\n" + (endTime - START) + "\nmilliseconds");
	}

}
