package Abstratclass;

 abstract class Shape {
abstract void draw();
}
class Retangle extends Shape{
	void draw() {
		System.out.println("drawing retangle");
	}
}
class circle extends Shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
}
class abstractclass2{
	public static void main(String[] args) {
		Shape a1=new circle();
		a1.draw();
		Shape a2=new Retangle();
		a2.draw();
	}
}