package Loops;

public class IfConfdition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num1 = 45, Num2 = 20;
		if (Num1 != Num2) {
			System.out.println("Number1 not equals to Number2");
		} else {
			System.out.println("Number1 is eqauls to Number2");
		}
		if (Num1 > Num2) {
			System.out.println("Number1 is greater than Number2");
		} else {
			System.out.println("Number1 smaller than Number2");
		}
		if (Num1 >= Num2) {
			System.out.println("Number1 is greater than Number2 Or eqauls to Number2");
		}
		if (Num1 == Num2 || Num1 > Num2) {
			System.out.println("Number1 is eqauls to Number2 Or Number1 greater than Number2");
		} else {
			System.out.println("Number1 is Smaller than Number2");
		}
		if (Num1 >= Num2 && Num1 > Num2) {
			System.out.println("Number1 is either eqauls to Number2 or greater than Number2");
		} else {
			System.out.println("Number1 is Smaller than Number2");
		}
		int x = 55, y = 30;
		if (x > 35 && y > 35) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}
}
