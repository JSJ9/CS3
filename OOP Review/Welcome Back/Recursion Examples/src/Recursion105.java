/**
 * This program demonstrates a linear search of a sorted array
 * both iteratively and recursively
 * @author jj10094856
 *
 */
public class Recursion105
{
	
	/**
	 * This populates the list given
	 * @param list
	 */
	public static void assign(int[] list)
	{
		for(int i = 0; i < list.length; i++)
			list[i] = 100 + i * 5;
		
	}
	
	/**
	 * Displays the numbers in the list
	 * @param list
	 */
	public static void display(int[] list)
	{
		for(int num : list)
			System.out.print(num + " ");
	}
	
	/**
	 * Iterative Linear Search
	 * @param list array to be searched
	 * @param key value to be found
	 * @return index if found, -1 if not
	 */
	public static int linear1(int[] list, int key)
	{
		for(int i = 0; i < list.length; i++)
		{
			if(list[i] == key)
				return i;
		}
		
		return -1;
	}
	
	/**
	 * Recursive linear search
	 * @param list	list to be searched
	 * @param key	number to be found
	 * @param i		current index
	 * @return		index where key is located in list if found, -1 if not found
	 */
	public static int linear2(int list[], int key, int i)
	{
		if(i == list.length)
			return -1;
		if(list[i] == key)
			return i;
		else
			return linear2(list, key, i+1);
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int list[] = new int[100];
		assign(list);
		display(list);
		
		System.out.println("\n\nCalling Iterative Linear Search Method");
		System.out.println("420 is located at index " + linear1(list, 420));
		System.out.println("311 is located at index " + linear1(list, 311));
		
		System.out.println("\n\nCalling Recursive Linear Search Method");
		System.out.println("105 is located at index " + linear2(list, 105, 0));
		System.out.println("420 is located at index " + linear2(list, 420, 0));
		System.out.println("69 is located at index " + linear2(list, 69, 0));

	}

}
