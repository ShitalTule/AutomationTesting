package Construtor;

public class cons2 {
int roll;
double salary;
cons2(int r,double s){
	roll=r;
	salary=s;
}
void display() {
	System.out.println(roll+" "+salary);
	System.out.println("I Am Display Method");
}
public static void main(String[] args) {
	cons2 a1=new cons2(2023,5020.32);
	a1.display();
	cons2 a2=new cons2(2022,50.3654);
	a2.display();
	cons2 a3=new cons2(2021,20.321);
	a2.display();
}
}
