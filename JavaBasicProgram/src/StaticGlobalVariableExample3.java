
public class StaticGlobalVariableExample3 {

	// static global variables
	static int age;
	static boolean res;
	static char grade;
	static float roi;

	public static void main(String[] args) {
			System.out.println("Program starts");
			//we can access static global variables using classname from here as main() is also static
			System.out.println("default value of age is: "+StaticGlobalVariableExample3.age);
			System.out.println("default value of res is: "+StaticGlobalVariableExample3.res);
			System.out.println("default value of grade is: "+StaticGlobalVariableExample3.grade);
			System.out.println("default value of roi is: "+StaticGlobalVariableExample3.roi);
			System.out.println("**********************************");
			//initialization of static global variable
			StaticGlobalVariableExample3.age=25;
			StaticGlobalVariableExample3.res=true;
			StaticGlobalVariableExample3.grade='A';
			StaticGlobalVariableExample3.roi=6.5f;
			System.out.println("updated value of age is: "+StaticGlobalVariableExample3.age);
			System.out.println("updated value of res is: "+StaticGlobalVariableExample3.res);
			System.out.println("updated value of grade is: "+StaticGlobalVariableExample3.grade);
			System.out.println("updated value of roi is: "+StaticGlobalVariableExample3.roi);
			System.out.println("Program ends");

}
}
