package This;

public class ThisExample1 {
int age;
void call() {
	System.out.println("I am call method");
}
void m(int age) {
	System.out.println("local age :"+age);
	System.out.println("global age :"+this.age);
	//call();
	this.call();
	System.out.println("this keyword value is :"+this);
}
public static void main(String[]args) {
	ThisExample1 a1=new ThisExample1();
	System.out.println("a1 value is :"+a1);
	a1.m(10);
}
}
