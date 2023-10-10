package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Mango");
		a1.add("banana");
		a1.add(123);
		a1.add("Apple");
		System.out.println("size of list :" + a1.size());
		System.out.println("Elements in array list :" + a1);
		// accessing particular element
		System.out.println(a1.get(3));
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("Traversing list through for-each loop:");
		// Traversing list through for-each loop
		for (Object a2 : a1) {
			System.out.println(a2);
		}
//changing the element
		a1.set(2, "Cheri");
		System.out.println("size of list :" + a1.size());
		System.out.println("Elements of lis :" + a1);
//Sorting the list
		Collections.sort(a1);// by default it sort the passed collection element in assending order and store
								// it in the same collection
		System.out.println("size of list :" + a1.size());
		System.out.println("EElements of list :" + a1);
		System.out.println("Traversing list through forEach() method:");
// The forEach() method is a new feature, introduced in Java 8.
		a1.forEach(a -> {
			System.out.println(a);
		});
		System.out.println("Traversing list through Iterator interface:");
		Iterator itr = a1.iterator();
		/**
		 * List element: [123,Banana,Dates,Mango] Iterator is a Interface in collection,
		 * which is used to iterate collection elements Iterator interface has following
		 * method to iterate collection elements 1. hasNext() ---> boolean --> true next
		 * element is present, false no next element 2. next() ---> Object --> it will
		 * return next element from collection 3. remove() --> void --> element deletion
		 * Iterator object can be use to iterate a collection only once, for 2nd
		 * iteration create new Iterator object
		 */
//System.out.println(itr.hasNext());
//System.out.println(itr.next());//123
//System.out.println(itr.next());//Dates
//System.out.println(itr.next());//Grapes
//System.out.println(itr.next());//Mango
//System.out.println(itr.next());//NoSuchElementException exception
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*******with new Iterator Object************");
		Iterator itr2 = a1.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}
}
