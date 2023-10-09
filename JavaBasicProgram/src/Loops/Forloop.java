package Loops;

public class Forloop {

	public static void main(String[] args) {
		char c1;
		for (c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.print(c1 + " ");
		}
		System.out.print("*****/print in cap/******");
		for (c1 = 'A'; c1 <= 'Z'; c1++) {
			System.out.print(c1 + " ");
		}
		//ASCII VALUE
		for(char b1='a';b1<='z';b1++){
			int num1=b1;
			System.out.println("b1"+ " :"+num1);
		}
		for (int i=0;i<3;++i) {
			System.out.println("******* hello i:"+i);
		}
		/*
		 * Initialization:	int i=0
		   step1: condition
		   step2: execute body
		   step3: incre/decre				
		   repeat step1 to 3 till the condition gets failed
		 */
		for(int i=0; i<3;++i) {
			System.out.println("******** hello i:"+i);
			for(int j=0;j<2;j++) {
				System.out.println("*******\thi j:"+j);
			}
		}
		System.out.println("**********************");
		for(int i=0; i<3;i++) {
			System.out.println("******hello i:"+i);
			for(int j=0;j<2;j++) {
				System.out.println("******\thi j :"+j);
				for(int k=0;k<2;k++) {
					System.out.println("\t\tbye k :"+k);
				}
			}
		}
		/*System.out.println("***** infinite loop*******");
		for(int i=0; i>=0;i++) {
			if(i % 2 ==0) {
			System.out.println(i);
		}
		}	*/
		
	}
}
