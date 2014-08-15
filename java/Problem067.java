/* 
 * Find the maximum total from top to bottom in triangle.txt, a file containing a triangle with one-hundred rows.
 *
 * Answer:    7273
 */
import java.util.*;
import java.io.*;

public class Problem067
{
	public static void readNums(Scanner scan, int[][] iArr)
	{
		int tempInt = -3;
		for (int i = 0; i < iArr.length; i++) {

			for (int j = 0; j < iArr[i].length; j++) {

				if ( scan.hasNextInt() ) {

					tempInt = scan.nextInt();
					if ( tempInt == -1 ) {
						break;
					}
					else {
						iArr[i][j] = tempInt;
					}

				}

			} // end inner loop

		} // end outer loop

		System.out.println("Numbers scanned in: ");
		for (int i = 0; i < iArr.length; i++) {
			
			for (int j = 0; j < iArr[i].length; j++) {
				if ( iArr[i][j] == 0 ) 
					System.out.print("  " + 0);
				else if ( iArr[i][j] < 10 && iArr[i][j] != 0 )
					System.out.print(" " + 0 + iArr[i][j]);
				else {
					System.out.print(" " + iArr[i][j]);
				}
			}
			System.out.print("\n");
		}

	} // end readNums method

	public static int maxValue(int a, int b)
	{
		if ( a > b )
			return a;
		else
			return b;
	}

	public static int largestPathSum(int[][] iArr)
	{
		int largestSum = 0;

		for (int i = 0; i < iArr.length; i++) {

			for (int j = 0; j < iArr[i].length; j++) {

				if ( i == 0 && j == 0) // if we're at the top
					break;
				else if ( j == 0 ) { // if we're on the left edge
					
					iArr[i][j] += iArr[i-1][j]; // just add the parent

					if (iArr[i][j] > largestSum)
						largestSum = iArr[i][j];

				}
				else if ( j == i ) { // if we're on the right edge
					
					iArr[i][j] += iArr[i-1][j-1]; // just add the parent

					if (iArr[i][j] > largestSum)
						largestSum = iArr[i][j];

				} 
				else { // we're somewhere in the middle, or the bottom
//					System.out.println("\ni= " + i + " j = " + j);
					iArr[i][j] += maxValue(iArr[i-1][j], iArr[i-1][j-1]); // add the larger of the two parents

					if (iArr[i][j] > largestSum)
						largestSum = iArr[i][j];

				}

			} // end inner loop

		} // end outer loop

		return largestSum;

	}

	public static void main(String[] args)
	{
		String inputFile = "/home/brandon/Dropbox/school/2012 Spring/CS-2133/workspace/ProjectEuler/bin/triangle.txt";
		// NOTE about inputFile: I had to use full path to the input file padded with '-1' at the end of each line. yes, even for this one :(
		int sizeArr = 100;
		int[][] iArr = new int[sizeArr][sizeArr];
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
				iArr[i][j] = 0;
			}
		}
		
		try {
			Scanner scan = new Scanner( new File ( inputFile ) );
			readNums( scan, iArr);
		} catch (Exception e) {
			System.out.println("Error: probably bad file name. Expecting: " + inputFile);
			e.printStackTrace();
			System.exit(1);
		}

		int answer = largestPathSum(iArr);

		System.out.println("\nAnswer:   " + answer);
			
	}

}
