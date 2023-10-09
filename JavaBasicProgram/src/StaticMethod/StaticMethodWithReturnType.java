package StaticMethod;

public class StaticMethodWithReturnType {
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
		GetRoi(30000, 5, 5.5f);
		GetRoi(5000, 3, 2.5f);
	}
}
