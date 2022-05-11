
public class PhoneNumber {
	private String number; // the number with
	
	public PhoneNumber()
	{
		number = "";
	}
	
	public PhoneNumber(String n)
	{
		number = n;
	}
	
	public int hashCode()
	{
		return Integer.parseInt(number.substring(number.indexOf("-")));
	}
	
	public boolean equals(Object other)
	{
		PhoneNumber n = (PhoneNumber) other;
		
		return this.number.equals(n.number) && this.hashCode() == n.hashCode();
	}
}
