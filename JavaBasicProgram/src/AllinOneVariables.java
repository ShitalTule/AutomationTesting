
public class AllinOneVariables {

	// global variable
	static int empId = 10;// static global variable
	double salary;// non-static global variable

	public static void main(String[] args) {
		System.out.println("Programs starts");
		// local variables
		int age = 25;
		// access non-static global variable
		AllinOneVariables ref = new AllinOneVariables();
		System.out.println("accessing NSGV from main(): " + ref.salary);
		// access local variable
		System.out.println("accessing local variable: " + age);
		// access static global variable
		System.out.println("Accessing SGV directly from static main(): " + empId);
		System.out.println("Accessing SGV with STD from static main(): " + AllinOneVariables.empId);
		System.out.println("Programs ends");
	}

}
