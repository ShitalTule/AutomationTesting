package Assignment;

public class SumOfNaturalNumber {
public static void main(String[] args) {
/*	int sum;
	int a,b,c,d,e;
	a=10;
	b=20;
	c=30;
	d=40;
	e=50;
	int f=a+b+c+d+e;
	System.out.println(f);
	int j=a-b-c-d-e;
	System.out.println(j);*/
	int i,num=100,sum1=0;
	for(i=0;i<=num;i++) {
		sum1=sum1+i;
		
	}
	System.out.println("sum of  frist 100 num :"+sum1);
	//even or odd
	System.out.println("even num is");
	for(int j=0;j<=100;j++) {
		if(j%2==0) {
			System.out.print(j+" ");
		}
		
	}
	System.out.println();
	System.out.println("odd num is");
	for(int j=0;j<=100;j++) {
		if(j%2!=0) {
			System.out.print(j+" ");
		}
		
	}
}
}

