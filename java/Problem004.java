/* A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

Answer: 906609

*/
public class Problem004 {
	
	public static void main(String[] args)
	{
		int[][] memos = new int[1000][1000];
		String[][] memosStr = new String[1000][1000];
		int largest;

		for (int i = 0; i < memos.length; i++) // initialize memos
			for (int j = 0; j < memos[i].length; j++)
				memos[i][j] = -1;

		for (int i = 0; i < memosStr.length; i++)
			for (int j = 0; j < memosStr[i].length; j++)
				memosStr[i][j] = "";

		multiplyNums(memos);

		for (int i = memos.length - 1; i > 0; i--)
			for (int j = memos[i].length - 1; j > 0; j--)
				if (memos[i][j] != -1)
					System.out.println("memos[" + i + "][" + j + "] = " + memos[i][j]);

		System.out.println("Beginning integer to String conversion...");

		convertNums(memos, memosStr);

		System.out.println("\n\nPalindromes: ");

		largest = largestPalindrome(memosStr);

		System.out.println("Largest Palindrome: " + largest);



	} // end main method

	public static void multiplyNums(int[][] memos)
	{
		for (int i = 999; i >= 100; i--) {
			for (int j = 100; j <= 999; j++) {
				if (memos[i][j] > 0 || memos[j][i] > 0)
					break;
				memos[i][j] = i * j;
				System.out.println("multiplied: " + i + " * " + j);
			}
		}


	} // end multiplyNums method

	public static void convertNums(int[][] memos, String[][] memosStr)
	{
		for (int i = 0; i < memos.length; i++) {
			for (int j = 0; j < memos[i].length; j++) {
				if (memos[i][j] != -1) {
					memosStr[i][j] = Integer.toString(memos[i][j]);
					System.out.println(i + " * " + j + " = " + memosStr[i][j]);
				}
			}
		}

	} // end convertNums method

	public static int largestPalindrome(String[][] memosStr)
	{
		int currentNum = 0;
		int largestNum = 0;

		for (int i = 0; i < memosStr.length; i++) {
			for (int j = 0; j < memosStr.length; j++) {
				if (!memosStr[i][j].equals("")) {
					if (isPalindrome(memosStr[i][j])) {
						//System.out.println(memosStr[i][j]);
						currentNum = Integer.parseInt( memosStr[i][j] );
						if (currentNum > largestNum)
							largestNum = currentNum;
					}
				}
			}
		} // outer array loop

		return largestNum;

	} // end printPalindromes method

	public static boolean isPalindrome(String s)
	{
		String r = new String((new StringBuffer(s)).reverse());
		if (s.equals(r)) {
			return true;
		}
		return false;
	} // end isPalindrome method

}
