package interface1;
//variable ---> by default ----> public static final

//method ---> by default ----> public abstract
//no complete methods/non-abstract
//no constructor

interface Drawable {
	int salaray = 250000;;// by default---> public static final int
char a1='a';
	void Draw();// by default---->public abstract void draw();

}

//Implementation: by second user
class Retangle implements Drawable {
	public void Draw() {
		System.out.println("Drawing Retangle");
	}
}

class Circle implements Drawable {
	public void Draw() {
		System.out.println("Drwaing Circle");
	}
}

class interface1 {
	public static void main(String[] args) {
		System.out.println("interface variable salary :" + Drawable.salaray);
		System.out.println("interface char :"+Drawable.a1);
		Retangle a1 = new Retangle();
		a1.Draw();
		Circle a2 = new Circle();
		a2.Draw();
		Drawable a3 = new Circle();
		a3.Draw();
	}
}