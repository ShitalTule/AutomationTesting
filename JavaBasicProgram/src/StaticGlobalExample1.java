
public class StaticGlobalExample1 {
	// static global variables
	static int age;
	static boolean res;
	static char grade;
	static float roi;

	public static void main(String[] args) {
		System.out.println("Program starts");
		// we can access static global variables using classname from here as main() is
		// also static
		System.out.println("default value of age is: " +StaticGlobalExample1 .age);
		System.out.println("default value of res is: " + StaticGlobalExample1.res);
		System.out.println("default value of grade is: " + StaticGlobalExample1.grade);
		System.out.println("default value of roi is: " + StaticGlobalExample1.roi);
		System.out.println("**********************************");
		// initialization of static global variable
		StaticGlobalExample1.age = 25;
		StaticGlobalExample1.res = true;
		StaticGlobalExample1.grade = 'A';
		StaticGlobalExample1.roi = 6.5f;
		System.out.println("updated value of age is: " + StaticGlobalExample1.age);
		System.out.println("updated value of res is: " + StaticGlobalExample1.res);
		System.out.println("updated value of grade is: " + StaticGlobalExample1.grade);
		System.out.println("updated value of roi is: " + StaticGlobalExample1.roi);
		System.out.println("Program ends");
	}

}
