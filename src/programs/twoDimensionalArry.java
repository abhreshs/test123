package programs;

import java.util.Scanner;

public class twoDimensionalArry {

	public static void main(String args[]) {
		
		/*
		 * Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
		 * Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.
		 * In multidimensional array data is stored in row and column based index (also known as matrix form).
		 */
		
		int a[][] = new int[2][2];
		int i, j;

		System.out.println("Enter 4 elements for matrix...");
		Scanner sc = new Scanner(System.in);

		for (i = 0; i < 2; ++i)
			for (j = 0; j < 2; ++j) {
				a[i][j] = sc.nextInt();
			}

		// Display the matrix.
		for (i = 0; i < 2; ++i) {
			for (j = 0; j < 2; ++j) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
