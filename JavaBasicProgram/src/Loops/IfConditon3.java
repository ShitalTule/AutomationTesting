package Loops;

public class IfConditon3 {

	public static void main(String[] args) {
		// Creating two variables for age and weight
		int age = 25;
		int wight = 55;
		char group = 'o';
		// applying condition on age and weight
		if (age >= 21) {
			if (wight > 50) {
				if (group == 'o') {
					System.out.println("You are eligible to donate blood");
				} else {
					System.out.println("You are not eligible to donate boold,as your blood group is not match");
				}
			} else {
				System.out.println("You are not eligible to donate boold, as your wight is not match");
			}
		} else {
			System.out.println("You are not eligible to donate boold, as your age is not match");
		}
	}

}
