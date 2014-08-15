import java.lang.Object;
public class Problem024 {

	public static void main(String[] args) {
		// Initialize
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++)
			array[i] = i;

		// Permute
		for (int i = 0; i < 999999; i++) {
			if (!Library.nextPermutation(array))
				throw new AssertionError();
		}

		// Print
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}

}