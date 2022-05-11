import java.util.Arrays;

public class LinearSearch101 
{
	public static void main(String[] args) {
		//Linear (aka sequential) search with primitives
		
		int[] nums = {3, 1, 4, 1, 5, 9};
		
		boolean found = false;
		int key = 4;
		System.out.println("Elements checked: ");
		
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + " ");
			
			if(nums[i] == key)
			{
				found = true;
				break; //ends loop entirely
				//continue; ends the current iteration of the loop and moves to the next iteration
			}
		}
		
		System.out.println("\n\n" + Arrays.toString(nums));
		
		if(found)
			System.out.println("\nThe array contains " + key + "\n");
		else
			System.out.println("\nThe array does not contain " + key + "n");

	}
}
