package encapusulation;

public class Encapuslation1 {
private int age;
private int EmpId;
public int getage() {
	return age;
}
public void setage(int age) {
	this.age=age;
}
public int getEmpId() {
	return EmpId;
}
public void setEmpId(int EmpId) {
	this.EmpId=EmpId;
}
}
class Encapusulation{
	public static void main(String[] args) {
		Encapuslation1 a1=new Encapuslation1();
		System.out.println("Employee age :"+a1.getage());
		System.out.println("Empoyee EmpId :"+a1.getEmpId());
		System.out.println("*****************************");
	     a1.setage(23);
	     a1.setEmpId(0303);
	     
		
	}
}
