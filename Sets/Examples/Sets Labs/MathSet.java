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

	public MathSet()
	{
		one = new TreeSet<Integer>();
		two = new TreeSet<Integer>();
	}

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

	public Set<Integer> union()
	{
		Set<Integer> temp = new TreeSet<Integer>();
		temp.addAll(one);
		temp.addAll(two);
		return temp;
	}

	public Set<Integer> intersection()
	{
//		System.out.println("one" + one);
		Set<Integer> temp = new TreeSet<Integer>();
		temp.addAll(one);
		temp.retainAll(two);
		return temp;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> temp = new TreeSet<Integer>();
		temp.addAll(one);
		temp.removeAll(two);
		return temp;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> temp = new TreeSet<Integer>();
		temp.addAll(two);
		temp.removeAll(one);
		return temp;
	}
	
	public Set<Integer> symmetricDifference()
	{		
		Set<Integer> temp = new TreeSet<Integer>();
		temp = union();
		Set<Integer> intrsect = intersection();
		temp.removeAll(intrsect);
		return temp;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}


}