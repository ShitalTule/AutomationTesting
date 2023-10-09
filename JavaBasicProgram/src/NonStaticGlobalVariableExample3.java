
public class NonStaticGlobalVariableExample3 {

	int age;
	boolean res;
	char grade;
	float roi;

	public static void main(String[] args) {
		System.out.println("Program starts");
		// System.out.println(age);//we can't access non-static member directly from
		// main() because its static

		// to avoid above error first we need to load all the non-static members into
		// the memory
		// create an instance/object of required class
		NonStaticGlobalVariableExample3 ref1 = new NonStaticGlobalVariableExample3();
		System.out.println("default, Non-static variable age: " + ref1.age);
		System.out.println("default, Non-static variable res: " + ref1.res);
		System.out.println("default, Non-static variable grade: " + ref1.grade);
		System.out.println("default, Non-static variable roi: " + ref1.roi);
		System.out.println("***************Updating non-static variables*******************");
		ref1.age = 25;
		ref1.res = true;
		ref1.grade = 'B';
		ref1.roi = 7.5f;
		System.out.println("updated, Non-static variable age: " + ref1.age);
		System.out.println("updated, Non-static variable res: " + ref1.res);
		System.out.println("updated, Non-static variable grade: " + ref1.grade);
		System.out.println("updated, Non-static variable roi: " + ref1.roi);
		System.out.println("Program ends");
	}

}
