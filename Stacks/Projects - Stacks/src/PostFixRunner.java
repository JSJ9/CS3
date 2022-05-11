import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PostFixRunner
{
	public static void main(String[] args) throws IOException
	{
		// test cases here you whore
		
		Scanner fileIn = new Scanner(new File("ps.dat"));
		int count = 1;
		while(fileIn.hasNextLine())
		{
			String test = fileIn.nextLine();
			
			System.out.println("Test case #" + count++ + "\n---------------------");
			PostFix ps = new PostFix(test);
			ps.setExpression(test);
			ps.solve();
			System.out.println(ps.toString() + "\n\n");
		}
	}
}
