package Loops;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
System.out.println("printing no from 0 to 4");
while(a<5) {
	System.out.println("helloo :"+a);
	a++;
	}
	int b=5;
	System.out.println("printing no form  5 to 1");
	while(b>0) {
		System.out.println("bye:"+b);
		b--;
}
 char c1='a';
 while(c1<='z') {
	 System.out.println(c1+ " ");
	 c1++;
 }
 System.out.println("\n*** reverse****");
 char c2='z';
 while(c2>='a') {
	 System.out.println(c2 + " ");
	 c2--;
 }
 
	int num=20;
	while( num<0) {
		System.out.println(num);
	  num=num+3;
		
	}
	}

}
/*
 * while (boolean Condition) 
 * { 
 * 		//code snippetů 
 * }
 */
//*************
/*
 * while loop execution order:
 * 		1. check condition
 * 				2. execute body
 */