import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Sets102 {

	public static void main(String[] args) {
		// good for contests
		//parsing words from a string to a set via an array and collection (ArrayList)
		
		//.split of the string class will use <space> as the delimiter to separate elements
		//"," and "-" are other common delimiters
		
		String[] words = "memes are dreams".split(" "); 
		
		//.asList() acts as a bridge between array-based and collection based APIs
		Set<String> set = new TreeSet<String>(Arrays.asList(words)); //you can use collection.toArray to go the other way
		System.out.println(set + "\n");
	}

}
