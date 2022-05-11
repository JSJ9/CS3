
public class Recursion102
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Calling iterative method:: ");
		skip1(4);
		
		System.out.println("\n\nCalling recursive method:: " );
		skip2(3);

	}
	

	
	//Iterative Skip
	public static void skip1(int n) {
		for(int i = 1; i <= n; i++)
			System.out.println("<skip>");
		
	}

	//Recursive Skip
	public static void skip2(int n) {
		
		if(n > 0) //Exit condition
		{
			System.out.println("<skip>");
			System.out.println("Pushing " + n + " on to the stack");
			skip2(n-1);
			System.out.println("Popping " + n + " off the stack");
		}
	}
}
