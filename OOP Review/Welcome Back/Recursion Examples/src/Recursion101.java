
public class Recursion101
{
	
//	private static int j = 0;
	
	//Iterative count
	public static void count1() {
		for(int k = 1; k <= 50; k++) {
			 System.out.print(k + " ");
		}
	}
	
	//Recursive count
	//ALWAYS NEED A BASE CASE
	public static void count2(int j)
	{
//		Solution using an instance variable
		//int j = 0;
//		
//		j++;
//		System.out.print(j + " ");
//		
//		if(j < 50) //Base case - exit condition :: used to terminate recursive calls
//			count2();
		
		j++;
		System.out.print(j + " ");
		
		if(j < 50)
			count2(j);
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub 
		
		System.out.println("Calling iterative method:: " );
		count1();

		System.out.println("\n\nCalling recursive method:: " );
		count2(0);
	}
	
	

}
