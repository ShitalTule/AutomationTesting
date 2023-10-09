package NonStaticMethod;

public class Example1 {
int age;
public void display() {
	System.out.println("I am display() of Non static class Example1 and age value is "+age);
}
public void display(int a) {
	age=a;
	System.out.println("I am display(int) of Non Static class Example1 and value of age is :"+age);
	
}
public static void main(String[] args) {
	Example1 m1=new Example1();
	m1.display();
	m1.display(20);
	System.out.println("age:"+m1.age);
	m1.display(30);
	System.out.println("age:"+m1.age);
	Example1 m2=new Example1();
	m2.display(60);
	System.out.println("age:"+m2.age);
	m2.display();
}
}
