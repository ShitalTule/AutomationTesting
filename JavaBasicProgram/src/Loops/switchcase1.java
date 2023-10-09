package Loops;

public class switchcase1 {

	public static void main(String[] args) {
		int value = 10;
		switch (value) {
		case 10:
			System.out.println("congratulation case 1 is executed ");
			break;
		case 20:
			System.out.println("congratulation case 2 is executed ");
			break;
		case 30:
			System.out.println("congratulation case 3 is executed ");
			break;
		default:
			System.out.println("sorry none of your case is match");
		}
		System.out.println("**********************");

		char ch = 'o';
		switch (ch) {
		case 'a':
			System.out.println("value match -a,a vowel");
			break;
		case 'e':
			System.out.println("value match -e , a vowel ");
			break;
		case 'o':
			System.out.println("value match -o , a vowel");
			break;
		case 'i':
			System.out.println("value match -i , a vowel");
			break;
		case 'u':
			System.out.println("value match -u , a vowel");
			break;
		default:
			System.out.println("given char is not match");
			break;
		}
		System.out.println("********************");

		int num1 = 10, num2 = 40, res;
		char op = '/';
		switch (op) {
		case '+':
			res = num1 + num2;
			System.out.println("num1+num2 : " + res);
			break;
		case '-':
			res = num1 - num2;
			System.out.println("num1-num2 :" + res);
			break;
		case '/':
			res = num1 / num2;
			System.out.println("num1/num2 :" + res);
			break;
		default:
			System.out.println("unknow opreation");
			break;
		}
		System.out.println("ends here");
	}
}
/*
 * break: means terminate/break the current flow
 * default: is not a mandatory case
 */ 