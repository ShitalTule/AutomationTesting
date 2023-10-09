package StaticMethod;

public class StaticMethodReturnType2 {
	static double roi() {
		int P = 55000;
		int T = 6;
		float R = 6.5f;
		double res = (P * T * R) / 100;
		System.out.println("principle amount is :" + P);
		System.out.println("Time is :" + T);
		System.out.println("Rate of Interest is : " + R);
		System.out.println("Res is :" + res);
		return res;
	}

	static double GetRoi(int P, int T, float R) {
		double res = (P * T * R) / 100;
		System.out.println("principle amunt is :" + P);
		System.out.println("Time is :" + T);
		System.out.println("Rate of Interest is :" + R);
		System.out.println("Res is :" + res);
		return res;
	}
	public static void main(String[] args) {
		roi();
		System.out.println("************");
		System.out.println("interst to be paid is :"+roi());
		double x=roi();
		double FinalAmountToBePaid=50000+x;
		System.out.println("*****************");
		System.out.println("Total Amount To Be Paid Including Interest :"+FinalAmountToBePaid);
		System.out.println("**********using parameter***********");
		GetRoi(30000,6,5.5f);
		double interest=GetRoi(30000,6,5.5f);
		double TotalInterest=interest+50000;
		System.out.println("Total Interest paid by :"+TotalInterest);
		
	}
}
