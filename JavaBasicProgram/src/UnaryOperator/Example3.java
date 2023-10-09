package UnaryOperator;

public class Example3 {

	public static void main(String[] args) {
		int a = -100, b;
		b = a++; // b=100& a=a+1(-100+1)=-99
		int x = a, y;
		System.out.println("x :" + x);// -99
		y = ++x;// x=x+1(-99+1)=-98;y=-98
		System.out.println("x :" + x);// -98
		System.out.println("y :" + y);// -98
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		int p = 30, q = 20, res;
		res = p++ + --q;
		// res 30 + 19
		// final 31 19
		System.out.println("res :" + res);// 49
		System.out.println("value of p :" + p);// 31
		System.out.println("value of q :" + q);// 19
		int res1 = ++p + ++q;
		// res1=32 + 20
//final=32+20
		System.out.println("res1 :" + res1);// 52
		System.out.println("p :" + p);// 32
		System.out.println("q :" + q);// 20

	}
}
