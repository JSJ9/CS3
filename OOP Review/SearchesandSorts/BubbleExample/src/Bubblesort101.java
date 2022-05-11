import java.util.Arrays;

public class Bubblesort101 {

	public static void main(String[] args) {
		// Bubble sort with primitives
		
		int[] nums = new int[10];
		
		//fill array with 10 random ints [2...11] inclusive
		
		
		for(int i = 0; i < nums.length; i++)
			nums[i] = (int) (Math.random() * 10) + 2;
		
		//Print Array
		System.out.println("Unsorted Array:: " + Arrays.toString(nums));

		//bubble sort
		int count = 0;
		
		do {
			count = 0;
			for(int i = 0; i <  nums.length-1; i++)
			{
				if(nums[i] > nums[i+1])
				{
					swap(nums, i, i+1);
					count++;
				}
			}
		}while(count > 0);
		
		System.out.println("Sorted Array:: " + Arrays.toString(nums));

	}

	
	private static void swap(int nums[], int pos1, int pos2) {
		int temp = nums[pos1];
		nums[pos1] = nums[pos2];
		nums[pos2] = temp;
	}
}
