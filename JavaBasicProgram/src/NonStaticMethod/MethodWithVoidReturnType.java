package NonStaticMethod;

public class MethodWithVoidReturnType {

	/**
	 * non-static method with access modifier as default, return type as void with not parameter/argument
	 */
void display() {
	System.out.println("I am display Method");
}
static void display(char c1) {
	System.out.println("I am display method and printing char as :"+c1);
}
private void call(long num) {
	System.out.println("I am calling method and call number is :"+num);
}
public static void main(String[] args) {
	MethodWithVoidReturnType b1= new MethodWithVoidReturnType();
	b1.display();
	b1.call(20);
	MethodWithVoidReturnType.display('a');
}

}
