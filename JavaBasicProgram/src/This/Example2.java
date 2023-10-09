package This;

public class Example2 {
	int x=50;
	// Constructor with a parameter
Example2(int x){
	//System.out.println("non static x :"+this.x);
	this.x=x;
	
}
//Call the constructor
public static void main(String[] args) {
	Example2 a1=new Example2(20);
	System.out.println("value of x :"+a1.x);
	
}
}
