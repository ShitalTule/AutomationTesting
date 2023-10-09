package MethodOverloading;

public class Example2 {
int addNumber() {
	int a=10,b=20,res;
	res=a+b;
	System.out.println("a is :"+a);
	System.out.println("b is :"+b);
	System.out.println("res is :"+res);
	return res;
	
}
int addNumber(int x, int y) {
	int res=x+y;
	System.out.println("x is :"+x);
	System.out.println("y is :"+y);
	System.out.println("res is :"+res);
	return res;
	
}
public static void PrintEvenFromRange(int Starts,int end) {
	for(;Starts<=end;Starts++) {
		if(Starts%2==0) {
			System.out.println(Starts);
		}
	}
}
public static void main(String[] args) {
	Example2 a1=new Example2();
	a1.addNumber();
	System.out.println("**************");
	System.out.println("Result1 :"+a1.addNumber());
	a1.addNumber(10, 50);
	System.out.println("****************");
	System.out.println("Result2 :"+a1.addNumber(30, 40));
	int res=a1.addNumber(20,30);
	System.out.println("result 3 is :"+res);
	int Finalvalue =100+res;
	System.out.println("Result 4 is :"+Finalvalue);
	PrintEvenFromRange(30,40);
	
}
}
