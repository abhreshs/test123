package oops;

/*
 * These are usually kept in two different class file Employee and Programmer
 * but for demo I have kept both within same file. Even this technique is allowed.
 */


class Employee {
	float salary = 40000;
}

class Programmer extends Employee {
	int bonus = 10000;

	public static void main(String args[]) {
		Programmer p = new Programmer();
		System.out.println("Programmer salary is:" + p.salary);
		System.out.println("Bonus of Programmer is:" + p.bonus);
	
	}
}

