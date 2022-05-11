
public class Word
{
	private String theValue;
	
	//write a constructor
	public Word(Object v)
	{
		theValue = (String)v;
	}
	
	//write the getValue method
	/**
	 * @return String value of theValue
	 */
	public String getValue()
	{
		return theValue;
	}
	
	
	//write the equals method
	/**
	 * returns if the this.theValue == the other object theValue
	 */
	public boolean equals(Object s)
	{
		Word m = (Word)s;
		return theValue.equals(m.theValue);
	}
	
	//write the hashCode method
	/**
	 * returns the hashCode of the string theValue
	 */
	public int hashCode()
	{
		int v = 0;
		int size = theValue.length();
		String vow = "AEIOUaeiou";
		for(int i = 0; i < size; i++)
		{
			for(int x = 0; x < vow.length(); x++)
			{
				if(theValue.charAt(i) == vow.charAt(x))
					v++;
			}
		}
		
		return (v * size) % 10;
	}
	
	
	//write the toString method
	/**
	 * returns the value
	 */
	@Override
	public String toString()
	{
		return theValue + " ";
	}
	
}