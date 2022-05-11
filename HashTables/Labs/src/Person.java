import java.util.Scanner;

public class Person {
	private String first, last;
	
	public Person()
	{
		first = "";
		last = "";
	}
	
	public Person(String n)
	{
		Scanner scan = new Scanner(n);
		first = scan.next();
		last = scan.next();
		
	}
	
	/**
	 * idk here is a hash code method i came up with
	 * Have fun
	 */
	@Override
	public int hashCode()
	{
		int f1 = first.charAt(0);
		int f2 = first.charAt(first.length()-1);
		int l1 = last.charAt(0);
		int l2 = last.charAt(last.length()-1);
		
		return f1 + f2 + l1 + l2;
	}
	
	@Override
	public boolean equals(Object other)
	{
		Person temp = (Person) other;
		
		return first.equals(temp.first) && last.equals(temp.last) && this.hashCode() == temp.hashCode();
	}
}
