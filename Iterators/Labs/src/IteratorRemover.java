import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;


public class IteratorRemover
{
	private ArrayList<String> list;
	private String toRemove;

	
	/**
	 * Sets list to line and sets toRemove to rem
	 * @param line 	input string
	 * @param rem 	value we want to remove
	 */
	public IteratorRemover(String line, String rem)
	{
		list = new ArrayList<String>(Arrays.asList(line));
		toRemove = rem;
	}

	/**
	 * A method that changes the test case everytime
	 * @param line	new test string
	 * @param rem	new value we want to remove
	 */
	public void setTest(String line, String rem)
	{
		list = new ArrayList<String>(Arrays.asList(line.split(" ")));
	}

	
	/**
	 * This method removes any value in the list that is equal to the value we want
	 * to remove
	 */
	public void remove()
	{
		ListIterator<String> here = list.listIterator();
		
		while(here.hasNext())
		{
			if(here.next().compareTo(toRemove) == 0)
				here.remove();
		}
	}

	public String toString()
	{
		return list.toString();
	}
}