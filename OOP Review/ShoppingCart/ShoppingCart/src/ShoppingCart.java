import java.util.ArrayList;

//TODO FIX THE ORDER SO THAT IT CHANGES when new value inputed

public class ShoppingCart
{
	//list that contains item orders
	private ArrayList<ItemOrder> list;
	
	/**
	 * Creates a new list
	 */
	public ShoppingCart() 
	{
		this.list = new ArrayList<ItemOrder>();
	}
	
	/**
	 * adds a new order if the param value does not exist
	 * @param newOrder - ItemOrder being added to the list
	 */
	public void add(ItemOrder newOrder)
	{
		if(this.list.contains(newOrder))
			this.list.remove(newOrder);
		this.list.add(newOrder);
	}
	
	/**
	 * Adds all of the values in the list together
	 * @return the sum of all values in the list
	 */
	public double getTotal() {
		double total = 0;
		
		for(int i = 0; i < this.list.size(); i++)
		{
			total += this.list.get(i).getPrice();
		}
		
		return total;
	}

}