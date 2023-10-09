package MethodOverloading;

public class Example1 {
public static void main() {
	System.out.println("Zero Parameter main");
}
public static void main(int a) {
	System.out.println("int Parameter main");
}
public static void main(double a,int b) {
	System.out.println("double int Parameter main");
}
public static void main(String[] args) {
	System.out.println("program starts");
	main();
	main(10);
	main(10.30,50);
	System.out.println("program ends");
}
}
