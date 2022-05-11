import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class RelativesRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add more test cases
		Scanner scan = new Scanner(new File("relatives.dat"));
		Relatives r = new Relatives();
		int cases = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i < cases; i++)
		{
			String s = scan.nextLine();
			r.setPersonRelative(s);
		}
		
		System.out.println(r.getRelatives("Almas"));
		System.out.println(r.getRelatives("Bob"));
		System.out.println(r.getRelatives("Dot"));
		System.out.println(r.getRelatives("Elton"));
		System.out.println(r.getRelatives("Fred"));
		System.out.println(r.getRelatives("Jim"));
		System.out.println(r.getRelatives("Timmy"));
		
		
	}
}