import java.util.LinkedList;
import java.util.Queue;

public class EvensFirstRunner
{
	public static void main(String[] args)
	{
		EvensFirst ef = new EvensFirst();
		
		//test 1
		
		Queue<Integer> test1 = new LinkedList<Integer>();
		test1.offer(3);
		test1.offer(5);
		test1.offer(4);
		test1.offer(17);
		test1.offer(6);
		test1.offer(83);
		test1.offer(1);
		test1.offer(84);
		test1.offer(16);
		test1.offer(37);

		System.out.println("Test 1\n----------------------------\n" + test1);
		
		Queue<Integer> out = ef.putEvensFirst(test1);
		
		System.out.println(out);
		
		//test 2
		
		Queue<Integer> test2 = new LinkedList<Integer>();
		
		test2.offer(1);
		test2.offer(2);
		test2.offer(3);
		test2.offer(4);
		test2.offer(5);
		test2.offer(6);
		test2.offer(7);
		test2.offer(8);
		test2.offer(9);
		test2.offer(10);
		
		System.out.println("\n\nTest 2\n----------------------------\n" + test2);

		out = ef.putEvensFirst(test2);
		
		System.out.println(out);
		
		//test 3
		
		Queue<Integer> test3 = new LinkedList<Integer>();
		
		test3.offer(47);
		test3.offer(1);
		test3.offer(61);
		test3.offer(5);
		test3.offer(53);
		test3.offer(11);
		test3.offer(39);
		test3.offer(33);
		test3.offer(17);
		test3.offer(1);
		
		System.out.println("\n\nTest 3\n----------------------------\n" + test3);

		out = ef.putEvensFirst(test3);
		
		System.out.println(out);
		
		//test 4
		
		Queue<Integer> test4 = new LinkedList<Integer>();
		
		test4.offer(2);
		test4.offer(4);
		test4.offer(6);
		test4.offer(1);
		test4.offer(3);
		test4.offer(15);
		test4.offer(9);
		test4.offer(8);
		test4.offer(10);
		test4.offer(12);
		
		System.out.println("\n\nTest 4\n----------------------------\n" + test4);

		out = ef.putEvensFirst(test4);
		
		System.out.println(out);
		
	}
}
