
public class StaticGlobalVariableExample4 {

	//static global  variables
		static int age=25;
		static boolean res;
		static char grade;
		static float roi=8.5f;
		public static void main(String[] args) {
			System.out.println("Program starts");
			//we can access static global variables using classname from here as main() is also static
			System.out.println("value of age is: "+StaticGlobalVariableExample4.age);//
			System.out.println("default value of res is: "+StaticGlobalVariableExample4.res);//
			System.out.println("value of grade is: "+StaticGlobalVariableExample4.grade);//
			System.out.println("default value of roi is: "+StaticGlobalVariableExample4.roi);//
			System.out.println("**********************************");
			//re-initialization of static global variable
			age=35;
			res=true;
			grade='A';
			roi=6.5f;
			System.out.println("updated value of age is: "+StaticGlobalVariableExample4.age);//
			System.out.println("updated value of res is: "+StaticGlobalVariableExample4.res);//
			System.out.println("updated value of grade is: "+StaticGlobalVariableExample4.grade);//
			System.out.println("updated value of roi is: "+StaticGlobalVariableExample4.roi);//
			System.out.println("Program ends");
		}

}
