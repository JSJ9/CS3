
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;

public class HTWERunner
{
  public static void main ( String[] args )
  {
		try{
			//make a new table
			HashTableWordEdition t = new HashTableWordEdition();
			
			//read from the file
			Scanner scan = new Scanner(new File("words.dat"));
			int cases = scan.nextInt();
			//load stuff into the table			
			for(int i = 0; i < cases; i++)
			{
				t.add(scan.next());
			}
			//print out the table
			
			System.out.println(t.toString());
		}
		catch(Exception e)
		{
			System.out.println("Houston, we have a problem!");
		}
  }
}