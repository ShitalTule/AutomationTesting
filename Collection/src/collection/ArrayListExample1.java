package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {
	public static void main(String[] args) {
		List a1 = new ArrayList();// Creating arraylist - default size is 10
		a1.add("Mango");// auto-upcasting from String to Object class object
		a1.add(1234);// first boxing for int to Integer class object---> upcasting to object class
		a1.add("Banana");// ");// auto-upcasting from String object to Object class object
		a1.add("Apple");// auto-upcasting from String object to Object class object
		a1.add("null");
		a1.add('c');// first boxing for char to Character class object---> upcasting to object class
		a1.add(15.20);// first boxing for double to Double class object---> upcasting to object class
		a1.add(true);// first boxing for boolean to Boolean class object---> upcasting to object
						// class
		a1.add(new ArrayListExample1());// ArrayListExample0 class object will be upcasted to Object class object
		a1.add("Banana");// duplicate
		System.out.println("size of list :" + a1.size());// Printing the arraylist object
		System.out.println("Elements of list :" + a1);// toString overrided in Collection
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
			System.out.println("*****************************");
			System.out.println("Traversing list through for-each loop:");
			// Traversing list through for-each loop
			for (Object fruit : a1) {
				System.out.println(fruit);
			}
			System.out.println("********************************");
			System.out.println("before update, Elements of list: " + a1);
// accessing the element 
			System.out.println("returning elements :" + a1.get(1));
			a1.set(1, "dates");
			System.out.println("size of list :" + a1.size());
			System.out.println("elements of list :" + a1);

		}
	}
}
