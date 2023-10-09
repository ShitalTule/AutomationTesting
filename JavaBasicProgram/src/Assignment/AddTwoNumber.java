package Assignment;

public class AddTwoNumber {
public void addTwoNumber() {
	int a,b,c;
	a=10;b=20;
	c=a+b;
	System.out.println("sum is :"+c);
	
}
public void TwoNumberMultiply(){
	float a,b,c;
	a=10.20f; b=23.20f;
	c=a*b;
	System.out.println("Multiplication is :"+c);
}
public void AsciiValue() {
	char c1='a';
	int ascii=c1;
	System.out.println(ascii);
}
public void AsciiValueofAToZ9() {
	char c1='A';
	for(char c2='A';c1<='Z';c1++) {
		System.out.println(c1 +" " );
	}
}
public void swapTwoNumber() {
	int a,b,temp;
	a=10;
	b=20;
	System.out.println("befour swap a is :"+a);
	System.out.println("befour swap b is :"+b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("afer swap a is :"+a);
	System.out.println("after swap b is:"+b);
	
	
			
}
public static void main(String[] args) {
	AddTwoNumber a1=new AddTwoNumber ();
	a1.addTwoNumber();
	a1.TwoNumberMultiply();
	a1.AsciiValue();
	a1.swapTwoNumber();
	a1.AsciiValueofAToZ9();
}
}
