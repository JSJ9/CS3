import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner scan = new Scanner(new File("spantoeng.dat"));
		SpanishToEnglish ste = new SpanishToEnglish();
		
		int size = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < size; i++)
		{
			ste.putEntry(scan.nextLine());
		}
		
		while(scan.hasNextLine())
		{
			System.out.println(ste.translate(scan.nextLine()));
		}
	}
}