import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OddRunner
{
	public static void main(String[] args) throws IOException
	{
		// test cases
		Scanner fileIn = new Scanner(new File("oddeven.dat"));

		while (fileIn.hasNextLine())
		{
			String input = fileIn.nextLine();
			OddEvenSets s = new OddEvenSets(input);
		}

	}
}
