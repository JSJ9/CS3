import java.util.LinkedList;

public class HashTableWordEdition {

	private LinkedList[] table;
	
	/**
	 * Instantiates the table and then instantiates each linkedlist
	 */
	public HashTableWordEdition()
	{
		table = new LinkedList[10];
		
		for(int i = 0; i < table.length; i++)
		{
			table[i] = new LinkedList<String>();
		}
	}
	
	/**
	 * adds a value onto the linkedlist on the table
	 * @param obj	- object we are adding onto the array
	 */
	@SuppressWarnings("unchecked")
	public void add(Object obj)
	{
		Word word = new Word(obj);
		int location = word.hashCode();
		
		if(!table[location].contains(word))
			table[location].add(word);
	}
	
	/**
	 * prints out the hashtable linkedlist values
	 */
	@Override
	public String toString()
	{
		String out = "HASHTABLE\n";
		
		for(int i = 0; i < table.length; i++)
		{
			out += "bucket " + i + " ";
			
			for(int x = 0; x < table[i].size(); x++)
			{
				out += table[i].get(x);
			}
			
			out += "\n";
		}
		
		return out;
	}
}
