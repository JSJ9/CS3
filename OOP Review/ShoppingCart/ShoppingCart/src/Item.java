/**
 * The item class takes care of the name, pricing, bulk quantity and bulk pricing of the items in the catalog
 * @author jimenez, janine
 *
 */
public class Item
{
	//name of the item
	private String name;
	//price of the item
	private double price;
	//amount of product needed to get the bulkPrice
	private int bulkQty;
	//bulkPrice of bulk qty
	private double bulkPrice;
	
	/**
	 * Sets instance variable name and price to the parameter name and price
	 * @param name - 	name of product
	 * @param price -	price of product
	 */
	public Item(String name, double price) {
		this.name = name;
		if(price < 0)
			throw new IllegalArgumentException("error");
		this.price = price;
	}
	
	/**
	 * overloaded constructor, calls Item(name, price) and sets the instance var bulkQty and bulkPrice
	 * @param name 		-	name of the item
	 * @param price 	-	price of the item   
	 * @param bulkQty	-	amount of items that causes a discount
	 * @param bulkPrice -	price of the item when it is at the bulk quantity
	 */
	public Item(String name, double price, int bulkQty, double bulkPrice) {
		this(name, price);
		
		if(bulkQty < 0 || bulkPrice < 0)
			throw new IllegalArgumentException("error");
		else
		{
			this.bulkQty = bulkQty;
			this.bulkPrice = bulkPrice;
		}
	}
	
	/**
	 * calculates the price for a specified amount of product
	 * @param quantity -	the number of items
	 * @return the price for the quantity of items
	 */
	public double priceFor(int quantity) {
		if(quantity < 0)
			throw new IllegalArgumentException("error");
		else if(bulkQty != 0 && quantity >= bulkQty)
			return bulkPrice * quantity;
		else
			return price * quantity;
	}
	
	/**
	 * returns a boolean if the name of the current item matches the name of the object param
	 */
	@Override
	public boolean equals(Object obj) {
		Item second = (Item) obj;
		return this.name.equals(second.name);
	}
	
	@Override
	public String toString() {
		
		if(this.bulkPrice > 0)
			return name + ", $" + price + " (" + bulkQty + " for " + bulkPrice + ") ";
		else
			return name + ", $" + price;
	}
}