import java.util.Arrays;

public class SelectionSort101 {

	public static void main(String[] args) {
		// Selection sort with primitives
		
		int[] nums = new int[10];
		
		//fill the array with 10 rnadom ints [5...20] inclusive
		
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = (int) (Math.random() * 16) + 5;
		}
		
		//print array
		System.out.println("Unsorted Array:: " + Arrays.toString(nums));
		
		//selection sort
		
		for(int i = 0; i < nums.length-1; i++)
		{
			//find index of the smallest element
			int min = i;
			//check unsorted portion of array for smallest element
			for(int j = i+1; j < nums.length; j++)
			{
				if(nums[j] < nums[min])
					min = j; //new smallest number
			}
			
			if(min != i)
			{
				//swap: put smallest in position 'i' if not already in position 'i'
				int temp = nums[min];
				nums[min] = nums[i];
				nums[i] = temp;
			}
			
		}
		
		System.out.println("Sorted Array:: " + Arrays.toString(nums));


	}

}
