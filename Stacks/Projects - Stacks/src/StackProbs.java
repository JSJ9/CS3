import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class StackProbs
{

	/**
	 * Instantiates and places values inside of the stack
	 * @param nums	- array of values being pushed onto the stack
	 * @return	the stack after it is instantiated and populated
	 */
	public static Stack<Integer> makeStack(int[] nums)
	{
		Stack<Integer> stack = new Stack<>();
		for (int num : nums)
			stack.push(num);
		return stack;
	}

	/**
	 * Double up goes through the stack and prints out the value at each index and prints out the value twice.
	 * @param nums	- the stack we are going through
	 * @return	the value at each index twice.
	 */
	public Stack<Integer> doubleUp(Stack<Integer> nums)
	{
		Iterator<Integer> itr = nums.iterator();
		Stack<Integer> output = new Stack<Integer>();
		while (itr.hasNext())
		{
			int temp = itr.next();
			output.push(temp);
			output.push(temp);
		}
		return output;
	}

	/**
	 * Goes through the stack. If it is negative it is added to the neg stack, else it is added to the positive stack.
	 * We then push all of the negative values in the stack first and then we push the positive values.
	 * @param nums	- the stack we go through
	 * @return		- the new stack with negatives first and positives second.
	 */
	public Stack<Integer> posAndNeg(Stack<Integer> nums)
	{
		Iterator<Integer> itr = nums.iterator();
		Stack<Integer> neg = new Stack<Integer>();
		Stack<Integer> pos = new Stack<Integer>();
		Stack<Integer> output = new Stack<Integer>();

		while (itr.hasNext())
		{
			int temp = itr.next();
			if (temp < 0)
				neg.push(temp);
			else
				pos.push(temp);
		}

		itr = neg.iterator();

		while (itr.hasNext())
		{
			output.push(itr.next());
		}

		itr = pos.iterator();

		while (itr.hasNext())
		{
			output.push(itr.next());
		}

		return output;
	}

	/**
	 * moves over values to the right side of the stack
	 * @param nums	- total stack values
	 * @param n		- the amount of values we want to shift
	 * @return		- returns the new stack with values shifted
	 */
	public Stack<Integer> shiftByN(Stack<Integer> nums, int n)
	{
//		Iterator<Integer> itr = nums.iterator();
//		Stack<Integer> tempStack = new Stack<Integer>();
//		Stack<Integer> output = new Stack<Integer>();
//		int count = 0;
//		
//		while(itr.hasNext() && count < n)
//		{
//			count++;
//			int temp = itr.next();
//			tempStack.push(temp);
//		}
//		
//		while(itr.hasNext())
//		{
//			int temp = itr.next();
//			output.push(temp);
//		}
//		
//		itr = tempStack.iterator();
//		
//		while(itr.hasNext())
//		{
//			int temp = itr.next();
//			output.push(temp);
//		}
//		
//		
//		return output;

		// so there is a method that does all of this for you
		// Collections.rotate(nums, n)
		// yeah... i know.

		Collections.rotate(nums, n + 2);

		return nums;

	}

	/**
	 * Goes through all of the values of the string and places each char in the all stack. We then go through that stack and check for any vowels.
	 * If there are vowels, the character is added to the stack of vowels. We go through the string one more time and see if it is a vowel or not.
	 * If it is, the set the next value to a vowels.pop(). If the character is not a value it is left alone.
	 * @param str
	 * @return
	 */
	public String reverseVowels(String str)
	{
		
		Stack<Character> vowels = new Stack<Character>();
		Stack<Character> all = new Stack<Character>();
		
		String checkVow = "AEIOUaeiou";

		//populating the stack
		for (int i = 0; i < str.length(); i++)
			all.push(str.charAt(i));
		
		
		//populating the vowels stack
		for (int i = 0; i < str.length(); i++)
		{
			for (int x = 0; x < checkVow.length(); x++)
			{
				if(str.charAt(i) == checkVow.charAt(x))
					vowels.push(str.charAt(i));
			}
		}
		
//		System.out.println("vowels stack: " + vowels);
		
		Iterator<Character> itr = all.iterator();
		String output = "";
		while(itr.hasNext()) {
			char temp = itr.next();
			
			if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp =='u')
				output += "" + vowels.pop();
			else
				output += "" + temp;
		}


		return output;
	}

}
