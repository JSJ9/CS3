import static java.lang.System.*;
import java.util.*;

public class DupRunner extends UniquesDupes
{
	public static void main(String args[]) {
//		UniquesDupes ud = new UniquesDupes()
		
		String firstTest = "a b c d e f g h a b c d e f g h i j k";
		out.println("Original List: " + firstTest);
		out.println("Uniques : " + getUniques(firstTest));
		out.println("Dupes   : " + getDupes(firstTest) + "\n");

		
		String secondTest = "one two three one two three six seven one two";
		out.println("Original List: " + secondTest);
		out.println("Uniques : " + getUniques(secondTest));
		out.println("Dupes   : " + getDupes(secondTest) + "\n");
		
		String thirdTest = "1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6";
		out.println("Original List: " + thirdTest);
		out.println("Uniques : " + getUniques(thirdTest));
		out.println("Dupes   : " + getDupes(thirdTest) + "\n");
		
	}
}
