package Assignment;

public class OwelOrConsonat {
	void VowelOrNot(char c1) {
		if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u') {
			System.out.println("Given char is vowel");
		}
		else {
			System.out.println("Given char is Consonant");
		}
	}
	
	
	
	
public static void main(String[] args) {
	OwelOrConsonat a1=new OwelOrConsonat();
	a1.VowelOrNot('o');
	a1.VowelOrNot('j');
	a1.VowelOrNot('i');
	a1.VowelOrNot('t');
	
}
}
