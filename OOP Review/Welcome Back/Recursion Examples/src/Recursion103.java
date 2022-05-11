/**
 * Thjs example compares iterative and recursive methods of counting
 * @author janine jimenez
 *
 */


public class Recursion103
{

	/**
	 * Counts from a start value to an end value (inclusive) iteratively
	 * @param a start value
	 * @param b end value
	 */
	public static void count1(int a, int b) {
		for(int i = a; i <= b; i++)
			System.out.print(i + " ");
	}
	
	
	/**
	 * Counts from a start value to an end value (inclusive) recursively
	 * @param a start value
	 * @param b end value
	 */
	public static void count2(int a, int b)
	{
//		if(a <= b)
//		{
//			System.out.print(a + " ");
//			count2(a+1, b);
//		}
		
		System.out.print(a + " ");
		
		if(a < b)
			count2(++a, b);
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Calling iterative method:: " );
		count1(10, 25);

		System.out.println("\n\nCalling recursive method:: " );
		count2(10, 25);
	}

}
