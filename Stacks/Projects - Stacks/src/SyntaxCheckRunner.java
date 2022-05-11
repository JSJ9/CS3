import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SyntaxCheckRunner
{
	public static void main ( String[] args ) throws IOException
	{
		//add test cases		
		
		Scanner file = new Scanner(new File("sc.dat"));
		int count = 0;
		while(file.hasNextLine()) 
		{
			String test = file.nextLine();
			System.out.println("Test case " + ++count + " - " + test + " \n------------------------------------------");
			SyntaxChecker sc = new SyntaxChecker(test);
			System.out.println(sc.toString() + "\n\n");
			
		}
		
		
	}
}