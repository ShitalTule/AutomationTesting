package encapusulation;

public class Demo1 {
	private int EmpId = 0202;
	private double salary = 550000.25;

	/* generate getter for empID and salary */
	public int getEmpId() {
		return EmpId;
	}

	public double getsalary() {
		return salary;
	}

	/* generate setter for empID and salary */
	public void setEmpId(int EmpId) {
		this.EmpId = EmpId;
	}

	public void setsalary(double salary) {
		this.salary = salary;
	}

}

class Encap0 {
	public static void main(String[] args) {
		Demo1 a1 = new Demo1();
		System.out.println("Accessing private data member outside the class using get:" + a1.getEmpId());
		System.out.println("Accessing private data member outside the class using get:" + a1.getsalary());
		System.out.println("************updating private data members**************");
		a1.setEmpId(505);
		a1.setsalary(8500000.23);
		System.out.println(" accessing updated private member using getter:" + a1.getEmpId());
		System.out.println("accessing updated private member using getter:" + a1.getsalary());
		System.out.println("***********************************");
		Demo1 d2=new Demo1();
		System.out.println("Accessing private data member outside the class using getter concept- empID: "+d2.getEmpId());
		System.out.println("Accessing private data member outside the class using getter concept- salary: "+d2.getsalary());


	}
}