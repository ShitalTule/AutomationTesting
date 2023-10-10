package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample2 {
public static void main(String[] args) {
	Queue a1=new PriorityQueue();
	System.out.println("size of Queue :"+a1.size());
	System.out.println("Elements of Queue :"+a1);

	// peek() returns top most element of the queue, if the queue if empty dn it
	// will return 'null' instead of throwing exception
	System.out.println("head element of the queue using peek():" + a1.peek());
	// element() returns top most element of the queue, if the queue if empty dn it
	// will throw an exception by name 'NoSuchElementException'
	System.out.println("head element of the queue using element():" + a1.element());


}
}
