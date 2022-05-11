import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SpanishToEnglish
{
	private Map<String,String> pairs; //tree map that will contain the "dictionary"

	/**
	 * Instantiates the map to a new map
	 */
	public SpanishToEnglish()
	{
		pairs = new TreeMap<String, String>();
	}

	/**
	 * inserts all of the "dictionary" values in the map
	 * @param entry	- the string containing the english and spanish word.
	 */
	public void putEntry(String entry)
	{
		String[] list = entry.split(" ");
		pairs.put(list[0], list[1]);
	}

	/**
	 * Translates a string by finding the key and returning the value at key.
	 * @param sent	- the string we want to translate
	 * @return		- Translated spanish string
	 */
	public String translate(String sent)
	{
		Scanner chop = new Scanner(sent);
		String output ="";

		while(chop.hasNext())
		{
			String tempKey = chop.next();
			output += pairs.get(tempKey) + " ";
		}

		return output;
	}

	/**
	 * this toString does something :)
	 */
	public String toString()
	{
		return pairs.toString().replaceAll("\\,","\n");
	}
}