import static java.lang.System.out;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PartList
{
	private TreeMap<Part, Integer> partsMap; //map that contains parts, make, model, year, etc

	public PartList()
	{
		partsMap = new TreeMap<Part, Integer>();

	}

	public PartList(String fileName)
	{
		this();
		try
		{
			//add code here to read from the file
			//and add Parts to the map
			Scanner scan = new Scanner(new File(fileName));
//			scan.next();
			while(scan.hasNext())
			{
				Part temp = new Part(scan.nextLine());
//				System.out.println(temp);
				if(!partsMap.containsKey(temp))
					partsMap.put(temp, 1);
				else
					partsMap.put(temp, partsMap.get(temp) + 1);

			}

		}
		catch( IOException e )  //Most specific exceptions must be listed 1st
		{
			out.println(e);
		}
		catch( RuntimeException e )
		{
			out.println(e);
		}
		catch( Exception e )
		{
			out.println(e);
		}
		finally
		{
			//no code needed here
		}
	}

	public String toString()
	{
		String output="";

		Set<Part> keys = partsMap.keySet();
		
		for(Part x : keys)
		{
			System.out.print(x.toString() + " - ");
			System.out.print(partsMap.get(x) + "\n");
		}
		return output;
	}
}