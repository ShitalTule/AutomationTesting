package collection;

import java.util.Vector;

public class VectorCapacity {
public static void main(String[] args) {
	Vector v1=new Vector();
	System.out.println("Default Capacity of Vector :"+v1.capacity());
	System.out.println("Vector Elements Counts :"+v1.size());
	v1.setSize(3);
	System.out.println("Vector Elements are :"+v1);
	System.out.println("Defualt capacity of vector "+v1.capacity());
	System.out.println("Vector elements count :"+v1.size());
	v1.add("Mumbai");
	System.out.println("Vector Elements are :"+v1);
	System.out.println("Default capacity of vector is :"+v1.capacity());
	System.out.println("Vectorr Elements count :"+v1.size());
	
}
}
