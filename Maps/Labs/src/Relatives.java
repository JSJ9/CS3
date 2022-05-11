import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Relatives
{
	private Map<String, Set<String>> map;

	public Relatives()
	{
		map = new TreeMap<String, Set<String>>();
	}

	/**
	 * populates the map with relatives
	 * 
	 * @param line - the line that has the relative
	 */
	public void setPersonRelative(String line)
	{
		Set<String> temp;
		String[] personRelative = line.split(" ");

		if (map.get(personRelative[0]) != null)
		{
			temp = map.get(personRelative[0]);
			temp.add(personRelative[1]);
			map.put(personRelative[0], temp);
		} else
		{
			temp = new TreeSet<String>();
			temp.add(personRelative[1]);

			map.put(personRelative[0], temp);
		}
	}

	/**
	 * retrieves the set from the key last name.
	 * 
	 * @param person - the person we are getting relatives from
	 * @return - string of people
	 */
	public String getRelatives(String person)
	{
		String output = person + " is related to ";
		
		Set<String> vals = map.get(person);
		
		Iterator<String> s = vals.iterator();
		int count = 0;
		
		while(s.hasNext())
		{
			if(count < vals.size()-1)
				output += s.next() + ", ";
			else
				output += s.next();
			count++;
		}

		return output;
	}

}