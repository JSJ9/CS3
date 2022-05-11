import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UniquesDupes
{
	
	/**
	 * This method returns all of the values that occur at least once in the input. This is achieved
	 * by simply returning a treeset of the given values.
	 * @param input	- input placed by user
	 * @return		- returns the values that occur at least once in the input
	 */
	public static Set<String> getUniques(String input)
	{
		Set<String> uniques = new TreeSet<String>();
		// code
		String[] temp = input.split(" ");
		for(String i : temp)
			uniques.add(i);
		
		return uniques;
	}

	/**
	 * This method returns all of the values that occur more than one time in the input.
	 * This is achieved by adding all of the values to a set and if it has already been added to the set,
	 * we add those values to a separate TreeSet that will only contain that values that have already been added.
	 * @param input	- value entered by the user
	 * @return		- the set of values that have already been on the list more than one time
	 */
	public static Set<String> getDupes(String input)
	{
		// code

		String[] temp = input.split(" ");
		Set<String> testSet = new TreeSet<String>();
		Set<String> dupes = new TreeSet<String>();
		
		for(String i : temp)
		{
			if(!testSet.add(i)) //if already exist: false, else true.
				dupes.add(i);
		}
		
		if(dupes.isEmpty())
			return null;
		else
			return dupes;
	}
}