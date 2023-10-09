
public class Logicalop2 {

	public static void main(String[] args) {
		// Variables Definition and Initialization
		int num1 = -10, num2 = 10;
		boolean res1, res2;
		res1 = (num1 != num2);
		res2 = (num1 < num2);
		System.out.println("Result1: " + res1);//
		System.out.println("Result2: " + res2);//
		// Logical AND
		System.out.println("bool1 && bool2 = " + (res1 && res2));//
		// Logical OR
		System.out.println("bool1 || bool2 = " + (res1 || res2));//
		// Logical Not
		System.out.println("!(bool1 && bool2) = " + !(res1 && res2));//

	}

}
