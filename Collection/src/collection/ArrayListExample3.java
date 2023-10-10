package collection;

import java.util.ArrayList;

public class ArrayListExample3 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();// Generic
		a1.add(12);
		ArrayList<Boolean> a2 = new ArrayList<Boolean>();// Generic
		a2.add(true);
		ArrayList<Character> a3 = new ArrayList<Character>();// Generic
		a3.add('a');
		ArrayList<String> a4 = new ArrayList<String>();
		a4.add("Ajay");
		a4.add("Vijay");
		a4.add("Anuj");
		a4.add("Ravi");
		a4.add("Gaurav");
		System.out.println("An initail Elements of list :" + a4);
		System.out.println("Removing Vijay from list :" + a4.remove("Vijay"));// Removing specific element from
																				// arraylist
		System.out.println("After invoking remove(object) method: " + a4);

		// Removing element on the basis of specific position
		System.out.println("remove index 0 from collection: " + a4.remove(0));
		System.out.println("After invoking remove(index) method: " + a4);
		System.out.println("***********************************************");
		// Creating another arraylist
		ArrayList<String> b1 = new ArrayList<String>();
		b1.add("Ravi");
		b1.add("hanumant");
		// Adding new elements to arraylist
		b1.addAll(b1);
		System.out.println("Updated list :" + b1);
		// Removing all the new elements from arraylist
		b1.removeAll(b1);
		System.out.println("After invoking removeall() :" + b1);
		// Removing elements on the basis of specified condition
		/*if (b1.contains("Ravi")) {
			b1.remove("Ravi");
		}*/
		// Or
		
		b1.removeIf(b2 -> b2.contains("Ravi"));
		System.out.println("After invoking removeIf() :" + b1);
		// Removing all the elements available in the list
		b1.clear();
		System.out.println("After calling clear() :" + b1);

	}
}
