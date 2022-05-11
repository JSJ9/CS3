import java.util.Set;
import java.util.HashSet;

public class HashSet101 {

	public static void main(String[] args)
	{
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(3);
		nums.add(2);
		System.out.println(nums.add(6)); //returns boolean statement
		System.out.println("nums: " + nums);
		
		
		System.out.println(nums.add(6)); //duplicates will not be added
		System.out.println("nums: " + nums);
		
		System.out.println(nums.add(-4)); // the absolute value of natural ordering is maintained
		System.out.println("nums: " + nums);

		//removing elements...
		System.out.println(nums.remove(2)); //returns true or false if in list, then removes it
		System.out.println(nums.remove(5)); //returns false
		System.out.println("nums: " + nums + "\n");
		
		System.out.println("=====================================\n");
		
		Set<String> words = new HashSet<String>();
		words.add("rock");
		words.add("paper");
		System.out.println(words.add("scissors"));
		System.out.println("words: " + words + "\n");

		System.out.println(words.add("rock")); //string already exists, so false
		System.out.println("words: " + words + "\n");
		
		System.out.println(words.add("lizard")); //string already exists, so false
		System.out.println("words: " + words + "\n");

		//removing
		System.out.println(words.remove("scissors"));
		System.out.println(words.remove("spock"));
		System.out.println("words: " + words + "\n");




	}
}
