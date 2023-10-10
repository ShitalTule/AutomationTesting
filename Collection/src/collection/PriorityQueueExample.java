package collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		Queue<Integer> v1 = new PriorityQueue<Integer>();
		//// while adding element in Queue, it will always keep smallest element on the
		//// top
		v1.add(123);
		v1.add(50);
		v1.add(245);
		v1.add(10);
		v1.add(70);
		v1.add(55);
		v1.add(250);
		v1.add(5);
		System.out.println("size :" + v1.size());
		System.out.println("Elements of Queue :" + v1);

		/*
		 * element() returns top most element of the queue, if the queue if empty dn it
		 * will throw an exception by name 'NoSuchElementException'
		 */
		System.out.println("Head elements of queue using element() :" + v1.element());
		/*
		 * peek() returns top most element of the queue, if the queue if empty dn it
		 * will return 'null' instead of throwing exception
		 */

		System.out.println("Head Elements of Queue using peek() :" + v1.peek());
		System.out.println("Iterating Elements using for each loop");
		for (Object obj : v1) {
			System.out.println(obj);
		}
		System.out.println("iterating elements of Queue using iterator ");
		Iterator itr = v1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Elements of Queue :" + v1);
		/*
		 * it will remove top most element of the Queue, if the queue is empty dn it
		 * will throw an exception by name 'NoSuchElementException'
		 */
		System.out.println("Removing elements of Queue using remove() :" + v1.remove());
		System.out.println("Elements of Queue :" + v1);
		/*
		 * it will remove top most element of the Queue, if the queue is empty dn it
		 * will return 'null' value
		 */
		System.out.println("Removing of Elements using poll :" + v1.poll());//
		System.out.println("Elements of Queue :" + v1);
		System.out.println("After Removing Two Elements ");
		Iterator itr1 = v1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("*************************************");
//using lamda expression
		v1.forEach(obj -> {
			System.out.println(obj);
		});

	}
}
