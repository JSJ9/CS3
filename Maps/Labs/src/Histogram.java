import java.util.Map;
import java.util.TreeMap;

public class Histogram
{
	private Map<String,Integer> histogram; //histogram that contains values and the occurrence

	/**
	 * Instantiates the histogram
	 */
	public Histogram()
	{
		//call setSentence
		histogram = new TreeMap<String, Integer>();
	}

	/**
	 * Instantiates the histogram and then populates the map using the setSentence method
	 * @param sent	- the string the pass in that holds value
	 */
	public Histogram(String sent)
	{
		histogram = new TreeMap<String, Integer>();
		setSentence(sent.split(" "));
	}
	
	/**
	 * populates the map and controls values and occurrence of said values
	 */
	public void setSentence(String[] s)
	{
		for(String x : s)
		{
			if(histogram.containsKey(x))
				histogram.put(x, histogram.get(x) + 1);
			else
				histogram.put(x, 1);
		}
	}

	/**
	 * prints out the characters and the stars that show the occurrence of the character
	 */
	public String toString()
	{
		String output="char\t1---5----10\n";
		
		for(String x : histogram.keySet())
		{
			output += x + "\t";
			int stars = histogram.get(x);
			
			for(int i = 0; i < stars; i++)
				output += "*";
			output += "\n";
		}
		
		return output+"\n";
	}
}