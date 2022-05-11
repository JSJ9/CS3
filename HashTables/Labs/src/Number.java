
public class Number
{
	private int theValue; // integer value
	
	/**
	 * instaiates and sets value
	 * @param value	- the new value we set
	 */
	public Number(int value)
	{
		theValue = value;

	}	
	
	/**
	 * @return	- theValue instance var
	 */
	public int getValue()
	{
		return theValue;
	}
	
	/**
	 * checks if object theValue's are equal
	 */
	public boolean equals(Object obj)
	{
		Number s = (Number) obj;
		
		return this.theValue == s.theValue;
	} 
	
	/**
	 * returns integer theValue
	 */
	public int hashCode()
	{
		return theValue;
	}

	/**
	 * prints out the value
	 */
	public String toString()
	{
		return theValue + "";
	}	
}