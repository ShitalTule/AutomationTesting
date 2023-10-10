package collection;

import java.util.Vector;

public class VectorExample2 {
	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		System.out.println("Default capacity :" + v1.capacity());
		v1.add("Loin");
		v1.add("Tiger");
		v1.add("Deer");
		v1.add("Lion");
		v1.add("Dog");
		v1.add("Cat");
		v1.add("Rat");
		v1.add("Cow");
		v1.add("Elephant");
		v1.add("Lion");
		System.out.println("Elements are :" + v1);
		v1.addElement("Mat");
		System.out.println("Vector Capacity :" + v1.capacity());
		System.out.println("Elements are :" + v1);
		for (String s1 : v1) {
			System.out.println(s1);
		}
		// Additional method of vector
		System.out.println("Return Frist Elements :" + v1.firstElement());
		System.out.println("Return Last Elements :" + v1.lastElement());
		System.out.println("Last index of lion :" + v1.lastIndexOf("Loin"));
		System.out.println("clone v1 :" + v1.clone());
		System.out.println(v1.elementAt(1));

	}
}
