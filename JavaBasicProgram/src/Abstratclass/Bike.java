package Abstratclass;

public class Bike extends Car1{
void run() {
	System.out.println("Car runnning Sucessfully ");
}
void color() {
	System.out.println("The color is Blue");
}
void speed() {
	System.out.println("150 kmphr");
}
public static void main(String[] args) {
	Bike a1=new Bike();
		a1.run();
		a1.color();
		a1.speed();
		a1.display();
}
}
