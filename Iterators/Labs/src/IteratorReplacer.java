import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class IteratorReplacer
{
	private ArrayList<Integer> list;
	private int toRemove, replaceWith;
	
	
	/**
	 * Instantiates line as the list, toRemove with the rem, and replaceWith to rep
	 * @param line	String input
	 * @param rem	value we want to remove
	 * @param rep	value we want to replace with the value we removed
	 */
	public IteratorReplacer(String line, String rem, String rep)
	{
		list = new ArrayList<Integer>();
		String[] temp = line.split(" ");
		
		for(int i = 0; i < temp.length; i++)
		{
			list.add(Integer.parseInt(temp[i]));
		}
		
		replaceWith = Integer.parseInt(rep);
		toRemove = Integer.parseInt(rem);
	}
	
	/**
	 * sets the new test cases everytime the user decides to enter new cases
	 * @param line	the new string case we are taking in
	 * @param rem	the value we want to remove
	 * @param rep	the value we want to replace with remove
	 */
	public void setEmAll(String line, String rem, String rep)
	{
		ArrayList<String> temp = new ArrayList<String>(Arrays.asList(line.split(" ")));
		
		replace();
		
		
	}
	
	/**
	 * Replaces the vaue that we do not want with the value that we DO want. If the char at 
	 * here.next() is equal to the value we want to remove, we remove the value and then
	 * add it back into the list
	 */
	public void replace() 
	{
		ListIterator<Integer> here = list.listIterator();
		
		while(here.hasNext())
		{
			if(here.next() == toRemove)
			{
				here.remove();
				here.add(replaceWith);
			}
		}
	}
	
	/**
	 * prints out the list after replacing and removing
	 */
	public String toString() {
		return list.toString() + "\n\n";
	}
}