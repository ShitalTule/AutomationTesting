package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HasMap_Set {
	public static void main(String[] args) {
		Map<Integer, String> a1 = new HashMap<Integer, String>();
		a1.put(1, "Ram");
		a1.put(2, "Ravan");
		a1.put(3, "Lanka");
		a1.put(4, "Shaym");
		a1.put(5, "Ram");
		System.out.println("map elements :" + a1);
		a1.put(5, "Tinu");// for duplicate key you won;t get error, it will simply replace that key value
							// with new value
		a1.put(0, "abc");
		System.out.println("Map Elements :" + a1);
		System.out.println("all keys frommap a1 :" + a1.keySet());
		System.out.println("all values from a1 :" + a1.values());
		System.out.println("get value form  keys 3 :" + a1.get(3));
		System.out.println("elements in map size :" + a1.size());
		for (Entry<Integer, String> e : a1.entrySet()) {
			System.out.println(e.getKey() + " :" + e.getValue());
		}
		Map<Integer, String> a2 = new HashMap<Integer, String>();
		a2.put(6, "Ram");
		a2.put(3, "Ravan");
		a2.put(7, "Lanka");
		System.out.println("a1 Elements :" + a1);
		System.out.println("a2 Elements :" + a2);
		a1.putAll(a2);
		System.out.println("after adding a1 and a2 :" + a1);

	}
}
/*
 * no index elements are stored on key-value pair key and value both should be
 * in form of object key should be unique and value can be duplicate to access
 * any value you must have valid key
 */
