import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Acronyms
{
	private Map<String,String> acronymTable; //map containing acronym and what they stand for

	/**
	 * instantiates the map into an empty map
	 */
	public Acronyms()
	{
		acronymTable = new TreeMap<String, String>();
	}

	/**
	 * puts the acronym and meaning into the map
	 * @param entry	- String containing acronym and meaning
	 */
	public void putEntry(String entry)
	{
		String fullPhrase = entry.substring(entry.indexOf(" ") + 3);
		String acronym = entry.substring(0, entry.indexOf(" "));
		acronymTable.put(acronym, fullPhrase);
	}

	/**
	 * Translates any acronyms into their definitions
	 * @param sent	- line that needs to be translated
	 * @return		- the translated line
	 */
	public String convert(String sent)
	{
		Scanner chop = new Scanner(sent);
		String output ="";

		while(chop.hasNext())
		{
			String h = chop.next();
			if(h.contains("."))
			{
				String temp = h.substring(0, h.length()-1);
				if(acronymTable.containsKey(temp))
					output += acronymTable.get(temp) + ". ";
				else
					output += h + " ";
			}
			else if(acronymTable.containsKey(h))
				output += acronymTable.get(h) + " ";
			else
				output += h + " ";
		}

		return output;
	}

	/**
	 * prints out the acronym table map
	 */
	public String toString()
	{
		String output = "{";
		Set<String> keys = acronymTable.keySet();
		Iterator<String> itr = keys.iterator();
		int count = 0;
		
		while(itr.hasNext())
		{
			String n = itr.next();
			if(count == 0)
				output += n + "=" + acronymTable.get(n) + "\n";
			else if(itr.hasNext())
				output += " " + n + "=" + acronymTable.get(n) + "\n";
			else
				output += " " + n + "=" + acronymTable.get(n) + "}";
			count++;
		}
		
		return output;
		
	}
}