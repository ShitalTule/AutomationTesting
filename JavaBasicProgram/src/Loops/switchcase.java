package Loops;

public class switchcase {

	public static void main(String[] args) {
		int i = 10;
		switch (i) {
		case 10:
			System.out.println(" i is 10");
			break;
		case 20:
			System.out.println("i is 15");
			break;
		case 30:
			System.out.println("i is 20");
			break;
		default:
			System.out.println("i is not present");
			break;
		}
		System.out.println("********************");
		
		
		
		int month = 5;
		switch (month) {
		case 1:
			System.out.println("month is january");
			break;
		case 2:
			System.out.println("month is february");
			break;
		case 3:
			System.out.println("month is march");
			break;
		case 4:
			System.out.println("month is april");
			break;
		case 5:
			System.out.println("month is may");
			break;
		default:
			System.out.println("Sorry either the value you have given is invalid or not matched with any of the case.");
			break;
		}

	}
}
