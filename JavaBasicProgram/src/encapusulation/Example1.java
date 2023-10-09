package encapusulation;

public class Example1 {
	private int empId = 101;
	private double salary = 25000.23;

	/*
	  getter: method that help us to access private data members from outside the class 
	  write a public method with return type as private variable
	 */
	public int getEmpId() {
		return empId;
	}

	public double getSalary() {
		return salary;
	}

	/*
	  setter: method that help us to modify private data members from outside the class
	  write a public method with void as a return type and parameter should
	  be same as private variable
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setSalary(double sal) {
		salary = sal;
	}
}

class UseEncap {
	public static void main(String[] args) {
		Example1 a1 = new Example1();
		// Private data members are not accessible from outside the class
		// System.out.println(a1.empId);
		// System.out.println(a1.salary);
		System.out.println(a1.getEmpId());
		System.out.println(a1.getSalary());
		a1.setEmpId(102);
		a1.setSalary(400000.30);
		System.out.println(a1.getEmpId());
		System.out.println(a1.getSalary());
	}
}
