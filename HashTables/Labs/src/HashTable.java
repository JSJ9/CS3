
import java.util.LinkedList;
import java.util.Scanner;

public class HashTable
{
	private LinkedList[] table; //array that contains lists that holds linkedlists

	/**
	 * instantiates the table and each linkedlist in the array
	 */
	public HashTable( )
	{
		table = new LinkedList[10];
		for(int i = 0; i < table.length; i++)
		{
			table[i] = new LinkedList<Integer>();
		}
	}

	/**
	 * Adds a value to the hashtable based on its hashCode % 2.
	 * This determines its location.
	 * @param obj	- the value we are adding
	 */
	@SuppressWarnings("unchecked")
	public void add(Object obj)
	{
//		System.out.println("add");
		int i = obj.hashCode();

		Number n = new Number(i);
		int location = i % 10;

		if(!table[location].contains(n))
			table[location].add(n);

	}

	/**
	 * prints out the hashtable with bucket and each value in the bucket
	 */
	public String toString()
	{
		String output="HASHTABLE\n";

		for(int i = 0; i < table.length; i++)
		{
			output += "bucket " + i + ": ";
			
			for(int x = 0; x < table[i].size(); x++)
			{
				output += table[i].get(x) + " ";
			}
			
			output += "\n";
		}

		return output;
	}
}