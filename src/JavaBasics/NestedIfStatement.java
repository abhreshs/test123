package JavaBasics;

public class NestedIfStatement {
	public static void main(String[] args) {

		/*
		 * To execute the block of code till last block and 
		 * if non of them is true it will result nothing in the output.
		 * In this case it will print Invalid
		 */
		
		int marks = 165;
		
		if (marks < 50) {
			System.out.println("fail");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("D grade");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("C grade");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("B grade");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("A grade");

		} else if (marks >= 90 && marks < 100) {
			System.out.println("A+ grade");

		} else {
			System.out.println("Invalid!");
		}
	}
}