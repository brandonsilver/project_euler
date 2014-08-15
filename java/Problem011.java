// What is the greatest product of four adjacent numbers in any direction (up, down, left, right, or diagonally) in the 20×20 grid?
//
// Answer:  70600674
//
// Just a little note: I originally tried the hard-coded logic way, but ran into ArrayOutOfBounds exceptions, so then
// I tried for-loops for each product operation so I could check for in bounds-ness, but that took to damn long 
// and didnt work, so then I finally came to my senses and went back to the hard-coded way but also with 
// checking the bounds. That worked, finally. I feel stupid for trying those for-loops, but I since I
// did eventually figure out the better way of doing it, I guess I don't feel to bad.

import java.io.*;
import java.util.*;

public class Problem011 {
	
	public static void readNums(Scanner scan, int[][] iArr)
	{
		for (int i = 0; i < iArr.length; i++) {
//			System.out.print("\n");
			for (int j = 0; j < iArr[i].length; j++) {
				if (scan.hasNextInt()) {
					iArr[i][j] = scan.nextInt();
//					System.out.print(iArr[i][j]);
				}
			}
		}
		
		
	} // end readNums method

	public static boolean isInBounds(int[][] iArr, int Row, int Col)
	{
		if (Row > 0 && Row < iArr.length && Col > 0 && Col < iArr[Row].length)
			return true;
		else
			return false;
	}

	public static int prodNums(int[][] iArr, int Row, int Col)
	{
		int up = 1;
		int upRight = 1;
		int right = 1;
		int downRight = 1;
		int down = 1;
		int downLeft = 1;
		int left = 1;
		int upLeft = 1;

		if (isInBounds(iArr, Row-3, Col))
			up = iArr[Row][Col] * iArr[Row-1][Col] * iArr[Row-2][Col] * iArr[Row-3][Col];
		
		if (isInBounds(iArr, Row-3, Col+3))
			upRight = iArr[Row][Col] * iArr[Row-1][Col+1] * iArr[Row-2][Col+2] * iArr[Row-3][Col+3];
		
		if (isInBounds(iArr, Row, Col+3))
			right = iArr[Row][Col] * iArr[Row][Col+1] * iArr[Row][Col+2] * iArr[Row][Col+3];
		
		if (isInBounds(iArr, Row+3, Col+3))
			downRight = iArr[Row][Col] * iArr[Row+1][Col+1] * iArr[Row+2][Col+2] * iArr[Row+3][Col+3];
		
		if (isInBounds(iArr, Row+3, Col))
			down = iArr[Row][Col] * iArr[Row+1][Col] * iArr[Row+2][Col] * iArr[Row+3][Col];
		
		if (isInBounds(iArr, Row+3, Col-3))
			downLeft = iArr[Row][Col] * iArr[Row+1][Col-1] * iArr[Row+2][Col-2] * iArr[Row+3][Col-3];
		
		if (isInBounds(iArr, Row, Col-3))
			left = iArr[Row][Col] * iArr[Row][Col-1] * iArr[Row][Col-2] * iArr[Row][Col-3];
		
		if (isInBounds(iArr, Row-3, Col-3))
			upLeft = iArr[Row][Col] * iArr[Row-1][Col-1] * iArr[Row-2][Col-2] * iArr[Row-3][Col-3];
	
		
		// return the largest product of the current set
		if (up > upRight && up > right && up > downRight && up > down && up > downLeft
				&& up > left && up > upLeft)
			return up;
		else if (upRight > up && upRight > right && up > downRight && up > down && up > downLeft
				&& up > left && up > upLeft)
			return upRight;
		else if (right > up && right > upRight && right > downRight && right > down
				&& right > downLeft && right > left && right > upLeft)
			return right;
		else if (downRight > up && downRight > upRight && downRight > down && downRight > downLeft
				&& downRight > left && downRight > upLeft)
			return downRight;
		else if (down > up && down > upRight && down > right && down > downRight && down > downLeft
				&& down > downLeft && down > left && down > upLeft)
			return down;
		else if (downLeft > up && downLeft > upRight && downLeft > downRight && downLeft > down
				&& downLeft > left && downLeft > upLeft)
			return downLeft;
		else if (left > up && left > upRight && left > right && left > downRight && left > down
				&& left > downLeft && left > upLeft)
			return left;
		else
			return upLeft;



	} // end prodNums method
	
	public static void main(String[] args)
	{
		String inFile = "";
		int sizeGrid = 20;
		int[][] iArr = new int[sizeGrid][sizeGrid];
		int currentProd = 0;
		int largestProd = 0;

		if (args.length == 1)
			inFile = args[0];
		else {
			System.out.println("USAGE: ");
			System.out.println("   java Problem11 <name of input file>");
			System.exit(0);
		}
		
		try {
			Scanner scan = new Scanner( new File ( inFile ) );
			readNums(scan, iArr);
			} catch (FileNotFoundException e) {
				System.out.println("ERROR: File " + inFile + " not found. Quitting.");
				System.exit(0);
			}

		// find our largest overall product
		for (int i = 0; i < iArr.length; i++) {
			for (int j = 0; j < iArr[i].length; j++) {
//				System.out.println("iArr[" + i + "][" + j + "] = " + iArr[i][j]);
				currentProd = prodNums(iArr, i, j);
//				System.out.println("Current Product: " + currentProd);
				if (currentProd > largestProd) {
					largestProd = currentProd;
//					System.out.println("New Largest Product: " + largestProd);
				}
			}
		}

		System.out.println("Largest Product:  " + largestProd);
		
		
	} // end main method

} // end Problem11 class
