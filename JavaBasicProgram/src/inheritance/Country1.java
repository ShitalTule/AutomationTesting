package inheritance;

public class Country1 {
	Country1(int a){
		System.out.println("I am int-para cons of Country class");
	}
	void display() {
		System.out.println("I am Display Method Of Country");
	}
}
class State1 extends Country1{
	State1(){
		super(10);
		System.out.println("I am Zero-para cons of State class");
	}
	void calling() {
		System.out.println("I Am calling Method of State");
	}
}
class City extends State1{
	void Printing(){
		System.out.println("I Am Printing Method of City ");
	}
	public static void main(String[] args) {
		City a1=new City();
				a1.calling();
				a1.display();
				a1.Printing();
	}
}
