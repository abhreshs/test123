package JavaBasics;

public class NestedForLoop {

	public static void main(String[] args) {
		/*
		 * It is useful when you have multilayed data
		 * Here, the outer loop iterates 5 times. 
		 * In each iteration of outer loop, the inner loop iterates 2 times.
		 */
		for (int i=1; i<=5; ++i) 
		{
			System.out.println("Outer loop iteration " + i);
				for (int j=1; j<=2; ++j) 
				{
					System.out.println("i = " + i + "; j = " + j);
				}
		}
	}
}
