
public class MyLinkedList<T> {

	private ListNode<T> head;
	private int size;
	private ListNode<T> tail;

	/**
	 * instantiates and sets the instance variables to default values
	 */
	public MyLinkedList() 
	{
		head = null;
		size = 1;
		tail = null;
	}

	/**
	 * instantiates instance variables and sets head to the new value
	 * @param val	- the new value in the linkedlist
	 */
	public MyLinkedList(T val) 
	{
		head = new ListNode<T>(val);
		head.next = null;
		size = 1;
		tail = head;
	}
	
	/**
	 * Instantiates the linkedlist using multiple parameters specified by
	 * the user
	 * @param vals	- the values user would like to put in the linkedlist
	 */
	public MyLinkedList(T... vals)
	{
		for(T x : vals)
		{
			add(x);
			size++;
		}
	}

	/**
	 * Adds value newVal to the linked list. Goes through and if the next node is
	 * null, we add the value.
	 * 
	 * @param newVal - the value we are adding to the linkedlist
	 */
	public void add(T newVal) 
	{
		size++;
		if (head == null)
		{
			head = new ListNode<T>(newVal);
			tail = head;
		}
		else {
			ListNode<T> curr = head;

			while (curr.next != null) 
			{
				curr = curr.next;
			}

			curr.next = new ListNode<T>(newVal);
			tail = curr.next;
		}
		
		
	}

	/**
	 * seems to work fine. Goes through the linked list and checks if the current
	 * node value is equal to the target value
	 * 
	 * @param target - the target value we're looking for
	 * @return - true if it is in the linkedlist, false if not
	 */
	public boolean contains(T target) 
	{
		ListNode<T> curr = head;
		while (curr.next != null) 
		{
			if (curr.val.equals(target)) 
			{
				return true;
			}

			curr = curr.next;
		}

		return false;
	}

	/**
	 * gets the value at the specified index. 
	 * @param index	- the index that we are looking at
	 * @return		- the value at the index
	 */
	public T get(int index)
	{
		if(index > size() || index < 0)
			throw new IndexOutOfBoundsException("No you dumbass");
		
		int count = 0;
		
		ListNode<T> curr = head;
		
		while(curr != null)
		{
			if(count == index)
				return curr.val;
			++count;
			curr = curr.next;
		}
		
		return null;
	}
	
	/**
	 * Looks throughout the linkedlist for a value. Returns the index of the value if it
	 * is in the linkedlist.
	 * @param target	- the value we are looking for
	 * @return			- returns the index of the target value or -1 if it is not in the linkedlist
	 */
	public String indexOf(String target)
	{
		ListNode<T> c = head;
		int count = 0;
		
		while(c != null)
		{
			if(c.val.equals(target))
				return count + "";
			
			count++;
			c = c.next;
		}
		
		return "not found";
	}
	
	/**
	 * sets the newVal at the specified index
	 * @param newVal	- the new value we are replacing the index with
	 * @param index		- the location of where the new value will be placed
	 */
	public void set(T newVal, int index)
	{
		int count = 0;
		ListNode<T> x = head;
		
		if(index > size() || index < 0)
			throw new IndexOutOfBoundsException();
		
		while(x.next != null)
		{
			if(count == index)
			{
				x.val = newVal;
				break;
			}
			
			x = x.next;
			count++;
		}
	}

	/**
	 * Goes through the linkedlist and adds to the size varaible as long as the 
	 * next value in the linkedlist is not null. If it is, the while loop is broken
	 * and size is returned.
	 * @return	- value of size
	 */
	public int size() {

		return size;
	}
	
	/**
	 * goes through the linkedlist recursively. same basis as size() but recursively
	 * @param c	- the current listnode on the linkedlist
	 * @return	- the size of the linkedlist
	 */
	public int sizeRecursive(ListNode<T> c)
	{
		if(c.next == null)
			return 0;
		else
			return sizeRecursive(c.next) + 1;
	}
	
	/**
	 * checks if the linkedlist is empty or not based on the value returned by size()
	 * @return	 - true if size is equal to 0, false if not.
	 */
	public boolean isEmpty()
	{
		return size() == 0;
	}
	
	/**
	 * Goes through the linkedlist and finds if count is one less than the index
	 * we are looking for, if so, we skip the value at the next index and return
	 * the value we removed
	 * @param i	 	- the location/index of what we want to remove
	 * @return			- the value at the removed index
	 */
	public T remove(int i)
	{
		ListNode<T> curr = head;
		int count = 0;
		size--;
		
		if(i == 0)
		{
			head = curr.next;
			return curr.val;
		}
		
		while(curr.next != null)
		{
			if(count == i-1)
			{
				T oo = curr.next.val;
				curr.next = curr.next.next;
				return oo;
			}
			
			count++;
			curr = curr.next;
		}
		
		return null;

	}
	
	/**
	 * Goes through the linkedlist, looks if it is one behind the specified
	 * index and if so, it will add the value in the linkedlist at the index.
	 * @param newVal	- the new value we want to add
	 * @param index		- the index where we want to add the newVal
	 */
	public void add(T newVal, int index)
	{
		int count = 0;
		ListNode<T> curr = head;
		ListNode<T> w = new ListNode<T>(newVal);
		
		if(index == 0)
		{
			w.next = head;
			head = w;
		}
		while(curr.next != null && count <= index)
		{
			if(count == index-1)
			{
				w.next = curr.next;
				curr.next = w;
				break;
			}
			
			++count;
			curr = curr.next;
		}
	}

	// Prints out the values inside of the linked list.
	@Override
	public String toString() {
		String out = "[";
		ListNode<T> curr = head;

		while (curr != null) 
		{
			out += curr.val;
			
			if (curr.next != null)
				out += ", ";
	
			curr = curr.next;
		}

		out += "]";

		return out;
	}

	// class for listnode
	@SuppressWarnings("hiding")
	private class ListNode<T>
	{
		T val; // does a private inner class need private instance variables?
		ListNode<T> next;

		public ListNode(T val)
		{
			this.val = val;
		}

		@Override
		public String toString() 
		{
			return "" + this.val;
		} // for printing / debug
	}

}
