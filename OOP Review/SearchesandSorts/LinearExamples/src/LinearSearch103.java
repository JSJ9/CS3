import java.util.Arrays;

public class LinearSearch103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Linear (aka sequential) search with objects
		
		Comparable[] list = {"Vincent", "Ty", "Ravi", "Teja", "Rayyon", "Leia"};
		
		int loc = -1;
		String key = "Teja";
		
		System.out.println("Elements checked: ");
		
		for(int i = 0; i < list.length; i++)
		{
			System.out.print(list[i] + " ");
			
			if(list[i].compareTo(key) == 0) //compareto returns positive comes after, negative comes before, 0 is equals
			{
				loc = i;
				break; //ends loop entirely
				//continue; ends the current iteration of the loop and moves to the next iteration
			}
		}

		System.out.println("\n\n" + Arrays.toString(list));
		
		if(loc != -1)
			System.out.println("\nThe array contains " + key + " at index " + loc + "\n");
		else
			System.out.println("\nThe array does not contain " + key + "\n");

	}

}
