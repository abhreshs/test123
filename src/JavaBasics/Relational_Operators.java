package JavaBasics;

public class Relational_Operators {

	public static void main(String[] args) {
			int Ten = 10;	
			int Twenty = 20;
			int Thirty = 30;

			//GREATER THAN OPERATOR
			System.out.println(" Ten > Twenty ==> " + (Ten > Twenty)); //false
			System.out.println(" Twenty > Ten ==> " + (Twenty > Ten)); //true
			System.out.println(" Thirty > Twenty ==> " + (Thirty > Twenty)); //true

			//GREATER THAN OR EQUAL TO OPERATOR
			System.out.println(" Ten >= Twenty ==> " + (Ten >= Twenty)); //false
			System.out.println(" Twenty >= Ten ==> " + (Twenty >= Ten)); //true
			System.out.println(" Thirty >= Twenty ==> " + (Thirty >= Twenty)); //true

			//LESS THAN OPERATOR
			System.out.println(" Ten < Twenty ==> " + (Ten < Twenty)); //true
			System.out.println(" Twenty < Ten ==> " + (Twenty < Ten)); //false
			System.out.println(" Thirty < Twenty ==> " + (Thirty < Twenty)); //false

			//LESS THAN OR EQUAL TO OPERATOR
			System.out.println(" Ten <= Twenty ==> " + (Ten <= Twenty)); //true
			System.out.println(" Twenty <= Ten ==> " + (Twenty <= Ten)); //false
			System.out.println(" Thirty <= Twenty ==> " + (Thirty <= Twenty)); //false

			//EQUAL TO OPERATOR
			System.out.println(" Ten == Twenty ==> " + (Ten == Twenty)); //false
			System.out.println(" Thirty == Twenty + Ten ==> " + (Thirty == Twenty+Ten)); //true

			//NOT EQUAL TO OPERATOR
			System.out.println(" Ten != Twenty ==> " + (Ten != Twenty)); //true
			System.out.println(" Thirty != Twenty + Ten ==> " + (Thirty != Twenty + Ten)); //false
	}
}