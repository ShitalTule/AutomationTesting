package Assignment;

public class FactorOfPositive {
static  void factor(int num) {
	if(num>0) {
	for (int i=1;i<=num;i++) {
		if(num%i==0) {
			System.out.println(i + ", ");
		}
	}
}
	else {
		
		for (int i=num; i<=Math.abs(num);i++) {
			if (i==0) {
				continue;
			}
			else {
				if(num%i==0) {
					System.out.println(i + ", ");
				}
				
			}
		}
	}
	System.out.println();
}
static void printFactorOfPositiveNumber(int num) {
	for (int i = 1; i <= num; ++i) {
			if (num % i == 0) {
				System.out.print(i + ", ");
			}
	}
}
static void printFactorOfNegativeNumber(int num) {
	for (int i = num; i <= Math.abs(num); ++i) {
		if (i == 0) {
			continue;
		} else {
			if (num % i == 0) {
				System.out.print(i + ", ");
			}
		}
	}
}

public static void main(String[] args) {
	System.out.println(Math.abs(124));
	System.out.println(-75);
	System.out.println(Math.abs(-64));
	
}
}
