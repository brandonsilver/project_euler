// Answer:  31875000
public class Problem009 {

	public static void main(String[] args)
	{

		for (int x = 2; x < 1000; x++) {
			for (int y = 1; y < x; y++) {
				int a = x*x - y*y;
				int b = 2*x*y;
				int c = x*x + y*y;	

				if (1000 % (a+b+c) == 0) {
					int z = 1000 / (a+b+c);
					System.out.println("\n\nAnswer: " + z*a * z*b * z*c);
					break;
				}	
				a = 0;
				b = 0;
				c = 0;
			}
		}

//			for (int i = 0; i < memos.length; i++) {
//				for (int j = 0; j < memos[i].length; j++) {
//					memos[i][j] = 0;	
//				}
//			}

		//}

	}

}
