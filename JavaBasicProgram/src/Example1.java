
public class Example1 {
	public static void main(String[] args) {
		int num1 = 10, num2 = 5, res;
		res = num1 + num2;// initialization
		System.out.println("number1 is: " + num1);
		System.out.println("number2 is: " + num2);
		System.out.println("result is: " + res);

		res = num1 * num2;// re-initialization
		System.out.println("number1 is: " + num1);
		System.out.println("number2 is: " + num2);
		System.out.println("result is: " + res);

		num2 = 7;// re-initialization
		res = num1 / num2;// re-initialization ---> 10/7=1
		System.out.println("number1 is: " + num1);
		System.out.println("number2 is: " + num2);
		System.out.println("result is: " + res);

		num1 = 25;// re-initialization
		num2 = 7;// re-initialization
		res = num1 % num2;// re-initialization ---> 25%7=4
		System.out.println("number1 is: " + num1);
		System.out.println("number2 is: " + num2);
		System.out.println("result is: " + res);

	}
}
