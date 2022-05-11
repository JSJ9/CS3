
public class MyQueue<T> implements QueueADT
{
	/**
	 * backbone of the queue
	 */
	private MyLinkedList<T> queue;

	public MyQueue()
	{
		queue = new MyLinkedList<T>();
	}
	
	public MyQueue(T... vars)
	{
		queue = new MyLinkedList<T>(vars);
	}
	
	@Override
	public void offer(Object item)
	{
		queue.add((T) item);
	}

	@Override
	public Object poll()
	{
		return queue.remove(0);
	}

	@Override
	public Object peek()
	{
		return queue.get(0);
	}

	@Override
	public int size()
	{
		return queue.size();
	}

	@Override
	public boolean isEmpty()
	{
		return queue.isEmpty();
	}

	@Override
	public void clear()
	{
		queue = new MyLinkedList<T>();		
	}
	
}
