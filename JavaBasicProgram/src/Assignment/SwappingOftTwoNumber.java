package Assignment;

public class SwappingOftTwoNumber {
public void swapTwoNumber() {
	int x=10;
	int y=20;
	System.out.println("1st number :"+x);
	System.out.println("2nd number :"+y);
	int temp;
	temp=x;
	x=y;
	y=temp;
	System.out.println("after swaping 1st number is :"+x);
	System.out.println("after swaping 2nd number is :"+y);
}
public static void main(String[] args) {
	SwappingOftTwoNumber a1=new SwappingOftTwoNumber();
	a1.swapTwoNumber();
}
}
