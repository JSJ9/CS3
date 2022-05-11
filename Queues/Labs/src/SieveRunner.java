import java.util.LinkedList;
import java.util.Queue;

public class SieveRunner
{
	public static void main(String[] args)
	{
		System.out.println("Sieve of Eratosthenes");
		
		SieveOfEratos s = new SieveOfEratos();
		
		Queue<Integer> out = s.getPrimes(121);
		
		System.out.println("\nTest 1 121 \n---------------------------\n" + out);
		
		out = s.getPrimes(10);
		
		System.out.println("\nTest 2 10 \n---------------------------\n" + out);
		
		out = s.getPrimes(69);
		
		System.out.println("\nTest 3 69\n---------------------------\n" + out);

	}
}
