package collection;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();// default capacity is 10, its capacity gets increase by 100% of its
													// size
		System.out.println("Default Capacity of Vector :" + v1.capacity());
		v1.add("Tiger");
		v1.add("Lion");
		v1.add("Deer");
		v1.add("Dog");
		v1.add("Elephant");
		v1.add("Rat");
		v1.add("Cat");
		v1.add("Cow");
		System.out.println("elements are :" + v1);
		for (String s1 : v1) {
			System.out.println(s1);
		}
System.out.println("elements size :"+v1.size());
	}
}
