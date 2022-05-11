
public class Enum102 {

	public static void main(String[] args) {
		
		Element arr[] = Element.values();
		
		//enum with loop
		for(Element col : arr)
		{
			//calling cordinal
			System.out.println(col + " at index " + col.ordinal());
		}
		
		//Calling valueOf
		//Returns an object of Element with given constant
		//Second line causes IllegalArgumentException
		System.out.println(Element.valueOf("FIRE"));
		System.out.println(Element.valueOf("LOVE"));
	}
}
