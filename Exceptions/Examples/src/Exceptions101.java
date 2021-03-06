import java.util.Scanner;



public class Exceptions101 {

	public static void main(String[] args) {
		Divide test = new Divide();
		Scanner keyboard = new Scanner(System.in);
		String ans;

		do {
			test.getNumbers(); // get two numbers
			test.divide(); // calculate the quotient
			test.printResults(); // print the results

			System.out.print("Continue[Y/N]?");
			ans = keyboard.nextLine();
			System.out.println();
		} while (ans.equalsIgnoreCase("y"));
	}
}

class Divide {
	private int dividend;
	private int divisor;
	private int quotient;

	public void getNumbers() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the Dividend-->");
		dividend = keyboard.nextInt();
		System.out.print("Enter the Divisor-->");
		divisor = keyboard.nextInt();
		System.out.println();
	}

	public void divide() 
	{
		//the default behavior for an exception is to exit the program and pop all processes from the stack
		quotient = dividend / divisor;
		
//		try
//		{
//			quotient = dividend / divisor;
//		}
//		catch(ArithmeticException e)
//		{
//			//to override default behavior add output in the ctach block
//			System.out.println("**You are so dumb why did you divide by zero, that is incorrect.***");
//		}
		
		// this code will throw an exception when dividing by 42 just as it 
		// automatically did when dividing an int by 0
//		if(divisor == 42)
//		{
//			throw new ArithmeticException();
//		}
		
//		if(divisor == 42)
//		{
//			throw new ArithmeticException("Tried to divide " + dividend + " by 42 you dork!");
//		}
		
		try
		{
			if(divisor == 42)
			{
				throw new ArithmeticException("Tried to divide " + dividend + " by 42 you dork!");
			}
			quotient = dividend / divisor;
		}
		catch(ArithmeticException e) //Overrode the exiting program behavior
		{
			System.out.println(e.getMessage()); // get message gets the message at arithmetic exception
		}
		
		
	}

	public void printResults()
    {
       System.out.println(dividend + " / " + divisor + " = " +  quotient);
       System.out.println();
    }
}