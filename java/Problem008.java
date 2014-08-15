/*
 * Find the greatest product of five consecutive 
 * digits in the 1000-digit number. (see Problem8.in)
 * 
 * Answer:  40824
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Problem008 {
	
	public static void main(String[] args)
	{
		File file = new File("Problem8.in");
		int[] nums = new int[1000];
		for (int i = 0; i < nums.length; i++)
			nums[i] = 0;

		try {
			Scanner scan = new Scanner(file);
			readNumbers(nums, scan);
		} catch (FileNotFoundException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}

		int greatestProd = findGreatestProduct(nums);

		System.out.println("Greatest Product: " + greatestProd);

		
	}

	public static void readNumbers(int[] nums, Scanner scan)
	{	
		String numbers = "";

		if (scan.hasNext())
			numbers = scan.next();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(numbers.substring(i,i+1));
			System.out.println("numbers.charAt(" + i + ") = " + numbers.charAt(i));
//			System.out.println("nums[" + i + "] = " + nums[i]);
		}
	
	
	} // end readNumbers method

	public static int findGreatestProduct(int[] nums)
	{
		int greatestProd = 0;
		int currentProd = 0;
		for (int i = 4; i < nums.length; i++) {
			currentProd = nums[i] * nums[i-1] * nums[i-2] * nums[i-3] * nums[i-4];
			System.out.println(nums[i] + " " + nums[i-1] + " " + nums[i-2] + " " +  nums[i-3] + " " + nums[i-4]);
			if (currentProd > greatestProd)
				greatestProd = currentProd;	
		}
		
		return greatestProd;

	}


}
