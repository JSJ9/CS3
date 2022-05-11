import java.util.LinkedList;
import java.util.Queue;

public class Queues103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> names = new LinkedList<String>();
		
		names.offer("Vincent");
		names.offer("Syed");
		System.out.println(names.offer("Anthony"));
		System.out.println(names.offer("Emma"));
		System.out.println(names.offer("Ravi"));

		System.out.println("\n" + names);
		
		//poll() returns and removes elements in FIFO order
		//This method differs from remove only that it returns null if the queue is empty
		//remove will break things
		names.poll(); // poll out
		System.out.println("\n" + names);
		
		//element() will return the element at the start but does not remove it
		//this method differs from peek only in that it throws and exception if the queue is empty
		System.out.println(names.element()); //returns the value at index 0 will throw an exception
		
		
	}

}
