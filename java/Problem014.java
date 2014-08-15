
/* So I tried a recursive approach before, but it was waaaayyyyy too slow. 
 * So then I figured, "well, if this is too slow, why not give a nested loop approach
 * a shot?" And so I did, and that combined with a LinkedList sped things up by orders of
 * magnitude. Yay.
 */

/* 
 * Answer: 837799
 */
import java.util.LinkedList;
public class Problem014
{
	public static void main(String[] args)
	{
		LinkedList<Long> list = new LinkedList<Long>();

		long length = 0;
		int res = 0;
			
		for (int n = 2; n < 1000000; n++) {

			long i = n;

			while (i != 1) {

				if (i % 2 == 0) {
					i /= 2;
					list.add(i);
				}
				else {
					i = (3 * i) + 1;
					list.add(i);
				}
			} // end inner loop

			if (list.size() > length) {
				length = list.size();
				res = n;
			}
			list.clear();

		} // end outer loop	
		
		System.out.println("Answer:  " + res + " with list size: " + length);
		
	}

}
