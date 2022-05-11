
//Closed hash
public class HashTable101 {
	public static void main(String[] args) {
		Object[] hashTable = new Object[10]; 
		
		Character c = '1';
		System.out.println("hashCode for 'c': " + c.hashCode());
		hashTable[c.hashCode()%10] = c; //49 % 10 == 9
		
		Character d = 'A';
		hashTable[d.hashCode()%10] = d; //65 % 10 == 5
		
		Integer num = 113;
		hashTable[num.hashCode()%10] = num; //113 % 10 == 3
		
		String s = "e";
		hashTable[s.hashCode()%10] = s; //101 % 10 == 1
		
		System.out.println("\nHash Table: ");
		int indx = 0;
		for(Object thing : hashTable)
		{
			System.out.println("index: " + indx++ + ": " + thing);
		}


	}
}
