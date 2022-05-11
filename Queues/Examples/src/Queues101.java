import java.util.Queue;
import java.util.LinkedList;

public class Queues101 {
	public static void main(String[] args)
	{
		//Queue is an interface
		Queue<Integer> queue;
		
		//LinkedList implements the Queue interface (A queue reference to a linked list)
		queue = new LinkedList<Integer>();
		
		//Elements are added at the tail (back) of the queue
		//to add an element is to enqueue it
		
		queue.add(42);
		queue.add(23);
		queue.add(90);
		queue.add(13);
		queue.add(21);
		
		System.out.println(queue);
		
		//removing elements - First in First out (FIFO)
		// dequeue is to remove elements from the queue
		// returns the element that was removed
		// Elements are removed from the head (front) of the queue
		
		System.out.println("removing: " + queue.remove());
		
		System.out.println(queue);
		
		queue.remove();
		queue.remove();
		
		System.out.println(queue);
		
		queue.add(1);
		
		System.out.println(queue);

		
		
	}
}
