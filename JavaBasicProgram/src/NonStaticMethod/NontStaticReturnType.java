package NonStaticMethod;

public class NontStaticReturnType {
double x=10,y=20,z=30;
boolean checkSameOrNot(int a,int b) {
	boolean res=(a==b);
	 return res;
}
//method type: static
	static void display() {
		NontStaticReturnType m1 = new NontStaticReturnType();
		System.out.println("Input the first number: " + m1.x);
		System.out.println("Input the second number: " + m1.y);
		System.out.println("Input the third number: " + m1.z);
	}

public void average(double p,double q, double r) {
	double res=(p+q+r)/3;
	System.out.println("averege is :"+res);
}

public static void main(String[] args) {
	NontStaticReturnType m2=new NontStaticReturnType();
	boolean res=m2.checkSameOrNot(30,30);
	System.out.println("Is both number is same :"+res);
	System.out.println("input the first number is :"+m2.x);
	System.out.println("input the first number is :"+m2.y);
	System.out.println("input the first number is :"+m2.z);
m2.average(10,20,30);
System.out.println(m2.checkSameOrNot(10, 20));
display();
}
}
