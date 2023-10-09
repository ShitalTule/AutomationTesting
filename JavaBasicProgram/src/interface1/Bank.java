package interface1;

interface Bank {
	double rateOfInterest();
}

class SBI implements Bank {
	public double rateOfInterest() {
		return 8.9;
	}
}

class PNB implements Bank {
	public double rateOfInterest() {
		return 5.5;
	}
}

class interface2 {
	public static void main(String[] args) {
		SBI a1 = new SBI();
		System.out.println("SBI rateOfInterest :" + a1.rateOfInterest());
		PNB a2 = new PNB();
		System.out.println("PNB rateOfInterest :" + a2.rateOfInterest());
		Bank a3 = new SBI();
		System.out.println("rateOfInterest :" + a3.rateOfInterest());
	}
}
