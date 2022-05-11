import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zeckendorf
{
	public void zeck(String fileName) throws IOException
	{
		Scanner scan = new Scanner(new File("zeck.txt"));

		int cases = scan.nextInt();

		for (int i = 0; i < cases; i++)
		{
			int temp = scan.nextInt();
			System.out.print(temp + " = ");
			while (true)
			{
				if (temp == 0)
					break;
				fibNum(temp);
				fibList(temp);

				if (findFib(temp) > 0)
					System.out.print(findFib(temp) + " + ");
			}
		}
	}

	/**
	 * Generates the fibonacci sequence up to an integer
	 * 
	 * @param num - the max number
	 * @return it returns the fibonacci number itself
	 */
	public int fibNum(int num)
	{
		if (num <= 1)
			return num;
		else
			return fibNum(num - 1) + fibNum(num - 2);
	}

	/**
	 * Returns an array of a specified size that consists of the fibonacci sequence
	 * up to size
	 * 
	 * @param size the max size of the array
	 * @return arraylist of fibonacci sequence
	 */
	public ArrayList<Integer> fibList(int size)
	{

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < size / 2; i++)
		{
			if (fibNum(i) < size)
			{
				list.add(fibNum(i));
			}
		}

		return list;
	}

	/**
	 * Finds the greatest closest fibonacci number to the parameter number
	 * 
	 * @param num number that fibonacci refers to for comparison
	 * @return the largest, nearest fibonacci number to the parameter
	 */
	public int findFib(int num)
	{

		ArrayList<Integer> list = fibList(num);
		int max = 0;

		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i) < num && list.get(i) > max)
				max = list.get(i);
		}

		return max;
	}

}
