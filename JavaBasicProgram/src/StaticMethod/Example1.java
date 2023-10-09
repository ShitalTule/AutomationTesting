package StaticMethod;

public class Example1 {
	public static void display() {
		System.out.println("Hi! I am shital");
		System.out.println("You are learning core-java ");
		System.out.println("My contact no is 9665098352");
	}

	static void showDetails(String name, char grade, int num) {
		System.out.println("Hi! I am " + name);
		System.out.println("You grade is" + grade);
		System.out.println("My contact number is " + num);
	}

	static void addNumber() {
		int num1 = 20, num2 = 30, res;
		res = num1 + num2;
		System.out.println("num1 is : " + num1);
		System.out.println("num2 is : " + num2);
		System.out.println("Result is :" + res);
	}

	static void addTwoNumber(int a, int b) {
		int res = a + b;
		System.out.println("a is :" + a);
		System.out.println("b is :" + b);
		System.out.println("Result is :" + res);

	}

	public static void main(String[] args) {
		display();
		// System.out.println(display());());// you will get compile time error method
		// return type is void
		showDetails("Shital", 'A', 96650);
		showDetails("Sharad", 'A', 7794);
		System.out.println("***************************************");
		addNumber();
		addTwoNumber(55, 63);
		addTwoNumber(25, 45);

	}
}
