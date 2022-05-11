import java.util.Arrays;

public class InsertionSort102 {

	public static void main(String[] args) {
		// Insertion sort with primitives
		
		Comparable[] nums = new Comparable[10];
		
		//fill the array with 10 random ints [3...21] inclusive
		
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = (int) (Math.random() * 19) + 3;
		}
		System.out.println("Unsorted Array:: " + Arrays.toString(nums));
		                                                 
		//Insertion sort
		
		for(int i = 1; i < nums.length-1; i++) // i = first index of unsorted array
		{
			Comparable temp = nums[i];
			int j = i;
			while(j > 0 && nums[j - 1].compareTo(temp) > 0)
			{
				nums[j] = nums[j - 1]; //shift element to the right
				j--;
			}
			nums[j] = temp; //insert element in array at index j
		}
		
		System.out.println("Sorted Array:: " + Arrays.toString(nums));
		
	}

}
