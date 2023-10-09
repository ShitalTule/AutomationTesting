package This;

public class Example3 {
void methodOne() {
	System.out.println("inside method One");
}
void methodTwo() {
	System.out.println("inside method Two");
	methodOne();
}
public static void main(String[] args) {
	Example3 a1=new Example3();
	a1.methodTwo();
	A a2=new A();
	a2.n();
}
}
class A{
	void m() {
		System.out.println("hello m");
	}
	void n() {
		System.out.println("hello n");
		m();
	}
}
