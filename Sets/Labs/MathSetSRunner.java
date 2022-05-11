import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MathSetSRunner
{
	public static void main(String[] args) throws IOException
	{
		//add test cases
		Scanner fileIn = new Scanner(new File("mathsetdata.dat"));
		int count = 0;
		
		while(fileIn.hasNextLine())
		{
			count++;
			System.out.println("TEST #" + count);
			System.out.println("----------------------------------------------------");
			String one = fileIn.nextLine();
			String two = fileIn.nextLine();
			MathSet m = new MathSet(one, two);
			
			System.out.println(m.toString());
//			System.out.println();
			System.out.println("union          - " + m.union());
			System.out.println("intersection   - " + m.intersection());
			System.out.println("difference A-B - " + m.differenceAMinusB());
			System.out.println("difference B-A - " + m.differenceBMinusA());
			System.out.println("symmetric difference " + m.symmetricDifference());
			System.out.println("\n");
		}
		
		
	}
}
