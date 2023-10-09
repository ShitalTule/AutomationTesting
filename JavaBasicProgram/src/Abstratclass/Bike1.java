package Abstratclass;

 abstract class Bike1 {
	abstract void  run();
	void speed(int spd) {
		System.out.println("bike speed is :"+spd);
	}
}
class Honda extends Bike1{
	void run() {
		System.out.println("running safely");
	}
	void color() {
		System.out.println("Honda color is Blue");
	}
	
}
class abstractClass1{
	public static void main(String args[]) {
		Honda obj = new Honda();
		obj.run();
		obj.speed(60);
		obj.color();		
		//Bike1 b1=new Bike1(); //we cann't create an object of abstract class as it is incomplete class
		Bike1 b2=new Honda();	
		b2.run();
		b2.speed(20);
		//b2.color();
	}
}

