import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Maps101 {
	public static void main(String[] args) {
		Map<Integer, String> mapOne = new TreeMap<Integer, String>();
		
		mapOne.put(1, "Zavier");
		mapOne.put(11, "Ty");
		mapOne.put(8, "Arjun");
		mapOne.put(3, "Ricky");
		mapOne.put(5, "Teja");
		System.out.println("Map One: " + mapOne);
		
		System.out.println("\n");
		
		System.out.println("Element at 1: " + mapOne.get(1));
		System.out.println("Element at 5: " + mapOne.get(5));

		//Does not throw index out o bounds exception (returns null)
		System.out.println("Element at 2: " + mapOne.get(2));
		System.out.println("Element at 99: " + mapOne.get(99));

		System.out.println("\n");

		//.put() returns element value that was at key previously
		System.out.println(mapOne.put(2, "Ravi"));
		System.out.println(mapOne.put(3, "Oscar"));
		
		System.out.println("Map One: " + mapOne);
		
		System.out.println("\n*******************************************************\n");
		
		Map<Integer, String> mapTwo = new HashMap<Integer, String>();
		
		mapTwo.put(1, "Zavier");
		mapTwo.put(11, "Ty");
		mapTwo.put(8, "Arjun");
		mapTwo.put(3, "Ricky");
		mapTwo.put(5, "Teja");
		System.out.println("Map Two: " + mapTwo);
		
		System.out.println("\n");
		
		System.out.println("Element at 1: " + mapTwo.get(1));
		System.out.println("Element at 5: " + mapTwo.get(5));

		//Does not throw index out o bounds exception (returns null)
		System.out.println("Element at 2: " + mapTwo.get(2));
		System.out.println("Element at 99: " + mapTwo.get(99));

		System.out.println("\n");

		//.put() returns element value that was at key previously
		System.out.println(mapTwo.put(2, "Ravi"));
		System.out.println(mapTwo.put(3, "Oscar"));
		
		System.out.println("Map Two: " + mapTwo);

	}
}
