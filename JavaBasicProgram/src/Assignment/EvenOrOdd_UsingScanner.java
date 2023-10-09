package Assignment;

import java.util.Scanner;

public class EvenOrOdd_UsingScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		/*if(num%2==0) {
System.out.println("Given Number is Even");
}
		else {
			System.out.println("Given Number is odd");
		}*/
		String name= sc.nextLine();
		long moblieno=sc.nextLong();
		char gender=sc.next().charAt(0);
		double cgpa=sc.nextDouble();
		System.out.println("age is ;"+num);
		System.out.println("name is :"+name);
		System.out.println("moblie number is :"+moblieno);
		System.out.println("gender is :"+gender);
		System.out.println("cgpa is :"+cgpa);
}
}
