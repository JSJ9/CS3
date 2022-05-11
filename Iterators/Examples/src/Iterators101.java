import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Iterators101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<Integer>();
		List<Double> list2 = new LinkedList<Double>();
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Double> set2 = new TreeSet<Double>();
		
		// ArrayList fill 10 Integers [1..10]
		
		for(int i = 0; i < 10; i++)
			list1.add((int) (Math.random() * 10) + 1);
		
		// LinkedList fill 10 Doubles [0.0 .. 0.99]
		for(int i = 0; i < 10; i++)
			list2.add((int) (Math.random() * 100) / 100.00);
		
		// HashSet fill 10 Integers [2..12] (As long as there are no duplicates)
		for(int i = 0; i < 10; i++)
			set1.add((int) (Math.random() * 11) + 2);
		
		// TreeSet fill 10 Doubles [1.0 .. 1.99](As long as there are no duplicates)
		for(int i = 0; i < 10; i++)
			set2.add(((int) (Math.random() * 100) / 100.00) + 1);
		
		Iterator<Integer> here1 = list1.iterator(); //Arraylist iterator
		Iterator<Double> here2 = list2.iterator(); //Linkedlist Iterator
		Iterator<Integer> here3 = set1.iterator();
		Iterator<Double> here4 = set2.iterator();
		
		System.out.println("ArrayList: ");
		while(here1.hasNext()) 
		{
			System.out.print(here1.next() + " ");
		}
		
		System.out.println("\n\nLinkedList: ");
		while(here2.hasNext()) 
		{
			System.out.print(here2.next() + " ");
		}
		
		System.out.println("\n\nHashSet: ");
		while(here3.hasNext()) 
		{
			System.out.print(here3.next() + " ");
		}
		
		System.out.println("\n\nTreeSet: ");
		while(here4.hasNext()) 
		{
			System.out.print(here4.next() + " ");
		}

	}

}
