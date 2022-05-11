import java.util.Arrays;

public class Part implements Comparable<Part>
{
	// make - brand of the vehicle
	// model - car product
	// rest - rest of the string input
	private String make, model, rest;
	private int year;

	/**
	 * Initializes the strings into default values.
	 */
	public Part()
	{
		make = "";
		model = "";
		rest = "";
		year = 0;
	}
	
	/**
	 * Instantiates the strings and then sets those strings to their corresponding
	 * value in the line paramater
	 * @param line	- the line that contains the make, model, year, and rest
	 */
	public Part(String line)
	{
		this();
		
		String[] list = line.split(" ");

		year = Integer.parseInt(list[list.length-1]);
		rest = list[list.length-4];
		make = list[list.length-3] + " " + list[list.length-2];
		
		for(int i = 0; i < list.length; i++)
		{
			if(list[i].matches("\\d+"))
			{
				rest = list[i];
				break;
			}
			else
				model += list[i] + " ";
		}

	}

	//have to have compareTo if implements Comparable
	public int compareTo( Part rhs )
	{
		if(helpMe(rhs))
			return 0;
		else if(this.make.compareTo(rhs.make) < 0)
			return -1;
		else if(this.make.compareTo(rhs.make) > 0)
			return 1;
		else if(this.model.compareTo(rhs.model) < 0)
			return -1;
		else if(this.model.compareTo(rhs.model) > 0)
			return 1;
		else if(this.year < rhs.year)
			return -1;
		else
			return 1;
	}
	
	/**
	 * Checks to see if the make, model and year are equal
	 * @param rhs	- the other part parameter
	 * @return		- true if they are all equal, false if otherwise
	 */
	public boolean helpMe(Part rhs)
	{
		return this.make.compareTo(rhs.make) == 0 && this.model.compareTo(rhs.model) == 0 &&
			   this.year == rhs.year;
	}
	
	/*
	 * prints out the string instance variables.
	 */
	@Override
	public String toString()
	{
		return make + " " + year + "  " + model + " " + rest;
	}
}