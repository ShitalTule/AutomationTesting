package interface1;

public interface Drawable1 {
	void draw();//by default public abstract
	//below default keyword can be used only inside interface
	default void msg() {
		System.out.println("default method");
	}
	static int cube(int x){
		return x*x*x;  
	}  	
//	default static int print(){ // default static can't be written together
//		System.out.println("default static method of interface");
//	} 
//	private methods are allow in jdk9
/*private void test() {
		System.out.println("private method");
	}*/
}
class Rectangle2 implements Drawable1 {
	public void draw() {
		System.out.println("drawing rectangle");
	}
	class InterfaceDefaultStatic {
		public static void main(String args[]) {
			Drawable1 d = new Rectangle2();
			d.draw();
			d.msg();
			System.out.println(Drawable1.cube(3));  
		}
	}


}
