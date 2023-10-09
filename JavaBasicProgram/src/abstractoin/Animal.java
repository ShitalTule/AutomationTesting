package abstractoin;

public abstract class Animal {
public abstract void animalSound();
public void sleep() {
	System.out.println("Zzz");
}
}
class pig extends Animal{
	public void animalSound() {
		System.out.println("the pig say: wee wee");
	}
	
}
class dog extends Animal{
	public void animalSound() {
		System.out.println(" the dog say : bow bow");
	}
	/*public void sound() {
		System.out.println("pom pom");
	}*/
}
class abtractClass{
	public static void main(String[] args) {
		pig a1=new pig();
		a1.animalSound();
		a1.sleep();
		dog a2=new dog();
		a2.animalSound();
		a2.sleep();
		Animal a3=new dog();
		a3.animalSound();
		a3.sleep();
	    
	}
}
