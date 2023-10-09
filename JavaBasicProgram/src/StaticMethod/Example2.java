package StaticMethod;

public class Example2 {
static int addNumber() {
	int num1=20,num2=30,res;
	res=num1+num2;
	System.out.println("num1 is :"+num1);
	System.out.println("num2 is :"+num2);
	System.out.println("Result is :"+res);
	return res;
}
static int addTwoNumber(int a,int b) {
	int res=a+b;
	System.out.println("a is :"+a);
	System.out.println("b is :"+b);
	System.out.println("Result is :"+res);
	return res;
}
public static void main(String[] args) {
	addNumber();		//it will execute method body but you wont be able to see or use its return value
	System.out.println("**********************");
	System.out.println("sum of two Number :"+addNumber());//it will execute method body and also prints its return value but you won;t be able to user its return value separately
	System.out.println("***********************");
	int sum=addNumber();
	System.out.println("result :"+sum);//it will execute method body and you can store its return value into a variable for future use
	int cal=sum+100;
	System.out.println("updated values :"+cal);
	System.out.println("---------------------------");
	addTwoNumber(40,30);
	System.out.println("*************");
	System.out.println("Result of two Number :"+addTwoNumber(40,30));
	System.out.println("*********");
	int Result=addTwoNumber(20,40);
System.out.println("*******");
	System.out.println("Result :"+Result);
	int cal1=Result+50;
	System.out.println("cal1 :"+cal1);
	
}
}
