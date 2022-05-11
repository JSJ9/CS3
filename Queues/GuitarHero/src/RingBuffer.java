import java.util.Arrays;

public class RingBuffer {
	
	private double[] data; // items in the buffer
	private int first; // index for the next dequeue or peek
	private int last; // index for the next enqueue
	private int size; // number of items in the buffer

	/** create an empty buffer, with given max capacity */
	public RingBuffer(int capacity) {
		// YOUR CODE HERE
		data = new double[capacity];
		first = 0;
		last = 0;
		size = 0;
	}

	/** return number of items currently in the buffer */
	public int size() {
		// YOUR CODE HERE
//		size = 0;
//		
//		for(double i : data)
//		{
//			if(i != 0)
//				size++;
//		}
		
		return size; // REPLACE
	}

	/** is the buffer empty (size equals zero)? */
	public boolean isEmpty() {
		return size() == 0 ? true : false;
	}

	/** is the buffer full (size equals array capacity)? */
	public boolean isFull() {
		return size() == data.length ? true : false;
	}

	/** add item x to the end */
	public void enqueue(double x) {
		size++;
		data[last] = x;
		last++;
		if(last == data.length)
			last = 0;
	}

	/** delete and return item from the front */
	public double dequeue() {
		double temp = data[first];
		size--;
		first++;
		
		if(first == data.length)
			first = 0;
		
		return temp; // REPLACE
	}

	/** return (but do not delete) item from the front */
	public double peek() {

		return data[first];
	}

	/** a simple test of the constructor and methods in RingBuffer */
	public static void main(String[] args) {
		int N = 100;
		RingBuffer buffer = new RingBuffer(N);
		for (int i = 1; i <= N; i++) {
			buffer.enqueue(i);
		}
		double t = buffer.dequeue();
		buffer.enqueue(t);
		System.out.println("Size after wrap-around is " + buffer.size());
		while (buffer.size() >= 2) {
			double x = buffer.dequeue();
			double y = buffer.dequeue();
			buffer.enqueue(x + y);
		}
		System.out.println(buffer.peek());

		/*
		 * Your program should produce the following output:
		 * 
		 * Size after wrap-around is 100 5050.0
		 */
	}
}
