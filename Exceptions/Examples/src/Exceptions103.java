import java.util.Scanner;

public class Exceptions103 {

	public static void main(String[] args) {
		Divide2 test = new Divide2();
		Scanner keyboard = new Scanner(System.in);
		String ans;

		do {
			test.getNumbers(); // get two numbers
			test.divide(); // calculate the quotient
			test.printResults(); // print the results
			
			//now it is the responsibility of the calling method, main, to handle the exception
			try
			{
				test.getNumbers(); // get two numbers
				test.divide(); // calculate the quotient
				test.printResults(); // print the results
			}catch(ArithmeticException e)
			{
				System.out.println("Tried to divide by 0 you dumbass");
			}

			System.out.print("Continue[Y/N]?");
			ans = keyboard.nextLine();
			System.out.println();
		} while (ans.equalsIgnoreCase("y"));
	}

	}

class Divide2 {
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

	/*
	 * Marking a method with the throws keyword instructs the JVM to pass any exceptions
	 * that occur within the method onto the calling method so they can be handled there.
	 */
	public void divide() throws ArithmeticException //ArithmeticException class includes divide by zero exception handling
	{
		// the default behavior for an exception is to exit the program and pop all
		// processes from the stack
		quotient = dividend / divisor;

//		try
//		{
//			quotient = dividend / divisor;
//		}
//		catch(ArithmeticException e)
//		{
//			//to override default behavior add output in the catch block
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

		try {
			if (divisor == 42) {
				throw new ArithmeticException("Tried to divide " + dividend + " by 42 you dork!");
			}
			quotient = dividend / divisor;
		} catch (ArithmeticException e) // Overrode the exiting program behavior
		{
			System.out.println(e.getMessage()); // getmessage gets the message at arithmetic exception
		}

	}

	public void printResults() {
		System.out.println(dividend + " / " + divisor + " = " + quotient);
		System.out.println();
	}
}
