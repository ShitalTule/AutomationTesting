package This;


class B{
	B(){
		this(10);
		System.out.println("hello zero");
	}
	B(double d){
		System.out.println("hello double :"+d);
	}
	B (int x){
		this(10.25);
		System.out.println("hello int :"+x);
	}
}
public class ThisStatement1 {
	int a;
	public static void main(String[] args) {
		//ThisStatement1 a1=new ThisStatement1();
		B a2=new B();
		B a3=new B(10.23);
		B a4=new B(10);
		
	}
}
/**
 * this()---> statement
 * this(): used to call another constructor of current class based on its argument
 * this(): should be the first statement inside the constructor body
 */
