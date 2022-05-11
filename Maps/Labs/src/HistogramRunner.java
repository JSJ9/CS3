import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class HistogramRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		
		Scanner scan = new Scanner(new File("histogram.dat"));
		
		while(scan.hasNextLine())
		{
			Histogram h = new Histogram(scan.nextLine());
			System.out.println(h);
		}
	}
}