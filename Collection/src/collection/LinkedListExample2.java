package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample2 {
	public static void main(String[] args) {
		LinkedList<String> a1 = new LinkedList<String>();
		System.out.println("Initial list of elements: " + a1);
		a1.add("Ravi");
		a1.add("Vijay");
		a1.add("Ajay");
		System.out.println("After invoking add(E e) method: " + a1);
		ListIterator itr = a1.listIterator();
		System.out.println(itr.hasPrevious());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.hasPrevious());
		System.out.println(itr.previous());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
	}
}
