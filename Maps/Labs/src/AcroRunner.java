import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class AcroRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		Scanner scan = new Scanner(new File("acro.dat"));
		Acronyms a = new Acronyms();
		
		int cases = scan.nextInt();
		scan.nextLine();
		
		for(int i = 0; i < cases; i++)
		{
			a.putEntry(scan.nextLine());
		}
		
		System.out.println("==== \t MAP CONTENTS \t ====");
		System.out.println(a.toString());
		
		System.out.println("\n\n\n==== \t READ LINES \t ====");
		while(scan.hasNextLine())
		{
			System.out.println(a.convert(scan.nextLine()));
		}

	}
}