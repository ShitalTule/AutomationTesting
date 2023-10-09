package interface1;

interface Printable1 {
	void print();
}

interface Showable1 extends Printable {
	void show();
}

class interface4 implements Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		interface4 a1 = new interface4();
		a1.print();
		a1.show();
		/*Printable1 a2 = (Printable1) new interface4();
		a2.print();*/

	}
}
