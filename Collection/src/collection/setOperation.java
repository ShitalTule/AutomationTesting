package collection;

import java.util.HashSet;

public class setOperation {
public static void main(String[] args) {
	HashSet<Integer> a1=new HashSet<Integer>();
	a1.add(1);
	a1.add(2);
	a1.add(3);
	a1.add(4);
	a1.add(5);
	System.out.println("elements of set a1 :"+a1);
	HashSet<Integer> a2=new HashSet<Integer>();
	a2.add(11);
	a2.add(12);
	a2.add(13);
	a2.add(14);
	a2.add(15);
	System.out.println("elements of set a2 :"+a2);
	a1.addAll(a2);
	System.out.println(a1);
	System.out.println(a1.clone());

	}
}
