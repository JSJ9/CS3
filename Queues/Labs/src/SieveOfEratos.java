import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SieveOfEratos
{

	/**
	 * goes through a queue full of number starting on 2 to n. Looks to see if each value
	 * is prime and if it is, then it is added to the prime queue.
	 * @param n	- the number that we are getting primes from
	 * @return	- prime values that go up to n inclusively
	 */
	public Queue<Integer> getPrimes(int n)
	{

		if (n < 2)
			throw new IllegalArgumentException();
		else
		{
			Queue<Integer> numbers = new LinkedList<Integer>();
			Queue<Integer> primes = new LinkedList<Integer>();

			//populates the numbers queue
			for (int i = 2; i < n; i++)
			{
				numbers.offer(i);
			}

			do
			{
				//current number value from numbers
				Integer num = numbers.poll();
				//the value in nums is automatically a prime
				primes.offer(num);
				int size = numbers.size(); //size of the numbers queue

				for (int i = 0; i < size; i++)
				{
					int check = numbers.poll(); //takes the next value in the numbers queue

					if (check % num != 0) //checks if it is divisible by the prime number
					{
						numbers.offer(check); // if it is not divisible, it goes back to the numbers queue
					}

				}
			} while (!numbers.isEmpty()); //while there are stil values in the numbers stack

			return primes; //returns the queue full of the primes between 2 and n
		}

	}
}
