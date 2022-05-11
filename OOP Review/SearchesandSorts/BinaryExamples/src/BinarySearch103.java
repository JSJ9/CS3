import java.util.Arrays;

public class BinarySearch103 
{
	public static void main(String[] args) {
		// Binary search with objects

		int[] nums = {3, 2, 6, 8, 5, 7};
		
		Arrays.sort(nums);
		System.out.println("Sorted array:: " + Arrays.toString(nums));
		int index = Arrays.binarySearch(nums, 4);
		
		if(index > -1)
			System.out.println("The item is at index: " + index);
		else
		{
			System.out.println("The item is not in the array.");
			System.out.println("The item should be placed at index " + Math.abs(index + 1));
		}

			
	}
}
