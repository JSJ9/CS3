import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordChainRunnerHome 
{
	public static void main(String[] args) throws IOException 
	{
		
		Scanner scan = new Scanner(new File("input.txt"));
		
		while(scan.hasNextLine())
		{
			String first = scan.next();
			String second = scan.next();
			
			WordChainHome wc = new WordChainHome(first, second);
			
			if(wc.isInDict(first) && wc.isInDict(second) && first.length() == second.length()) 
			{
				System.out.println(wc.findStack());
			}
			else
				System.out.println("There is no ladder between " + first + " and " + second);
			
		}
		
	}
}