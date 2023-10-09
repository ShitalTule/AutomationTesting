package Construtor;

public class Example2 {
int a=20;
double b=20.30;
/*
  below is default constructor, that will be written by java compiler at compile time

Example2(){
	// empty body
}*/
public static void main(String[] args) {
	Example2 a1=new Example2();
	System.out.println(a1.a);
	System.out.println(a1.b);
}
}
