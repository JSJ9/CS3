/**
 * This program compares the differences between post-rescursive
 * calls and pre-recursive
 * calls(aka tail recursion vs head recursion)
 * @author jj10094856
 *
 */

public class Recursion104
{
	
	/**
	 * Post-Recursive count 
	 * @param a starting value
	 * @param b ending value
	 */ 
	public static void count1(int a, int b) //called post recursion because base case is first, AND THEN call
	{
		if(a <= b) //exit condition (base case is not explicit)
		{
			System.out.print(a + " ");
			
			count1(a+1, b);
		}
	}
	
	
	/**
	 * Pre-Recursive count
	 * @param a start value
	 * @param b end value
	 */
	public static void count2(int a, int b) //Recursive call is coming before the base case
	{
		if(a <= b)
		{
			count2(a+1, b);
			System.out.print(a + " ");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Calling PostRecursive Count Method");
		count1(10, 20);
		
		System.out.println("\n\nCalling PreRecursive Count Method");
		count2(10, 20);
	}
}
