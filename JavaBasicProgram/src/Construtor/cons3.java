package Construtor;

public class cons3 {
cons3(){
	System.out.println("Running class cons3 constructor..");
}
void display() {
	System.out.println("I am display() of class cons3..");
}
class A1{
	int j=10;
	A1(){
		System.out.println("Runnning class A constructor..");
	}
	void display() {
		System.out.println("I am display() of class A...");
	}
}
class B1{
	int i=10;
B1(){
	System.out.println("Runnning class B Constructor...");
}
void display() {
	System.out.println("I Am class B  display() method");
}
}
public static void main(String[] args) {
	System.out.println("main() of class cons3 started");
	cons3 a1=new cons3();
	a1.display();
	//A1 a2=new A1();
	
	
}
}
