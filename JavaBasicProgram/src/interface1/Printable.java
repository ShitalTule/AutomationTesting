package interface1;

interface Printable {
	int age = 25;

	void Print();
}

interface Showable {
	public void show();
}

class interface3 implements Printable, Showable {
	public static int age = 45;

	public void Print() {
		System.out.println("Hello Print");
	}

	public void show() {
		System.out.println("Welcome ,show");
	}

	public static void main(String[] args) {
		interface3 a1 = new interface3();
		a1.Print();
		a1.show();
		System.out.println("Printable age :" + Printable.age);
		System.out.println(interface3.age);
	}
}