package UnaryOperator;

public class Example5 {

	public static void main(String[] args) {
		int a = 5, b;
		b = a++ + ++a + ++a + a;
		// initial :5 +7 +8 +8
		// final : 6 7 8
		System.out.println("a :" + a);// 8
		System.out.println("b :" + b);// 28
		a = 7;
		b = a-- + --a + --a + a;
		// initial: 7 + 5 + 4 + 4
		// final: 6 5 4
		System.out.println("a :" + a);// 4
		System.out.println("b :" + b);// 20
		a = -21;
		b = --a + --a + --a + a + ++a + a++;
		// initial :-21 + -23 + -24 + -23 + -22
		// final :-22 23 -24 -23 -22
		System.out.println("a :" + a);// -22
		System.out.println("b :" + b);// -139
		a = -5;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
        //initial :	-5  + -6 + -5 +	 -4 + -3  + -2  + -2
		// final : -6 -6 -5 -4 -3 -2 -2
		System.out.println("a :" + a);// -2
		System.out.println("b :" + b);// -29
	}

}
