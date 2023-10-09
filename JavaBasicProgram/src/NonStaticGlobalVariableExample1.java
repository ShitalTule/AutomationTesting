
public class NonStaticGlobalVariableExample1 {

	// non static global variables
	int age;
	boolean res;
	char grade;
	float roi;

	public static void main(String[] args) {
		System.out.println("Program starts");
		// System.out.println(age);// we can't access non-static member directly from
		// main() because its static
		System.out.println("Program ends");
	}

}
