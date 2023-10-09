package Construtor;

public class Example1 {
Example1(){
	System.out.println("Hii!Wel Come");
}
public void Method1() {
	System.out.println("hiii! I Am Method1");
}
Example1(int a){
	a=20;
	System.out.println(a);
	System.out.println("Hello! Wel Come to home");
}
Example1(int b,char a1){
	b=30;
	a1='h';
	System.out.println(b);
	System.out.println(a1);
	System.out.println("hello");
}
Example1(double s,float t){
	s=20.5;
	t=50.6f;
	System.out.println(s);
	System.out.println(t);
	System.out.println("hiii");
}
public void Method2() {
	System.out.println("Hii! I Am Method2");
}
public static void main(String[] args) {
	Example1 a1=new Example1();
	Example1 a2=new Example1(20);
	Example1 a3= new Example1(30,'s');
	Example1 a4=new Example1(20.3,50.5f);
	
	a1.Method1();
	a1.Method2();
	
}
}
