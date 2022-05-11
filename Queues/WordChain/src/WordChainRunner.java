import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class WordChainRunner 
{
	public static void main(String[] args) throws IOException 
	{
		
//		Scanner scan = new Scanner(new File("input.txt"));
//		
//		while(scan.hasNextLine())
//		{
//			String first = scan.next();
//			String second = scan.next();
//			
//			WordChain wc = new WordChain(first, second);
//			
//			if(wc.isInDict(first) && wc.isInDict(second))
//			{
//				
//			}
//			else
//				System.out.println("There is no ladder between " + first + " and " + second);
//			
//		}
		
		WordChain wc = new WordChain("dear", "fear");
		
		wc.areWeDoneYetOrReachedTheEndOfThisComplicatedProgramGameToy();
		
		
	}
}
