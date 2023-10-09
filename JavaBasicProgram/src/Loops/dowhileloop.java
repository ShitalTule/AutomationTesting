package Loops;

public class dowhileloop {

	public static void main(String[] args) {
		int a=10;
		System.out.println("printing all noumbers from 10 till 0");
		do {
			// printing all the numbers till 10
						System.out.println(a);
			a--;	
		}while (a>0);
		System.out.println("*********************************");
		
		int day=1;
		do {
			System.out.println("day "+day);
			day++;
			
		}while(day<31);
		System.out.println("**************************************");
		
		/* local variable Initialization */ 
		int i= 5, times = 0;

		/* do-while loops execution */
		do {
			System.out.println("Java do while loops:" + i);
			i++;
		} while (i<= times);
		
		i=5;
		while(i<=times) {
			System.out.println("Java while loops:" + i);
			i++;
		}
}
}
/*
 * do-while execution order:
 * 		1. body
 * 				2. condition
 * 
 * 
 * while:
 * 		1. condition
 * 				2.body
 */