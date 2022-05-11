import java.util.Arrays;

public class BinarySearch101 {

	public static void main(String[] args) {
		// Binary search with primitives
		
		int[] nums = {3, 1, 4, 1, 5, 9};
		
		System.out.println("Unsorted array: " + Arrays.toString(nums));
		
		Arrays.sort(nums);
		
		System.out.println("Sorted array: " + Arrays.toString(nums) + "\n");
		
		int key = 69;
		int loc = -1;
		int min = 0;
		int max = nums.length-1;
		
		System.out.println("Elements checked: ");
		
		while(min <= max) {
			int mean = (min + max) / 2;
			
			System.out.print(nums[mean] + " ");
			
			if(nums[mean] == key)
			{
				loc = mean;
				break;
			}
			else
			{
				if(key < nums[mean])
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
