import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;

	public OddEvenSets()
	{
		odds = new TreeSet<Integer>();
		evens = new TreeSet<Integer>();
	}

	public OddEvenSets(String line)
	{
		this();
		String[] temp = line.split(" ");
		Set<Integer> all = new TreeSet<Integer>();
		
		for(int i = 0; i < temp.length; i++)
		{
			int val = Integer.parseInt(temp[i]);
			
			if(all.add(val))
			{
				if(val % 2 == 0)
					evens.add(val);
				else
					odds.add(val);
			}
		}
		
		System.out.println(toString());
		
	}
	
	public String toString() 
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}
