/**
 * The ItemOrder class takes care of the get methods for items.
 * @author jimenez, janine
 *
 */

public class ItemOrder
{
	//item variable
	private Item item;
	//number of items
	private int qty;

	/**
	 * instantiates the instance variables item and qty with param item and qty
	 * @param item 	-	item object from the Item class
	 * @param qty	-	number of items
	 */
	public ItemOrder(Item item, int qty) {
		this.item = item;
		this.qty = qty;
	}
	
	/**
	 * @return the price of the item if one orders a certain qty for it
	 */
	public double getPrice() {
		return item.priceFor(qty);
	}
	
	/**
	 * @return current Item
	 */
	public Item getItem() {
		return item;
	}
	
	/**
	 * returns a true/false statement if the current item matches the object parameter
	 */
	@Override
	public boolean equals(Object obj) {
		ItemOrder second = (ItemOrder) obj;
		return this.item.equals(second.item);
	}

}