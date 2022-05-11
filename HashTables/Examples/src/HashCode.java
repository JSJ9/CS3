
public class HashCode {
	public static void main(String[] args) {

		//ascii value is hash code
		Character c = 'a';
		System.out.println(c.hashCode());
		
		c = '0';
		System.out.println(c.hashCode());
		
		c = 'A';
		System.out.println(c.hashCode() + "\n");
		
		//number itself is hash code
		Integer num = 45;
		System.out.println(num.hashCode());
		
		num = 101;
		System.out.println(num.hashCode());
		
		num = 69;
		System.out.println(num.hashCode() + "\n");
		
		String s = "a";
		System.out.println(s.hashCode());
		
		s = "ab";
		System.out.println(s.hashCode());
		
	}
}
