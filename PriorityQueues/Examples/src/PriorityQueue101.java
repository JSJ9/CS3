import java.util.*;

public class PriorityQueue101
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Queue<Integer> pQueue = new PriorityQueue<Integer>();
		
		pQueue.add(2);
		pQueue.offer(3);
		pQueue.add(6);
		pQueue.offer(1);
		pQueue.add(8);
		pQueue.offer(4);
		pQueue.add(5);
		pQueue.offer(9);
		
		
		
		System.out.println("Head: " + pQueue.peek());
		System.out.println("Head: " + pQueue.element()); //peek
		
		System.out.println(pQueue); //not "PQ" order
		
		for(Integer num : pQueue)
		{
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		//"PQ" order
		while(!pQueue.isEmpty())
		{
			System.out.print(pQueue.poll() + " ");
		}
	}

}
