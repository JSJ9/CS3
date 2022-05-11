/**
 * basic and get methods. Adds items to the arraylist
 */

import java.util.ArrayList;

public class Catalog
{
	//Instance variable name that will contain the name of the item in the catalog
	private String name; 
	//List that will contain Item objects only. Items that are featured in the catalog will be here
	private ArrayList<Item> list;
	
	/**
	 * sets name variable to name and creates a new arraylist that contains Item objects
	 * @param name -	name of the item
	 */
	public Catalog(String name) {
		name = name;
		list = new ArrayList<Item>();
	}
	
	/**
	 * adds the item parameter into the arraylist
	 * @param item -	item object
	 */
	public void add(Item item) {
		list.add(item);
	}
	
	/**
	 * @return the size of the current arraylist
	 */
	public int size() {
		return list.size();
	}
	
	/**
	 * gets the item at a specified index
	 * @param index -	the index in the arraylist that we want to get
	 * @return the value in the arraylist at that index
	 */
	public Item get(int index) {
		return list.get(index);
	}
	
	/**
	 * 
	 * @return the instance variable, name
	 */
	public String getName() {
		return name;
	}
}