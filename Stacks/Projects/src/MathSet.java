//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	/**
	 * Instantiates set one and two
	 */
	public MathSet()
	{
		one = new TreeSet<Integer>();
		two = new TreeSet<Integer>();
	}

	/**
	 * This method populates the sets one and two with the parameters o and t
	 * @param o	- First string that will populate set one
	 * @param t	- Second string that will populate set two
	 */
	public MathSet(String o, String t)
	{
		this();
		String[] tempO = o.split(" ");
		String[] tempT = t.split(" ");
		
		for(String i : tempO)
			one.add(Integer.parseInt(i));
		
		for(String i : tempT)
			two.add(Integer.parseInt(i));
	}

	/**
	 * Combines set one and two together. No duplicates
	 * @return set with values of set one and two combines
	 */
	public Set<Integer> union()
	{
		Set<Integer> temp = new TreeSet<Integer>();
		temp.addAll(one);
		temp.addAll(two);
		return temp;
	}

	/**
	 * This method returns the values that are present in set one and two
	 * @return Set that contains values in set one and two
	 */
	public Set<Integer> intersection()
	{
//		System.out.println("one" + one);
		Set<Integer> temp = new TreeSet<Integer>();
		temp.addAll(one);
		temp.retainAll(two);
		return temp;
	}

	/**
	 * This method takes out the values that set two contains if set a has them
	 * @return returns the result of taking out set two values from set one
	 */
	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> temp = new TreeSet<Integer>();
		temp.addAll(one);
		temp.removeAll(two);
		return temp;
	}

	/**
	 * This method takes out all of the set one values from set two
	 * @return a set that has all of the values present in set one removed from set two
	 */
	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> temp = new TreeSet<Integer>();
		temp.addAll(two);
		temp.removeAll(one);
		return temp;
	}
	/**
	 * This method looks to see what values are present in set one OR set two
	 * @return Set of type Integer that contains the values that are present in set one OR two
	 */
	public Set<Integer> symmetricDifference()
	{		
		Set<Integer> temp = new TreeSet<Integer>();
		temp = union(); //puts all of the values together
		Set<Integer> intrsect = intersection(); //finds the values that are present in both sets
		temp.removeAll(intrsect); //gets rid of values present in both sets
		return temp;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}


}