import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * All exceptions ultimately derive from the Throwable class. The immediate
 * subclasses of throwable are error and exception.
 * 
 * Common Exceptions are IOExceptions and RunTimeException (Input Output)
 * IOExceptions are used for exceptions beyond your control. (e.g. the disk is
 * full)
 * 
 * RunTimeExceptions indicate programmer error (e.g. you tried to write past the
 * end of an array)
 */

public class Exceptions102 {

	/*
	 * IOExceptions are considered as "check exceptions."
	 * "Checked" refers to the fact that the compiler will check to ensure that the 
	 *  exception are caught. Checked exceptions are not monitored by a try/catch block.
	 *  
	 *  
	 *  you must mark your method to indicate that it throws this exception
	 */
	
	public static void readFile1() throws IOException
	{
		File file = new File("yourmom.txt");
		Scanner scan = new Scanner(file);
	}
	
	public static void readFile2() {
		try
		{
			File file = new File("yourmom.txt");
			Scanner scan = new Scanner(file);
		}catch(IOException e) //type of exception that will be passed to it
		{
			System.out.println("Why apologies, there hath not be a document m'lady");
		}
	}
	
	//Any method that shares the stack with an IOException(Checked) must indicate that it throws this exception
	public static void main(String[] args) //throws IOException
	{
		// TODO Auto-generated method stub
		
		//readFile1(); 
		readFile2();

	}

}
