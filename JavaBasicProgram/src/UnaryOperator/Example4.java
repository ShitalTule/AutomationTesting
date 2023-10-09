package UnaryOperator;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 60;
		int b = a;
		System.out.println("a :" + a);// 60
		System.out.println("b :" + b);// 60
		/**
		 * pre: first perform the operation dn use the updated value post: first use the
		 * value dn perform the operation
		 */
		int k = ++a;// a=a+1(60+1)=61
		System.out.println("k :" + k);// 61
		System.out.println("a :" + a);// 61
		int j = k++;// k=k+1(61+1)=62
		System.out.println("k :" + k);// 62
		System.out.println("j :" + j);// 61
		int h = -9;
		System.out.println("h :" + h++);// h=h+1(-9+1)=-8
		System.out.println("h :" + h);// -8
		// System.out.println("h :" + ++h);// h=h+1(-8+1)=-7
		// System.out.println("h :" + h);// -7
		int x = 100;
		System.out.println("x :" + --x);// 99
		System.out.println("x :" + x);// 99
		System.out.println("x :" + x--);// 99
		System.out.println("x :" + x);// 98
	}

}
