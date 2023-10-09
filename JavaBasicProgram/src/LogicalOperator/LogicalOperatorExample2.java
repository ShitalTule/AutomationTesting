package LogicalOperator;

public class LogicalOperatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables Definition and Initialization
		int Num1 = -10, Num2 = 10;
		boolean res1, res2;
		res1 = (Num1 != Num2);
		res2 = (Num1 < Num2);
		System.out.println("Result1 :" + res1);
		System.out.println("Result2 :" + res2);
		// Logical AND
		System.out.println("bool1&&bool2 :" + (res1 && res2));
		// Logical OR
		System.out.println("bool1||bool2 :" + (res1 || res2));
		// Logical Not
		System.out.println("!bool&&bool2 :" + !(res1 && res2));
	}

}
