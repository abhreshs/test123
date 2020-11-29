package JavaBasics;

public class DoWhileLoop {

	public static void main(String[] args) {
		/*
		 * This loop will execute the code block once, 
		 * before checking if the condition is true, 
		 * then it will repeat the loop as long as the condition is true.
		 */
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 0); //replace 10 with 0
	}
}
