import java.util.LinkedList;
import java.util.Queue;

public class Queues102 {
	public static void main(String[] args)
	{
		Queue<String> names = new LinkedList<String>();
		
		names.add("Vincent");
		names.add("Syed");
		System.out.println(names.add("Anthony"));
		System.out.println(names.add("Emma"));
		System.out.println(names.add("Ravi"));
		
		System.out.println("\nNumber of elements: " + names.size());
		
		System.out.println("\nprinting queue with loop: ");

		//cannot use a basic for loop because there is not a get() method in the Queue interface
//		for(int i = 0; i < names.size(); i++)
//		{
//			System.out.println(i + ". " + names.);
//		}
		
		for(String name : names)
			System.out.println(name);
		
		System.out.println();
		
		/////////////////////////////////////////////////////////////////////////////
		
		//peek() will return the element at the from of the queue but does NOT remove it
		
		System.out.print("The element at the head of the queue (index 0) is: ");
		System.out.println(names.peek());
		System.out.println("\n");
		
		//is empty returns true if there is nothing in the queue
		
		System.out.println("--- Dequeueing until (isEmpty == true) ---");
		
		while(!names.isEmpty())
		{
			System.out.println("Removing " + names.remove() + " from head of queue." + "\nEmpty Queue : " + names.isEmpty() + "\n");
		}
		
		//Empt Queue
		System.out.println("\n" + names + "\n" );
		
		System.out.print("The element at the front of the queue is : " );
		System.out.println(names.peek());
		System.out.println("\n");
		
		//remove() throws an exception, no such element exception if the queue is empty
//		names.remove();
		
	}
}
