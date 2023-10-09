package Abstratclass;

 abstract class Animal {
	// Abstract method (does not have a body)
		public abstract void animalSound();
		// Regular method
		public void sleep() {
			System.out.println("Zzz");
		}
		

}
class Pig extends Animal {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
	void display() {
		System.out.println("helloo");
	}
}
//Subclass (inherit from Animal)
class Dog8 extends Animal {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The dog says: bow bow");
	}
}
class abstractClass {
	public static void main(String[] args) {
		
		Pig myPig = new Pig(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
		Dog8 d1=new Dog8();
		d1.animalSound();
		d1.sleep();
	}
}
