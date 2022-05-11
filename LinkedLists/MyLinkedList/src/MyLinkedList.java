
public class MyLinkedList {

	private ListNode head; //the head of the linkedlist
	private int size; //the size of the linkedlist
	private ListNode tail; //the tail value in the linkedlist

	/**
	 * Instantiates the instance variables to default values
	 */
	public MyLinkedList() 
	{
		head = null;
		size = 1;
		tail = null;
	}

	/**
	 * instantiates the instance variables to default values and head to the val param
	 * @param val	- the head of the linkedlist
	 */
	public MyLinkedList(int val) 
	{
		head = new ListNode(val);
		head.next = null;
		size = 1;
		tail = head;
	}

	/**
	 * Adds value newVal to the linked list. Goes through and if the next node is
	 * null, we add the value.
	 * 
	 * @param newVal - the value we are adding to the linkedlist
	 */
	public void add(int newVal) 
	{
		size++;
		if (head == null)
		{
			head = new ListNode(newVal);
			tail = head;
		}
		else {
			ListNode curr = head;

			while (curr.next != null) 
			{
				curr = curr.next;
			}

			curr.next = new ListNode(newVal);
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
	public boolean contains(int target) 
	{
		ListNode curr = head;
		while (curr.next != null) 
		{
			if (curr.val == target) 
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
	public int get(int index)
	{
		if(index > size() || index < 0)
			throw new IndexOutOfBoundsException("No you dumbass");
		
		int count = 0;
		
		ListNode curr = head;
		
		while(curr != null)
		{
			if(count == index)
				return curr.val;
			++count;
			curr = curr.next;
		}
		
		return -1;
	}
	
	/**
	 * Looks throughout the linkedlist for a value. Returns the index of the value if it
	 * is in the linkedlist.
	 * @param target	- the value we are looking for
	 * @return			- returns the index of the target value or -1 if it is not in the linkedlist
	 */
	public int indexOf(int target)
	{
		ListNode c = head;
		int count = 0;
		
		while(c != null)
		{
			if(c.val == target)
				return count;
			
			count++;
			c = c.next;
		}
		
		return -1;
	}
	
	/**
	 * sets the newVal at the specified index
	 * @param newVal	- the new value we are replacing the index with
	 * @param index		- the location of where the new value will be placed
	 */
	public void set(int newVal, int index)
	{
		int count = 0;
		ListNode x = head;
		
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
	public int sizeRecursive(ListNode c)
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
	 * Removes the value in the linkedlist at index
	 * @param index	- the index we want to remove
	 * @return	- the removed value at the specified index
	 */
	public int remove(int index)
	{
		ListNode curr = head;
		int count = 0;
		size--;
		
		if(index == 0)
		{
			head = curr.next;
			return curr.val;
		}
		
		while(curr.next != null)
		{
			if(count == index-1)
			{
				int oo = curr.next.val;
				curr.next = curr.next.next;
				return oo;
			}
			
			count++;
			curr = curr.next;
		}
		
		return -1;

	}
	
	/**
	 * Adds a value at a specified index.
	 * @param newVal	- the value we want to add
	 * @param index		- the index of where we want to add the value at in the index
	 */
	public void add(int newVal, int index)
	{
		int count = 0;
		ListNode curr = head;
		ListNode w = new ListNode(newVal);
		
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
//				System.out.println(w);
				curr.next = w;
				break;
			}
			
			++count;
			curr = curr.next;
//			System.out.println(curr);
		}
	}

	// Prints out the values inside of the linked list.
	@Override
	public String toString() {
		String out = "[";
		ListNode curr = head;

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
	private class ListNode
	{
		int val; // does a private inner class need private instance variables?
		ListNode next;

		public ListNode(int val)
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
