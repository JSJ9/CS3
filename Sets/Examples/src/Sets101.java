import java.util.Set;
import java.util.TreeSet;


public class Sets101 {
	
	//Set one = [3, 6, 5, 9]
	//Set two = [7, 9. 1. 6]

	public static void main(String[] args) {
		Set<Integer> setOne = new TreeSet<Integer>();
		setOne.add(3);
		setOne.add(6);
		setOne.add(5);
		setOne.add(9);
		System.out.println("Set One:: " + setOne); //no need for a print method
		//orders values for you
		
		Set<Integer> setTwo = new TreeSet<Integer>();
		setTwo.add(7);
		setTwo.add(9);
		setTwo.add(1);
		setTwo.add(6);
		System.out.println("Set Two:: " + setTwo); //no need for a print method
		
		//setThree = setOne U setTwo
		Set<Integer> setThree = new TreeSet<Integer>();
		setThree.addAll(setOne);
		setThree.addAll(setTwo);
		System.out.println("Set Three (Union):: " + setThree); //setUnion no repeat
		
		
		//setThree = setOne n setTwo
		setThree.clear(); //clears everything in the set
		setThree.addAll(setOne);
		setThree.retainAll(setTwo); // retainAll does an intersection when adding new elements
		System.out.println("Set Three (Intersection) :: " + setThree);  //set intersection (common elements)
		
		//setThree = setOne - setTwo
		setThree.clear();
		setThree.addAll(setOne);
		setThree.removeAll(setTwo); //Difference / relative complement
		System.out.println("Set Three (Difference / relative complement) :: " + setThree);  //set difference (common elements removed)

		
		
		
	}
}
