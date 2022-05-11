import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zeckendorf
{
	
	//Main method - runs everything
	public static void main(String[] args) throws IOException
	{
		Zeckendorf zeck = new Zeckendorf();
		zeck.zeck("zeck.txt");
	}
	
	/**
	 * Prints the Zeckendorf representation for the number
	 * specified in fileName
	 * @param fileName the file that the method will read from
	 * @throws IOException 
	 */
	public void zeck(String fileName) throws IOException
	{
		Scanner scan = new Scanner(new File(fileName));
		
		//number of cases to solve from the file given
		int cases = scan.nextInt();

		for (int i = 0; i < cases; i++)
		{
			//temporary integer value. Value is the current case we are solving.
			int temp = scan.nextInt();
			System.out.print(temp + " = ");
			
			while (true)
			{
				if (temp <= 1)
				{
					System.out.print(temp);
					break;
				}
				
				if(findFib(temp) == temp)
				{
					System.out.print(temp);
					break;
				}
				if (findFib(temp) > 0)
				{
					System.out.print(findFib(temp) + " + ");
					temp -= findFib(temp);
				}
			}
			
			System.out.println();
		}
	}

	/**
	 * Generates the fibonacci number at a specified position
	 * 
	 * @param num - number that defines the position of the sequence
	 * @return it returns the fibonacci number at specified position
	 */
	public int fibNum(int num)
	{
		if (num <= 1)
			return num;
		else
			return fibNum(num - 1) + fibNum(num - 2);
	}

	
	/**
	 * Creates an arraylist of fibonacci numbers that go up to (inclusively)
	 *  a specified num (number)
	 * 
	 * @param num the number that determines the max value the fib sequence can reach
	 * @return arraylist of fibonacci sequence that goes up to num inclusively
	 */
	public ArrayList<Integer> fibList(int num)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		//count is a control variable that keeps increasing as long as while is true (as long as the fibonacci number at position count is less than num)
		int count = 0;
		
		while(true) {
			if(fibNum(count) > num)
				break;
			
			list.add(fibNum(count));
			count++;
		}

		return list;
	}

	
	/**
	 * Finds the greatest closest fibonacci number to the parameter number
	 * 
	 * @param num -  number that fibonacci refers to for comparison
	 * @return the largest, nearest fibonacci number to the parameter
	 */
	public int findFib(int num)
	{
		//List contains fibonacci sequence that goes up to the specified number inclusively
		ArrayList<Integer> list = fibList(num);
		//the max possible number that is less than or equal to the integer num
		int max = 0;

		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i) <= num && list.get(i) > max)
				max = list.get(i);
		}

		return max;
	}

}