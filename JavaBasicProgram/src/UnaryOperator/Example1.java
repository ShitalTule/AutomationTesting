package UnaryOperator;

public class Example1 {

	public static void main(String[] args) {
		int x = 6, y;
		// Decrement --> pre-Decrement--> first perform ops dn use updated value
		y = --x;// y =--x; --->x=x-1;
		System.out.println("x:" + x);
		System.out.println("y" + y);
		x = 15;// Decrement --> post-Decrement--> first use value and dn perform ops
		y = x--;// y =x--; --->x=x-1;
		System.out.println("x" + x);
		System.out.println("y" + y);
	}
}

class Example2 {

	public static void main(String[] args) {
		int i = 15;
		int j = i;
		System.out.println("i :" + i);//15
		System.out.println("j :" + j);//15
		i = j + 50;
		System.out.println("updated value of i :" + i);//65
		System.out.println("value of j :" + j);//15
		int x = -10, y;
		// Increment --> pre-increment--> first perform ops dn use updated value
		y = ++x;// y =++x; --->x=x+1;
		System.out.println("value of x :" + x);//-9
		System.out.println("value of y :" + y);//-9
		x = 10;
		// Increment --> post-increment--> first use value and dn perform ops
		y = x++;
		System.out.println("x :" + x);//11
		System.out.println("y :" + y);//10
	}
}