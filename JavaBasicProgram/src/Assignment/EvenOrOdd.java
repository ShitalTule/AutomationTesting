package Assignment;

public class EvenOrOdd {
void EvenOdd(int a) {
	if(a%2==0) {
		System.out.println("Given Number is Even");
	}
	else {
		System.out.println("Given Number is Odd");
	}
	
}
public static void main(String[] args) {
	EvenOrOdd a1=new EvenOrOdd();
	a1.EvenOdd(5);
	a1.EvenOdd(2);
	a1.EvenOdd(10);
	a1.EvenOdd(11);
}
}
