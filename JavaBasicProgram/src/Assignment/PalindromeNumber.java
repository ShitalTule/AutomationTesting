package Assignment;

public class PalindromeNumber {
int palindromeNumber(int num) {
	int rev=0,rem;
	int temp=num;
	while(num!=0) {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	
	if(temp==rev) {
		System.out.println("number is palindrome");
	}
	else {
		System.out.println("number not palindrome");
	}
	return rev;
}
public static void main(String[] args) {
	PalindromeNumber a1=new PalindromeNumber();
	a1.palindromeNumber(123);
	a1.palindromeNumber(121);
}
}
