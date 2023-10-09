package inheritance;

//parent/super/base class
public class Country {
	// default constructor
	void dispay() {
		System.out.println("I am dispay method of country");
	}
}

//child/subclass
class State extends Country {
	// default constructor with default super()
	void calling() {
		System.out.println("I am calling method of state");
	}
}

class dist extends State {
	// default constructor with default super()
	void pune() {
		System.out.println("I am Pune");
	}

	public static void main(String[] args) {
		dist a1 = new dist();
		a1.calling();
		a1.pune();
		a1.dispay();
	}
}

/**
 * in order to achieve inheritance we need constructor chaining- constructor
 * chaining- when subclass constructor calls super class constructor and super
 * class constructor calls its super class constructor dn its known as
 * constructor chaining to achieve constructor chaining we need to user super().
 * 
 * super() is used to call parent class constructor based on parameter super()
 * should be the first statement inside the constructor body
 */
