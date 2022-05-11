import java.util.Arrays;

public class BinarySearch102 {

	public static void main(String[] args) {
		// Binary search with objects

		Comparable[] list = {"Vincent", "Ty", "Ravi", "Teja", "Rayyon", "Leia"};
		
		System.out.println("Unsorted array: " + Arrays.toString(list));
		
		Arrays.sort(list);
		
		System.out.println("Sorted array: " + Arrays.toString(list) + "\n");
		
		
		String key = "Vincent";
		int loc = -1;
		int min = 0;
		int max = list.length-1;
		
		System.out.println("Elements checked: ");
		
		while(min <= max) {
			int mean = (min + max) / 2;
			
			System.out.print(list[mean] + " ");
			
			if(list[mean].compareTo(key) == 0)
			{
				loc = mean;
				break;
			}
			else
			{
				if(list[mean].compareTo(key) > 0)
					max = mean - 1;
				else
					min = mean + 1;
			}
		}
		
		if(loc != -1)
			System.out.println("\nThe array contains " + key + " at index " + loc + "\n");
		else
			System.out.println("\nThe array does not contain " + key + "\n");

			
	}

}
