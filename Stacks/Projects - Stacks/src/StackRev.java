import java.util.Stack;

public class StackRev
{
	public static void main(String[] args)
	{
		Stack<Integer> stck = new Stack<Integer>();
		
		stck.push(1);
		stck.push(4);
		stck.push(8);
		stck.push(99);
		stck.push(2);
		
		//not sorted
		System.out.println(stck);
		
		for(int i = 0; i < 0; i++)
		{
			System.out.println("hello");
		}
		
		System.out.println(stck.push(3));

	}
}
