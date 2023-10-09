package This;

public class Example1 {
int x=25;
int y=50;
void calling(int x) {
	System.out.println("local variable x :"+x);//10
	System.out.println("non static globlal y :"+y);//50
	
//	Example1 e1=new Example1();
//	System.out.println("non-static global x: "+e1.x);
			//or

	System.out.println("non static global x :"+this.x);//25
	this.x=x;
}
public static void main(String[] args) {
	Example1 a1=new Example1();
	a1.calling(10);
	System.out.println("x :"+a1.x);//10
	System.out.println("y :"+a1.y);//50
	
}
}
/*
 * this keyword:
 * 		is known as current class instance/object
 * 		used to access only non-static member
 * 		can be used only inside non-static method/constructor
 * 		mainly used to differentiate local variable of non-static method/constructor when they have
 * 		same name as non-static global variable
 * 
 */
