import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps102 {
	public static void main(String[] args) 
	{
		Map<Character, Integer> mapOne = new TreeMap<Character, Integer>();
		
		String s = "yo momma";
		
		for(char c : s.toCharArray())
		{
			if(mapOne.get(c) == null) //map does not contain key
				mapOne.put(c, 0);
			
			mapOne.put(c, mapOne.get(c) + 1); //increment count with matching key by one
		}
		
		System.out.println(mapOne.get('o'));
		System.out.println(mapOne.get('m'));
		System.out.println(mapOne.get(' '));
		System.out.println(mapOne.get('x'));
		System.out.println(mapOne);

		System.out.println("\n*******************************************************\n");

		//Alternative approach
		
		Map<Character, Integer> mapTwo = new HashMap<Character, Integer>();

		for(char c  : s.toCharArray())
		{
			if(mapTwo.containsKey(c)) //containsValue(v) also exists
				mapTwo.put(c, mapTwo.get(c) + 1);
			else
				mapTwo.put(c,  0);
		}
		
		System.out.println(mapTwo.get('o'));
		System.out.println(mapTwo.get('m'));
		System.out.println(mapTwo.get(' '));
		System.out.println(mapTwo.get('x'));
		System.out.println(mapTwo);
	}
}
