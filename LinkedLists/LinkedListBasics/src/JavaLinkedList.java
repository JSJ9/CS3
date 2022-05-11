import java.util.LinkedList;
import static java.lang.System.*;

public class JavaLinkedList
{
	private LinkedList<Integer> list;

	/**
	 * Instantiates list as a default linkedlist
	 */
	public JavaLinkedList()
	{
		list = new LinkedList<Integer>();
	}

	/**
	 * set linkedlist to the parameter nums
	 * @param nums	- the values put in linkedlist
	 */
	public JavaLinkedList(int[] nums)
	{
		list = new LinkedList<Integer>();
		for(int num : nums)
		{
			list.add(num);
		}
	}

	/**
	 * Returns the total of all of the values in the linkedlist
	 * @return
	 */
	public double getSum()
	{
		double total=0;
		
		for(int i : list)
			total += i;
		return total;
	}

	/**
	 * gets the total and divides it by the length of the linkedlist
	 * @return	- the average
	 */
	public double getAvg()
	{
		return getSum() / list.size();
	}

	/**
	 * looks for the largest number in the linkedlist
	 * @return	- the largest value in the linkedlist
	 */
	public int getLargest()
	{
		int largest = Integer.MIN_VALUE;
		
		for(int t : list)
		{
			if(t > largest)
				largest = t;
		}
		
		return largest;
	}

	/**
	 * looks for the smallest value in the linkedlist
	 * @return	- the smallest value in the linkedlist
	 */
	public int getSmallest()
	{
		int smallest = Integer.MAX_VALUE;
		
		for(int t : list)
		{
			if(t < smallest)
				smallest = t;
		}
		return smallest;
	}

	/**
	 * prints out the sum, average, smallest, and largest of a linkedlist
	 */
	public String toString()
	{
		String output="";
		
		output += "SUM:: " + getSum() + "\n" +
				  "AVERAGE:: " + getAvg() + "\n" + 
				  "SMALLEST:: " + getSmallest() + "\n" + 
				  "LARGEST:: " + getLargest() + "\n\n";
		return output;
	}
}