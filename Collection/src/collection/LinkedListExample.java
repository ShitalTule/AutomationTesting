package collection;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<String> a1 = new LinkedList<String>();
		System.out.println("initail list of elements :" + a1);
		a1.add("Vijay");
		a1.add("Ravi");
		a1.add("Ajay");
		System.out.println("after invoking add(e a) method :" + a1);
		// Adding an element at the specific position
		a1.add(1, "Gaurav");
		System.out.println("after calling add(index ,e elements) method :" + a1);
		LinkedList<String> a2 = new LinkedList<String>();
		a2.add("Sonu");
		a2.add("Hanumant");
		// Adding second list elements to the first list
		a1.addAll(a2);
		System.out.println("after invokin addAll(Collection>? extends E>c) method :" + a1);
		LinkedList<String> a3 = new LinkedList<String>();
		a3.add("Joan");
		a3.add("Rahul");
		// Adding second list elements to the first list at specific position
		a1.addAll(1, a3);
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method:" + a1);
		// Adding an element at the first position
		a1.addFirst("Lokesh");
		System.out.println("After invoking addFirst(E e) method: " + a1);
		// Adding an element at the last position
		a1.addLast("Harsh");
		System.out.println("After invoking addLast(E e) method: " + a1);
	}
}
