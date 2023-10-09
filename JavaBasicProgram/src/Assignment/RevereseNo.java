package Assignment;

public class RevereseNo {
	 /*static int GetReveresNumber(int num) {
		 int rev=0,rem;
		 for(;num!=0;num=num/10) {
			 rem=num%10;
			 rev=rev*10+rem;
		 
		 }
		 return rev;*/
	 int getreveresNumber(int num) {
		int rev=0,rem;
		while(num!=0) {
			 rem=num%10;
			 rev=rev*10+rem;
			 num=num/10;
		 }
		 return rev;
	 }
	public static void main(String[] args) {
	/*	System.out.println("get reveres number :"+RevereseNo.GetReveresNumber(154));
		System.out.println("get reveres number :"+RevereseNo.GetReveresNumber(568));*/
		RevereseNo a1=new RevereseNo();
		a1.getreveresNumber(124);
		a1.getreveresNumber(256);
		System.out.println("reveres number is :"+a1.getreveresNumber(154));
		System.out.println("reveres number is :"+a1.getreveresNumber(564));
	}
}
