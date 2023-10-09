package array;

public class Array2 {
public static void main(String[] args) {
	int age[]= {1,20,30,50,15};
	System.out.println("acessing element of array");
	System.out.println("First element of array :"+age[0]);
	System.out.println("Second elements of array :"+age[1]);
	System.out.println("third elements of array :"+age[2]);
	System.out.println("forth elements of array :"+age[3]);
	System.out.println("fith elements of array :"+age[4]);
	System.out.println("lengthof array :"+age.length);
	/*for(int i=0;i<age.length;i++) {
		if(age[i]==50) {
			System.out.println(age[i]);
		}
	}*/
	for(int a:age) {
		if (a==30) {
			System.out.println(a);
			break;
		}
	}
}
}
