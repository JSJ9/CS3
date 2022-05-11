import java.util.LinkedList;
import java.util.Queue;

public class EvensFirst
{
	
	/**
	 * Goes through the queue and checks if the integer is odd or even.
	 * If it is even, then it is put into the output queue first. If it
	 * is odd, then it is placed inside of another queue and then added to the
	 * output queue.
	 * @param nums	- the list of integers before we put evens first.
	 * @return	- a queue where the even values from nums is listed first
	 */
	public Queue<Integer> putEvensFirst(Queue<Integer> nums)
	{
		Queue<Integer> output = new LinkedList<Integer>();
		Queue<Integer> odds = new LinkedList<Integer>();
		
//		System.out.println("putevensfirst called");
		while (!nums.isEmpty())
		{
			int temp = nums.poll(); //the temporary value
			
			if(temp % 2 == 0)
				output.offer(temp);
			else
				odds.offer(temp);
		}
		
		output.addAll(odds);

		return output;
	}
}
